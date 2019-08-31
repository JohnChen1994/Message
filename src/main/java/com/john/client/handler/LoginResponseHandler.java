package com.john.client.handler;

import com.john.protocol.response.LoginResponsePacket;
import com.john.session.Session;
import com.john.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class LoginResponseHandler extends SimpleChannelInboundHandler<LoginResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, LoginResponsePacket loginResponsePacket) throws Exception {
        String userId = loginResponsePacket.getUserId();
        String userName = loginResponsePacket.getUserName();

        if (loginResponsePacket.isSuccess()) {
            System.out.println("[" + userName + "]登录成功， userId 为：" + loginResponsePacket.getUserId());
            SessionUtil.bindSession(new Session(userId, userName), channelHandlerContext.channel());
        } else {
            System.out.println("[" + userName + "]登录失败，原因" + loginResponsePacket.getReason());
        }
    }
}
