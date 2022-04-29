package com.example.study;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.study.model.FileModel;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.util.List;

/**
 * @Author ldh
 * @Description 测试读取json文件转化为java对象
 * @Date 14:44 2022-04-29
 **/
public class FileDemo {
    public static JSONObject fileToJson(String fileName) {
        JSONObject json = null;
        try (
                InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        ) {
            json = JSONObject.parseObject(IOUtils.toString(is, "utf-8"));
        } catch (Exception e) {
            System.out.println(fileName + "文件读取异常" + e);
        }
        return json;
    }

    public static void main(String[] args) {
        String fileName = "settings/info.json";
        JSONObject json = FileDemo.fileToJson(fileName);
        List<FileModel.ButtonInfo> list = JSONArray.parseArray(json.getJSONArray("button").toString(), FileModel.ButtonInfo.class);
        System.out.println(list);
    }
}
