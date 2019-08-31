package com.john.protocol.response;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.LOGOUT_RESPONSE;

@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;
    private String reason;

    public Byte getCommand() {
        return LOGOUT_RESPONSE;
    }
}
