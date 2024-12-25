package com.kafka.kafka_consumer.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class KafkaMessageListener {

//    @Value("${myapp.kafka.topic.name}")
//    private String topicName;


    @KafkaListener(topics = "#{@environment.getProperty('myapp.kafka.topic.name')}", groupId = "consumer-group")
    public void consumer1(String message){

        log.info("Consumer consumed the message {}", message);
    }

    @KafkaListener(topics = "#{@environment.getProperty('myapp.kafka.topic.name')}", groupId = "consumer-group")
    public void consumer2(String message){

        log.info("Consumer consumed the message {}", message);
    }

    @KafkaListener(topics = "#{@environment.getProperty('myapp.kafka.topic.name')}", groupId = "consumer-group")
    public void consumer3(String message){

        log.info("Consumer consumed the message {}", message);
    }
}
