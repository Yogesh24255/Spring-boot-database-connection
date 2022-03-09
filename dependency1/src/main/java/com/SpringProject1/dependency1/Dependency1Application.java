package com.SpringProject1.dependency1;

import com.SpringProject1.dependency1.dto.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
public class Dependency1Application {

    public static void main(String[] args) {
        SpringApplication.run(Dependency1Application.class, args);
    }}
