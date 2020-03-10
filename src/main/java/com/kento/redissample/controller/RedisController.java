package com.kento.redissample.controller;

import com.kento.redissample.bean.RedisData;
import com.kento.redissample.service.RedisServiceImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisServiceImpl redisService;

    /**
     * データ追加
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/append")
    public void jedisAppend(@RequestBody Map<String, Object> redisData) {

        redisService.jedisAppend(redisData);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/set")
    public void jedisSet(@RequestBody Map<String, Object> redisData) {

        redisService.jedisSet(redisData);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/hset")
    public void jedisHset(@RequestBody Map<String, Object> redisData, @RequestParam("field") String field) {

        redisService.jedisHset(redisData, field);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hget")
    public ResponseEntity<String> jedisHGet(@RequestParam String key, @RequestParam String field ) {

        return new ResponseEntity<>(redisService.jedisHget(key, field), HttpStatus.OK);
    }

}
