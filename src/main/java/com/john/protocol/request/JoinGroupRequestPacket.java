package com.john.protocol.request;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    public Byte getCommand() {
        return JOIN_GROUP_REQUEST;
    }
}
