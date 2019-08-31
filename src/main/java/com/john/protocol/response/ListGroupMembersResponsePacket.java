package com.john.protocol.response;

import com.john.protocol.Packet;
import com.john.session.Session;
import lombok.Data;

import java.util.List;

import static com.john.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;
    private List<Session> sessionList;

    public Byte getCommand() {
        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
