package com.shoppinghp.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public final class JsonClass {
    public static String encodeToJsonEncode(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }

    public static Object decodeToObject(String json, Object obj) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Object result = null;
        try {
            result = mapper.readValue(json, obj.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
