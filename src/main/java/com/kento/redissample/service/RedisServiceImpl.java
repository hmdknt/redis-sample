package com.kento.redissample.service;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class RedisServiceImpl implements RedisService {

//    @Autowired
//    private StringRedisTemplate redisTemplate;

    Jedis jedis = new Jedis("localhost",6379);

    @Override
    public void jedisAppend(Map<String, Object> data) {
        data.forEach((key, value) -> {
            jedis.append(key, value != null ? value.toString() : StringUtils.EMPTY);
        });
    }

    @Override
    public void templateAppend(Object data) {

    }

    /**
     * auth
     */
    @Override
    public void auth() {

    }

    /**
     * select
     * @param db 対象DB
     */
    @Override
    public void select(String db) {

    }

    @Override
    public void jedisSet(Map<String, Object> data) {

        data.forEach((key, value) -> {
            jedis.set(key, value != null ? value.toString() : StringUtils.EMPTY);
        });
    }

    @Override
    public void jedisHset(Map<String, Object> data, String field) {

        data.forEach((key,value) -> {
            jedis.hset(key, field, value != null ? value.toString() : StringUtils.EMPTY);
        });
    }

    @Override
    public String jedisHget(String key, String field) {

        String value= jedis.hget(key, field);

        return value;

    }
}
