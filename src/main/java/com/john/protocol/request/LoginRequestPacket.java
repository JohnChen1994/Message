package com.john.protocol.request;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {

    private String userName;
    private String password;

    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
