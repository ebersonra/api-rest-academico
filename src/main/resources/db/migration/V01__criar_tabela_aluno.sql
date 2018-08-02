CREATE TABLE aluno(
	
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_aluno BIGINT(20) NOT NULL,
	nome VARCHAR(60) NOT NULL,
	cpf VARCHAR(15) NOT NULL,
	data_nascimento DATETIME,
	pessoa_sexo VARCHAR(20) NOT NULL,
	estado_civil VARCHAR(20) NOT NULL
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO aluno (codigo_aluno, nome, cpf, data_nascimento, pessoa_sexo, estado_civil) values(1,'Ana Paula','11122233344', sysdate(),'FEMININO','SOLTEIRO');
INSERT INTO aluno (codigo_aluno, nome, cpf, data_nascimento, pessoa_sexo, estado_civil) values(2,'Laura Silva','11122233344', sysdate(),'FEMININO','CASADO');