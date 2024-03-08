CREATE TABLE IF NOT EXISTS `contact` (  
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `prioridade` int NOT NULL,
  PRIMARY KEY (`id`)
);

