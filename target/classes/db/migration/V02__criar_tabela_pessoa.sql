CREATE TABLE pessoa(
	
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(60) NOT NULL,
	sobrenome VARCHAR(60) NOT NULL,
	idade BIGINT(20) NOT NULL,
	cpf VARCHAR(15) NOT NULL,
	rg VARCHAR(15) NOT NULL,
	estado_civil VARCHAR(20) NOT NULL,
	pessoa_sexo VARCHAR(20) NOT NULL,
	pessoa_tipo VARCHAR(50) NOT NULL
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, sobrenome, idade, cpf, rg, estado_civil, pessoa_sexo, pessoa_tipo) values('Ana Paula','Souza',22,'11122233344','1122233344','SOLTEIRO','FEMININO','ALUNO');
INSERT INTO pessoa (nome, sobrenome, idade, cpf, rg, estado_civil, pessoa_sexo, pessoa_tipo) values('Carla','Gomes',32,'11122233344','1122233344','SOLTEIRO','FEMININO','PROFESSOR');
