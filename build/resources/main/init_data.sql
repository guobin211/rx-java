

CREATE DATABASE IF NOT EXISTS `group_new` DEFAULT CHARACTER utf8;

USE `group_new`;

CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `password` VARCHAR (45) NOT NULL,
  `name` VARCHAR (45) NOT NULL,
  `login_time` DATETAIME NOT NULL ,
  `create_time` DATETIME NOT NULL,
  `update_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_UNIQUE`(`name`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


