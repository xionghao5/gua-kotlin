CREATE DATABASE `kotlin2` CHARACTER SET 'utf8' COLLATE 'utf8_bin';

DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
                             `id` int(0) NOT NULL AUTO_INCREMENT,
                             `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '用户名',
                             `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '密码',
                             PRIMARY KEY (`id`) USING BTREE,
                             INDEX `index_username`(`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;