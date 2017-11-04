package com.sun.utils.config.redis;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configurable
@EnableRedisHttpSession
public class RedisSessionConfig {
	  
	  @Bean
      public JedisConnectionFactory connectionFactory() {
              return new JedisConnectionFactory();
      }
}
