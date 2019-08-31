package com.john.protocol.request;

import com.john.protocol.Packet;
import lombok.Data;

import static com.john.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    public Byte getCommand() {
        return QUIT_GROUP_REQUEST;
    }
}
