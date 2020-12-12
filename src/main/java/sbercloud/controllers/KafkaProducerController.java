package sbercloud.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sbercloud.config.KafkaProducer;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaProducerController {

    private final KafkaProducer kafkaProducer;

    @GetMapping("/publish")
    public void sendToKafka(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
    }
}
