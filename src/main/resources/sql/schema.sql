CREATE TABLE
    IF NOT EXISTS message
(
    id   INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    text VARCHAR(50)         NOT NULL
) ENGINE = INNODB
  DEFAULT charset = utf8;


CREATE TABLE `sys_student` (
                               `id` int(32) NOT NULL AUTO_INCREMENT,
                               `name` varchar(255) NOT NULL DEFAULT '' COMMENT '姓名',
                               `age` int(3) unsigned zerofill NOT NULL COMMENT '年龄',
                               PRIMARY KEY (`id`),
                               KEY `index_name` (`name`) USING BTREE COMMENT '姓名索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;