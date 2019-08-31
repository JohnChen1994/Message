package com.john.client.handler;

import com.john.protocol.response.LogoutResponsePacket;
import com.john.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class LogoutResponseHandler extends SimpleChannelInboundHandler<LogoutResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, LogoutResponsePacket logoutResponsePacket) throws Exception {
        SessionUtil.unBindSession(channelHandlerContext.channel());
    }
}
