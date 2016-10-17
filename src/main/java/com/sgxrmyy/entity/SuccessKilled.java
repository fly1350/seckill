package com.sgxrmyy.entity;

import java.util.Date;

/**
 * Created by loverabbit on 2016/10/14.
 */
public class SuccessKilled {

    private long seckillId;

    private long userPone;

    private short state;

    private Date createTime;

    private Seckill seckill;

    public SuccessKilled() {
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPone() {
        return userPone;
    }

    public void setUserPone(long userPone) {
        this.userPone = userPone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPone=" + userPone +
                ", state=" + state +
                ", createTime=" + createTime +
                ", seckill=" + seckill +
                '}';
    }
}
