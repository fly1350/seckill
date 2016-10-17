package com.sgxrmyy.exception;

/**
 * 重复秒杀异常
 * Created by loverabbit on 2016/10/14.
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
