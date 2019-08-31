package com.john.server.handler;

import com.john.protocol.request.JoinGroupRequestPacket;
import com.john.protocol.response.JoinGroupResponsePacket;
import com.john.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;

public class JoinGroupRequestHandler extends SimpleChannelInboundHandler<JoinGroupRequestPacket> {

    public static final JoinGroupRequestHandler INSTANCE = new JoinGroupRequestHandler();

    private JoinGroupRequestHandler(){

    }
    /*
    1. 获取对应的channelGroup 然后将当前用户的channel 添加进图
    2. 构造加群响应发送给客户端
    * */

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, JoinGroupRequestPacket joinGroupRequestPacket) throws Exception {
        String groupId= joinGroupRequestPacket.getGroupId();
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.add(channelHandlerContext.channel());

        JoinGroupResponsePacket joinGroupResponsePacket = new JoinGroupResponsePacket();
        joinGroupResponsePacket.setSuccess(true);
        joinGroupResponsePacket.setGroupId(groupId);
        channelHandlerContext.channel().writeAndFlush(joinGroupResponsePacket);
    }
}
