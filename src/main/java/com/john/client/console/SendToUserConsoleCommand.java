package com.john.client.console;


import com.john.protocol.request.MessageRequestPacket;
import io.netty.channel.Channel;

import java.util.Map;
import java.util.Scanner;

public class SendToUserConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        System.out.println(" 发送消息给某个用户");

        String toUserId = scanner.next();
        String message = scanner.next();

        channel.writeAndFlush(new MessageRequestPacket(toUserId, message));
    }
}
