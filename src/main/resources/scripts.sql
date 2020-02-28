DROP TABLE IF EXISTS `pokemon`;

CREATE TABLE `users` (
   `id` INT NOT NULL AUTO_INCREMENT,
  `pokemon_name` varchar(55) UNIQUE,
  `pokemon_level` int(100) DEFAULT NULL,
  `pokemon_type` varchar(45) DEFAULT NULL,

  PRIMARY KEY (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=latin1;