package com.example.lbdkafkaapp.Controllers;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public ArticleController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @RequestMapping("/api/article")
    @PostMapping
    public void updateArticle(){
        kafkaTemplate.send("articleTopic", "Article updated");
        kafkaTemplate.send("allTopic", "Article updated in all topic");

    }
}
