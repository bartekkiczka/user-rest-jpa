USE `user_database`;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `login` varchar(45) DEFAULT NULL,
                        `email` varchar(45) DEFAULT NULL,
                        `password` varchar(45) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
                        `role_id` int(11) NOT NULL AUTO_INCREMENT,
                        `role` varchar(45) DEFAULT NULL,
                        PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `role` VALUES
(1,'ADMIN'),
(2,'MODERATOR'),
(3,'USER');

DROP TABLE IF EXISTS `user_role`;