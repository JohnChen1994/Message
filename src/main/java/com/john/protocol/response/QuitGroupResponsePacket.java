package com.john.protocol.response;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.QUIT_GROUP_RESPONSE;

@Data
public class QuitGroupResponsePacket extends Packet {

    private String groupId;
    private boolean success;
    private String reason;

    public Byte getCommand() {
        return QUIT_GROUP_RESPONSE;
    }
}
