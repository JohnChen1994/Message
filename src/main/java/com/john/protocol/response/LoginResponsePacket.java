package com.john.protocol.response;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {

    private String userId;
    private String userName;
    private boolean success;
    private String reason;

    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
