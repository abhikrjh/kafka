package com.kafka.kafka_producer.controller;

import com.kafka.kafka_producer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/kafka")
public class MessageProducerController {

    private final KafkaProducerService service;

    public MessageProducerController(KafkaProducerService service) {
        this.service = service;
    }

    @PostMapping("/publish/{message}")
    private String publishMessage(@PathVariable String message) {

        return service.sendToTopic(message);
    }
}
