package com.SpringProject1.dependency1.Config;

import com.SpringProject1.dependency1.dto.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class ApplicationConfig {
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        JedisConnectionFactory jedisConFactory = new JedisConnectionFactory ();
        jedisConFactory.setHostName ("localhost");
        jedisConFactory.setPort (6379);
        return jedisConFactory;
    }

    @Bean
    public RedisTemplate<String,Student> redisTemplate() {
        RedisTemplate<String,Student>template = new RedisTemplate<String, Student> ();
        template.setConnectionFactory (jedisConnectionFactory());
        template.setKeySerializer (new StringRedisSerializer ());
        return template;
    }


}


