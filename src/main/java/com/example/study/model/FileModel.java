package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ldh
 * @Description
 * @Date 14:59 2022-04-29
 **/

public class FileModel {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class  ButtonInfo{

        /**
         * 名称
         **/
        private String name;

        /**
         * 类型
         **/
        private String type;

        /**
         * 关键值
         **/
        private  String key;
    }
}
