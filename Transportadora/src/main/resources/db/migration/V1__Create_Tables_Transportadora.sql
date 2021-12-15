drop table if exists transporte;
drop table if exists info_transportadora;

CREATE TABLE `info_transportadora` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `estado` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

CREATE TABLE `transporte` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `codigo_pedido` int(11) DEFAULT NULL,
  `codigo_rastreio` int(11) DEFAULT NULL,
  `endereco_destino` varchar(255) DEFAULT NULL,
  `status_do_pedido` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;