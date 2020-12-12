package sbercloud.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    @Value("${kafka.consumer.topic}")
    private String kafkaConsumerTopic;

    @KafkaListener(topics = "${kafka.consumer.topic}", groupId = "${kafka.group.id}")
    void listener(String message) {
        log.info(message);
    }
}
