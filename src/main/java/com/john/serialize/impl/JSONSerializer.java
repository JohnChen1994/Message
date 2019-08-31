package com.john.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.john.serialize.Serializer;
import com.john.serialize.SerializerAlgorithm;

public class JSONSerializer implements Serializer {

    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    public byte[] serializer(Object object) {
        return JSON.toJSONBytes(object);
    }

    public <T> T deserializer(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
