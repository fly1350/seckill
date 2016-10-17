package com.sgxrmyy.service;

import com.sgxrmyy.dto.Exposer;
import com.sgxrmyy.dto.SeckillExecution;
import com.sgxrmyy.entity.Seckill;
import com.sgxrmyy.exception.RepeatKillException;
import com.sgxrmyy.exception.SeckillCloseException;
import com.sgxrmyy.exception.SeckillException;

import java.util.List;

/**
 * Created by loverabbit on 2016/10/14.
 */
public interface SeckillService {

    /**
     * 查询所有秒杀记录
     *
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启则输出秒杀接口地址，
     * 否则输出系统时间和秒杀时间
     *
     * @param seckillId
     * @return
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, SeckillCloseException, RepeatKillException;
}
