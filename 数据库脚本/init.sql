-- 创建数据库example

-- 以下是脚本

drop table if exists user_info;
create table user_info(
 id bigint primary key auto_increment comment '物理自增主键',
 name varchar(50) not null comment '姓名',
 remark text comment '备注',
 create_time datetime default current_timestamp comment '创建时间'
) comment '用户表';

insert into user_info values(default ,'ljk','项目可访问',now());