package com.example.lbdkafkaapp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic userTopic(){
        return TopicBuilder.name("userTopic")
                .build();
    }

    @Bean NewTopic articleTopic(){
        return TopicBuilder.name("articleTopic")
                .build();
    }

    @Bean NewTopic allTopic(){
        return TopicBuilder.name("allTopic")
                .build();
    }
}
