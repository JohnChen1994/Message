package com.john.protocol.request;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.MESSAGE_REQUEST;

@Data
public class MessageRequestPacket extends Packet {

    private String toUserId;
    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
