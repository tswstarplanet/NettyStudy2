package com.netty.aio;


/**
 * Created by weitaosheng on 2016/10/3.
 */


public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {

            }
        }
        new Thread(new AsyncTimeClientHandler("127.0.0.1", port), "AIO-AsynTimeClientHandler-001").start();
    }

}
