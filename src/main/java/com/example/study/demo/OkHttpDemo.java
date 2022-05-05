package com.example.study.demo;

import com.example.study.units.OkHttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ldh
 * @Description
 * @Date 16:50 2022-05-05
 **/
public class OkHttpDemo {
    public static void main(String[] args) {
        System.out.print( OkHttpUtil.postFormParams("https://fat-hdsaas.facehand.cn/gateway/saas-statistics-service/api/v1/procure/goods_list",null));
    }
}
