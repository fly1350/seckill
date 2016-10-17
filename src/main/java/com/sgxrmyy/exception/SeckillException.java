package com.sgxrmyy.exception;

/**
 * 秒杀相关异常
 * Created by loverabbit on 2016/10/14.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
