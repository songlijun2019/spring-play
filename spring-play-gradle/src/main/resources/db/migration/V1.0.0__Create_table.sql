create table user (
    id int not null,
    account varchar(100) not null COMMENT '用户账户名',
    password varchar(100) not null COMMENT '用户密码',
    -- 建议增加
    `creator_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '创建人id',
    `creator_name` varchar(64) NOT NULL DEFAULT 0 COMMENT '创建人名称',
    `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
    `update_user_id` bigint(20) NOT NULL DEFAULT 0 COMMENT '更新人id',
    `update_user_name` varchar(64) NOT NULL DEFAULT 0 COMMENT '更新人名称',
    `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    -- 定义主键，主键已经是索引，不用额外加索引
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户信息表';