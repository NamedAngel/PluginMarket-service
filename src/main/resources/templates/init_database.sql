#
创建数据库
create
database plugin_market;

#
选择使用的数据库
use plugin_market;

#
创建插件包信息表
drop table IF exists plugin_package;
create table plugin_package
(
    name        varchar(30) not null comment '插件名',
    version     varchar(20) not null comment '对应的插件版本',
    description varchar(200) comment '插件介绍',
    primary key (name, version)
) engine=InnoDB default charset=utf8 comment='插件包信息表';
insert into plugin_package
values ('UWP Lint', '2023.03.07', '基于spyglass的lint');
insert into plugin_package
values ('UWP Lint', '2023.02.13', '基于spyglass的lint');
insert into plugin_package
values ('Superbench', '1.1', 'superbench');
commit;

#
创建插件发布表
drop table IF exists plugin_release;
create table plugin_release
(
    name     varchar(30) not null comment '插件名',
    version  varchar(20) not null comment '发布的版本',
    download int comment '下载次数',
    foreign key (name) references plugin_package (name) on delete cascade on update cascade,
    primary key (name)
) engine=InnoDB default charset=utf8 comment='插件包信息表';
insert into plugin_release
values ('UWP Lint', '2023.03.07', 0);
insert into plugin_release
values ('Superbench', '1.1', 20);