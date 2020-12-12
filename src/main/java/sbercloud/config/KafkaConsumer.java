package sbercloud.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.security.core.session.SessionRegistry;
import sbercloud.models.User;
import sbercloud.models.UserRepository;

import java.util.Arrays;
import java.util.List;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final String USERNAME = "username";

    private final IAuthenticationFacade authenticationFacade;

    private final SessionRegistry sessionRegistry;

    private final UserRepository userRepository;

    @Value("${kafka.consumer.topic}")
    private String kafkaConsumerTopic;

    @KafkaListener(topics = "${kafka.consumer.topic}", groupId = "${kafka.group.id}")
    void listener(String message) {
        log.info("Got message: " + message);
        List<String> params = Arrays.asList(message.split(","));
        int steps = 0;
        int cardio = 0;
        String temp = null;
        for (String param:
             params) {
            temp = param.split("=")[0];
            if (temp.equals("steps"))
                steps = Integer.parseInt(param.split("=")[1]);
            if (temp.equals("cardio"))
                steps = Integer.parseInt(param.split("=")[1]);
        }
        User current = userRepository.findByUsername("lliza");
        current.setEnergy((int) (current.getEnergy() + 0.9 * steps));
        userRepository.save(current);
    }
}
