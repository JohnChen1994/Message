package com.john.protocol.response;

import com.john.protocol.Packet;
import com.john.session.Session;
import lombok.Data;

import static com.john.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;
    private Session fromUser;
    private String message;

    public Byte getCommand() {
        return GROUP_MESSAGE_RESPONSE;
    }
}
