INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(7, 'rua josé alderico daniel, n 125, pirajuí sp', 'Microsoft', 'Recebido', 7);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(8, 'Rua Dos Beija Flores, Campinas, São Paulo', 'Lecom', 'Recebido', 92);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(9, 'rua josé alderico daniel, n 125, pirajuí sp', 'Lucas', 'Recebido', 408);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(10, 'rua josé alderico daniel, n 125, pirajuí sp', 'Lucas', 'Recebido', 492);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(11, 'rua josé alderico daniel, n 125, pirajuí sp', 'Lucas', 'Recebido', 145);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(12, 'Rua Dos Beija Flores, Campinas, São Paulo', 'Lecom', 'Separando', 982);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(13, 'Rua Dos Beija Flores, Campinas SP', 'Honda', 'Separando', 648);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(14, 'Rua José Alderico Daniel, nº 125, Pirajuí SP', 'Lecom', 'Separando', 399);
INSERT INTO loja.pedido
(id, endereco_destino, nome_cliente, status_do_pedido, codigo_pedido)
VALUES(15, 'Rua José Alderico Daniel, nº 125, Pirajuí SP', 'Lecom', 'Separando', 312);

INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(7, 1, 7, 1, 'Smartwatch Xiaomi ', 250.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(8, 6, 8, 5, 'Máquina de Lavar Brastemp', 6000.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(9, 1, 9, 1, 'Smartwatch Xiaomi ', 250.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(10, 1, 10, 1, 'Smartwatch Xiaomi ', 250.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(11, 1, 11, 10, 'Cadeira de Escritório', 580.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(12, 5, 12, 5, 'Máquina de Lavar Brastemp', 5000.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(13, 2, 13, 3, 'Celular Samsung J10', 1200.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(14, 10, 14, 12, 'Mesa de Escritório', 6000.0);
INSERT INTO loja.item_pedido
(id, quantidade, pedido_id, codigo_do_produto, nome_produto, valor)
VALUES(15, 2, 15, 9, 'Abajur ', 220.0);