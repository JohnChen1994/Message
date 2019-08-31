package com.john.protocol.response;

import com.john.protocol.Packet;

import static com.john.protocol.command.Command.HEARTBEAT_RESPONSE;

public class HeartBeatResponsePacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEARTBEAT_RESPONSE;
    }
}
