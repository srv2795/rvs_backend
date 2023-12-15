package com.example.example1;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "topic1",
            groupId = "ashu"
    )
    public void listeners(String data) {
        System.out.println("Listener received : "+ data + " yeah...");
    }
}
