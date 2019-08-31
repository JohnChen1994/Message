package com.john.protocol;

import lombok.Data;

/**
 * 通信过程中的Java 对象，用于编码与解码
 */
@Data
public abstract class Packet {

    /*
    协议版本
     */
    private Byte version = 1;

    /*
    指令
     */
    public abstract Byte getCommand();
}
