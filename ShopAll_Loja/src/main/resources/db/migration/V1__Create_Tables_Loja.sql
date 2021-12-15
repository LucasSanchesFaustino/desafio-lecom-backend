drop table if exists pedido;
drop table if exists item_pedido;
  

CREATE TABLE `pedido` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `endereco_destino` varchar(255) DEFAULT NULL,
  `nome_cliente` varchar(255) DEFAULT NULL,
  `status_do_pedido` varchar(255) DEFAULT NULL,
  `codigo_pedido` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

CREATE TABLE `item_pedido` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `quantidade` int(11) DEFAULT NULL,
  `pedido_id` bigint(20) DEFAULT NULL,
  `codigo_do_produto` int(11) DEFAULT NULL,
  `nome_produto` varchar(255) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK60ym08cfoysa17wrn1swyiuda` (`pedido_id`),
  CONSTRAINT `FK60ym08cfoysa17wrn1swyiuda` FOREIGN KEY (`pedido_id`) REFERENCES `pedido` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
