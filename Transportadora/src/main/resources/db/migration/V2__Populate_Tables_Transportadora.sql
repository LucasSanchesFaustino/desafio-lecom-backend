INSERT INTO transportadora.info_transportadora
(id, estado, nome, endereco)
VALUES(1, 'SP', 'Javax Transportes', 'Rua do Jabuticabal, nº 123, Centro');
INSERT INTO transportadora.info_transportadora
(id, estado, nome, endereco)
VALUES(2, 'RJ', 'Amazonas Delivery', 'Rua das Laranjeiras, nº 321, Centro');
INSERT INTO transportadora.info_transportadora
(id, estado, nome, endereco)
VALUES(3, 'GO', 'Market Envios', 'Rua das Macieiras, nº 231, Centro');
INSERT INTO transportadora.info_transportadora
(id, estado, nome, endereco)
VALUES(4, 'RO', 'Regex Transportes', 'Rua do Beija-flor, nº 123, Centro');
INSERT INTO transportadora.info_transportadora
(id, estado, nome, endereco)
VALUES(5, 'ES', 'Intelisense Express', 'Avenida das Flores, nº 32, Centro');
INSERT INTO transportadora.info_transportadora
(id, estado, nome, endereco)
VALUES(6, 'BA', 'Saturn Transport', 'Rua das Cerejeiras, nº 20, Centro');

INSERT INTO transportadora.transporte
(id, codigo_pedido, codigo_rastreio, endereco_destino, status_do_pedido)
VALUES(2, 492, 64129, 'rua josé alderico daniel, n 125, pirajuí sp', 'Preparando');
INSERT INTO transportadora.transporte
(id, codigo_pedido, codigo_rastreio, endereco_destino, status_do_pedido)
VALUES(3, 145, 45478, 'rua josé alderico daniel, n 125, pirajuí sp', 'Encaminhado');
INSERT INTO transportadora.transporte
(id, codigo_pedido, codigo_rastreio, endereco_destino, status_do_pedido)
VALUES(4, 982, 83788, 'Rua Dos Beija Flores, Campinas, São Paulo', 'Preparando');
INSERT INTO transportadora.transporte
(id, codigo_pedido, codigo_rastreio, endereco_destino, status_do_pedido)
VALUES(5, 648, 23939, 'Rua Dos Beija Flores, Campinas SP', 'Encaminhado');
INSERT INTO transportadora.transporte
(id, codigo_pedido, codigo_rastreio, endereco_destino, status_do_pedido)
VALUES(6, 399, 22731, 'Rua José Alderico Daniel, nº 125, Pirajuí SP', 'Entregue');
INSERT INTO transportadora.transporte
(id, codigo_pedido, codigo_rastreio, endereco_destino, status_do_pedido)
VALUES(7, 312, 45756, 'Rua José Alderico Daniel, nº 125, Pirajuí SP', 'Entregue');
