--创建数据库
CREATE DATABASE seckill;
--  使用数据库
use seckill;
--  创建秒杀库存表
CREATE TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` int not null COMMENT '商品库存',
`start_time` TIMESTAMP not null comment '开始时间',
`end_time` TIMESTAMP not null comment '结束时间',
`create_time` TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP commnet '创建时间',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
Key idx_end_time(end_time),
key idx_create_time(create_time)

)ENGINE=InnoDb AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

--  初始化数据
insert into seckill(name,number,start_time,end_time)
VALUES
('1000元秒杀Ipone6',100,'2016-10-14','2016-10-15'),
('500元秒杀Ipad2',200,'2016-10-14','2016-10-15'),
('200元秒杀小米4',300,'2016-10-14','2016-10-15'),
('100元秒杀小米Note',400,'2016-10-14','2016-10-15');

--  秒杀成功明细表
create TABLE success_killed(
`seckill_id` bigint not null comment '商品库存id',
`user_phone` bigint not null comment '用户手机号',
`state` tinyint not null DEFAULT -1 comment '状态标识:-1 无效 0 成功 1 已付款 2 已发货',
`create_time` TIMESTAMP not null comment '创建时间',
PRIMARY key(seckill_id,user_phone),
key idex_create_time(create_time)
)ENGINE=InnoDb AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';