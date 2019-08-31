package com.john.client.handler;

import com.john.protocol.response.CreateGroupResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class CreateGroupResponseHandler extends SimpleChannelInboundHandler<CreateGroupResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, CreateGroupResponsePacket createGroupResponsePacket) throws Exception {
        System.out.println("群创建成功，id 为[" + createGroupResponsePacket.getGroupId() + "],");
        System.out.println("群成员有：" + createGroupResponsePacket.getUserNameList());

    }
}
