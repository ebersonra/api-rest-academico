CREATE TABLE sys_usuario (
	ident BIGINT(20) PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	senha VARCHAR(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE sys_permissao (
	ident BIGINT(20) PRIMARY KEY,
	descricao VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE sys_usuario_permissao (
	ident_usuario BIGINT(20) NOT NULL,
	ident_permissao BIGINT(20) NOT NULL,
	PRIMARY KEY (ident_usuario, ident_permissao),
	FOREIGN KEY (ident_usuario) REFERENCES sys_usuario(ident),
	FOREIGN KEY (ident_permissao) REFERENCES sys_permissao(ident)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO sys_usuario (ident, nome, email, senha) values (1, 'Administrador', 'admin@academico.com', '$2a$10$X607ZPhQ4EgGNaYKt3n4SONjIv9zc.VMWdEuhCuba7oLAL5IvcL5.');
INSERT INTO sys_usuario (ident, nome, email, senha) values (2, 'Maria Silva', 'aluna01@academico.com', '$2a$10$fwzSCkwtNqNBqvsHXzPsDONgxdWSwpRma.IOs5vit8UgAz5F3cHyG');

INSERT INTO sys_permissao (ident, descricao) values (1, 'ROLE_CADASTRAR_CATEGORIA');
INSERT INTO sys_permissao (ident, descricao) values (2, 'ROLE_PESQUISAR_CATEGORIA');

INSERT INTO sys_permissao (ident, descricao) values (3, 'ROLE_CADASTRAR_PESSOA');
INSERT INTO sys_permissao (ident, descricao) values (4, 'ROLE_REMOVER_PESSOA');
INSERT INTO sys_permissao (ident, descricao) values (5, 'ROLE_PESQUISAR_PESSOA');

INSERT INTO sys_permissao (ident, descricao) values (6, 'ROLE_CADASTRAR_LANCAMENTO');
INSERT INTO sys_permissao (ident, descricao) values (7, 'ROLE_REMOVER_LANCAMENTO');
INSERT INTO sys_permissao (ident, descricao) values (8, 'ROLE_PESQUISAR_LANCAMENTO');

-- admin
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 1);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 2);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 3);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 4);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 5);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 6);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 7);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (1, 8);

-- maria
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (2, 2);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (2, 5);
INSERT INTO sys_usuario_permissao (ident_usuario, ident_permissao) values (2, 8);

