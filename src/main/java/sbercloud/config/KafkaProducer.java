package sbercloud.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import sbercloud.models.Message;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {

    @Value("${kafka.producer.topic}")
    private String TOPIC;

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String message) {
        log.info(String.format("Producing message ----> %s", message));
        kafkaTemplate.send(TOPIC, message);
    }
}
