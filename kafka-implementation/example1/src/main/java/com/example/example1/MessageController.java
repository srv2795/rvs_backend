package com.example.example1;

import com.example.example1.controller.MesssageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/message")
public class MessageController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate1) {
        this.kafkaTemplate = kafkaTemplate1;
    }

    @PostMapping("/publish")
    public void publish(@RequestBody MesssageRequest request) {
        kafkaTemplate.send("topic1", request.message());
    }
}
