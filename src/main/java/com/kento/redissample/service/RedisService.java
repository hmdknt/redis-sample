package com.kento.redissample.service;

import java.util.Map;

public interface RedisService {

    // APPEND
    public void jedisAppend(Map<String,Object> data);

    //
    public void templateAppend(Object data);

    // AUTH
    public void auth();

    // SELECT
    public void select(String db);

    // SET
    public void jedisSet(Map<String, Object> data);

    // HSET
    public void jedisHset(Map<String, Object> data, String field);

    // HGET
    public String jedisHget(String key, String field);
}
