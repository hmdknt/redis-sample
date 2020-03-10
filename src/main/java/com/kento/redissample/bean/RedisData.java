package com.kento.redissample.bean;

import java.util.Map;
import lombok.Data;

@Data
public class RedisData {

    private Map<String, Object> redisMap;
}
