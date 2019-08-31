package com.john.serialize;

import com.john.serialize.impl.JSONSerializer;

public interface Serializer {

    // 默认序列化算法
    Serializer DEFAULT = new JSONSerializer();

    byte getSerializerAlgorithm();

    // 序列化
    byte[] serializer(Object object);

    // 反序列化
    <T> T deserializer(Class<T> clazz, byte[] bytes);
}
