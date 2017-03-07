package com.bmwu.stress;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Created by michael on 3/4/17.
 */
public class LoadTest {

    private static String jsonStr =  "{\n" +
            "  \"testA\": {\n" +
            "    \"key2\": {\n" +
            "      \"key31\": \"value\",\n" +
            "      \"key32\": \"value\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"testB\": {\n" +
            "    \"key2\": {\n" +
            "      \"key31\": \"value\",\n" +
            "      \"key32\": \"value\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"testC\": {\n" +
            "    \"key\": \"value\"\n" +
            "  }\n" +
            "}";

    @Test(invocationCount = 100)
    public void repeatThis() {
        System.out.println(System.currentTimeMillis());
        System.out.println("repeatThis");

        JSONObject jsonObj = JSON.parseObject(jsonStr);
        JSONObject jsonObject = (JSONObject)decodeJSONObject(jsonObj);
        System.out.println(jsonObject.toJSONString());
    }

    public Object decodeJSONObject(Object json){

        if (json instanceof JSONObject) {
            JSONObject retObj = new JSONObject();
            JSONObject jsonObject = (JSONObject)json;
            for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
                retObj.put(entry.getKey(), decodeJSONObject(entry.getValue()));
            }
            return retObj;
        } else if (json instanceof JSONArray) {
            JSONArray retArr = new JSONArray();
            JSONArray jsonArray = (JSONArray)json;
            for (Object object : jsonArray) {
                retArr.add(decodeJSONObject(object));
            }
            return retArr;
        } else {
            return "";
        }
    }
}
