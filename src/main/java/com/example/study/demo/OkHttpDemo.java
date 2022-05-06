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
        Map<String,String> param=new HashMap<>();
        param.put("beginTime","1651334400000");
        param.put("endTime","1651852799999");
        param.put("pageNum","1");
        param.put("pageSize","30");
        param.put("sortField","DiscountAfterTotal");
        param.put("sortType","DESC");
        param.put("statType","SKU");
        System.out.print( OkHttpUtil.postFormParams("https://dev-hdsaas.facehand.cn/gateway/saas-statistics-service/api/v1/procure/goods_list",param));
    }
}
