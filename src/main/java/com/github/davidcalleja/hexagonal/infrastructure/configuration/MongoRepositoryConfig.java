package com.github.davidcalleja.hexagonal.infrastructure.configuration;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@Profile("mongo")
public class MongoRepositoryConfig {

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(
                new MongoClient("localhost"),
                "test"
        );
    }
}
