package com.netty.aio;

import com.netty.nio.MultiplexerTimeServer;

import java.io.IOException;

/**
 * Created by weitaosheng on 2016/10/4.
 */
public class TimeServer {

    public static void main(String[] args) throws IOException {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {

            }
        }
        AsyncTimeServerHandler timeServer = new AsyncTimeServerHandler(port);

        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }

}
