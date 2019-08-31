package com.john.protocol.command;

// request  response
public interface Command {

    // 登录
    Byte LOGIN_REQUEST = 1;

    Byte LOGIN_RESPONSE = 2;

    // 消息发送与接收
    Byte MESSAGE_REQUEST = 3;

    Byte MESSAGE_RESPONSE = 4;

    // 登出
    Byte LOGOUT_REQUEST = 5;

    Byte LOGOUT_RESPONSE = 6;

    // 建群
    Byte CREATE_GROUP_REQUEST = 7;

    Byte CREATE_GROUP_RESPONSE = 8;

    // 群列表
    Byte LIST_GROUP_MEMBERS_REQUEST = 9;

    Byte LIST_GROUP_MEMBERS_RESPONSE = 10;

    // 加入群聊
    Byte JOIN_GROUP_REQUEST = 11;

    Byte JOIN_GROUP_RESPONSE  = 12;

    // 退出群聊
    Byte QUIT_GROUP_REQUEST = 13;

    Byte QUIT_GROUP_RESPONSE = 14;

    // 群聊消息
    Byte GROUP_MESSAGE_REQUEST = 15;

    Byte GROUP_MESSAGE_RESPONSE = 16;

    // 心跳检测
    Byte HEARTBEAT_REQUEST = 17;

    Byte HEARTBEAT_RESPONSE = 18;
}
