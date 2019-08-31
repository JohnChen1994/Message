package com.john.util;

import java.util.UUID;

public class IDUtil {

    // 随机生成用于ID
    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
