package com.john.protocol.request;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.LOGOUT_REQUEST;

@Data
public class LogoutRequestPacket extends Packet {

    public Byte getCommand() {
        return LOGOUT_REQUEST;
    }
}
