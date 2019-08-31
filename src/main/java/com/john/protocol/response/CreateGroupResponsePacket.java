package com.john.protocol.response;

import com.john.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.john.protocol.command.Command.CREATE_GROUP_RESPONSE;

@Data
public class CreateGroupResponsePacket extends Packet {

    private boolean success;

    private String groupId;

    private List<String> userNameList;

    public Byte getCommand() {
        return CREATE_GROUP_RESPONSE;
    }
}
