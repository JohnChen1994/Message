package com.john.attribute;

import com.john.session.Session;
import io.netty.util.AttributeKey;

/**
 * 给 Channel 绑定登录成功的标志位
 * 需要时，取出即可
 */
public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
