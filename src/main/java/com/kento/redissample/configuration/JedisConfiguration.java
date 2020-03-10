package com.kento.redissample.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class JedisConfiguration {

//    @Bean
//    public JedisConnectionFactory JedisConnectionFactory() {
//
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("localhost", 6379);
//        return new JedisConnectionFactory(config);
//    }

}
