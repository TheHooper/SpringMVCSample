package com.hooper.common.test;

import com.alibaba.fastjson.JSON;
import com.hooper.model.Fruit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 47123 on 2016/11/11.
 */
public class JsonTest {


    public static void main(String[] args){
        Map<String,Object> map = new HashMap<String, Object>();
        Fruit fruit = new Fruit();
        fruit.setName("apple");
        map.put("fruit",fruit);
        map.put("neck","ssss");

        System.out.println(JSON.toJSONString(map));
    }
}
