package com.cncb.bank_payment.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 利用Jackson进行Json转化
 * @author dailiwen
 * @date 2018/04/19
 */
public class JacksonUtil {
    /**
     * json转为Class
     * @param json
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T jsonToClass(String json, Class<T> c) {
        ObjectMapper mapper = new ObjectMapper();
        T t = null;
        try {
            t = mapper.readValue(json, c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * json转map
     * @param json
     * @return
     */
        public static Map<String, Object> jsonToMap(String json) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = null;
        try {
            map = mapper.readValue(json, new TypeReference<Map<String, Object>>(){
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     *
     * @param json
     * @return
     */
    public static List<Map<String, Object>> jsonToList(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> map = null;
        try {
            map = mapper.readValue(json, new TypeReference<List<Map<String, Object>>>(){
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 将一个object转换为json, 可以是一个java对象，也可以是集合
     * @param object
     * @return
     */
    public static String objectToJson(Object object) {
        /**
         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。
         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。
         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。
         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。
         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。
         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。
         */
        ObjectMapper mapper = new ObjectMapper();

        String json = null;
        try {
            json = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static List<String> jsonToStringList(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<String> notes = null;
        try {
            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, String.class);
            notes = mapper.readValue(json, javaType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return notes;
    }
}
