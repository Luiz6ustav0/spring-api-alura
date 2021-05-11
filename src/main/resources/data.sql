INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$lfsZUPlU4fh6A2tv5AcRy.Z.NVsjAFhsKFOqcR5fSnUOVuwv8dfUO');
INSERT INTO USUARIO(nome, email, senha) VALUES('Luizera', 'luiz@email.com', '$2a$10$lfsZUPlU4fh6A2tv5AcRy.Z.NVsjAFhsKFOqcR5fSnUOVuwv8dfUO');

INSERT INTO PERFIL(id, nome) VALUES (1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES (2, 'ROLE_MODERADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES (1, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES (2, 2);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 1', 'help pls', '2019-08-30', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Rest Api', '2019-08-28', 'NAO_RESPONDIDO', 1, 2);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3 ', 'Algortimos', '2020-09-15', 'NAO_RESPONDIDO', 1, 1);