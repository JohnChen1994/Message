package com.john.protocol.response;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.JOIN_GROUP_RESPONSE;

@Data
public class JoinGroupResponsePacket extends Packet {

    private String groupId;
    private boolean success;
    private String reason;

    public Byte getCommand() {
        return JOIN_GROUP_RESPONSE;
    }
}
