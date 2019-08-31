package com.john.protocol.response;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.MESSAGE_RESPONSE;

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;
    private String fromUserName;
    private String message;

    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }
}
