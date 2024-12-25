package com.kafka.kafka_producer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    // Inject the topic name from the configuration or environment
    @Value("${myapp.kafka.topic.name}")
    private String topicName;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public String sendToTopic(String message) {

        try {

            for (int i = 0; i < 100000; i++) {
                kafkaTemplate.send(topicName, message+" : "+i);
            }
        } catch (Exception ex) {

            return "Message couldn't sent to topic : " + topicName + " , due to :" + ex.getMessage();
        }
        return "Message successfully sent to topic!!!!!!";
    }
}
