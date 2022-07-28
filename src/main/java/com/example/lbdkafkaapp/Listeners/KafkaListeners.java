package com.example.lbdkafkaapp.Listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics="userTopic",
            groupId = "groupId"
    )
    void userListener(String data){
        System.out.println("User listener executed: " + data);
    }

    @KafkaListener(
            topics = "articleTopic",
            groupId = "groupID"
    )
    void articleListener(String data){
        System.out.println("Article listener executed: "+data);
    }

    @KafkaListener(
            topics = "allTopic",
            groupId = "groupId"
    )
    void allListener(String data){
        System.out.println("All listener executed: "+data);
    }
}
