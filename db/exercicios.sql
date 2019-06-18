-- EX 1 | Selecione o CPF, Data de nascimento e o endere�o do funcion�rio Paulo A Lima.

select 
     f.cpf, f.dt_nascimento, f.endereco
from funcionario as f 
where f.primeiro_nome = 'Paulo'
  and f.nome_meio = 'A'
  and f.ultimo_nome = 'Lima';
  
-- EX 2 | Selecione o primeiro nome, o nome do meio, ultimo nome, cpf, data de
--        nascimento, endere�o, sexo e sal�rio dos funcion�rios que possuem salario maior que 1800.

select 
     f.primeiro_nome, f.nome_meio, f.ultimo_nome,
     f.cpf, f.dt_nascimento, f.endereco, f.sexo
from funcionario as f 
where f.salario > 1800;
 
-- EX 3 | Liste o nome primeiro nome, nome do meio, cpf e sal�rio dos funcion�rios que
--        possuem o ultimo nome Ferreira e s�o do sexo masculino.

select
     f.primeiro_nome, f.nome_meio, f.cpf, f.salario
from funcionario as f 
 where f.ultimo_nome = 'Ferreira'
   and f.sexo = 'M';
   
-- EX 4 | Dos usu�rios ativos, liste o nome, nome do meio, ultimo nome, cpf, data de
--        nascimento e sexo dos funcion�rios que possuem idade entre 20 a 30 anos.
   
select
     f.primeiro_nome, f.nome_meio, f.ultimo_nome, 
     f.cpf, f.dt_nascimento, f.sexo
from funcionario as f 
where f.ativo = 1
  and f.dt_nascimento between '1989-04-03' and '1999-04-03';
     
-- EX 5 | Apresente o primeiro nome, nome do meio, ultimo nome, cpf, dt_nascimento,
--        endere�o, sexo e sal�rio dos funcion�rios que tem sal�rio maior que 1800 do sexo
--        masculino, ativos no sistema e tem entre 30 a 35 anos.
    
select
     f.primeiro_nome, f.nome_meio, f.ultimo_nome, 
     f.cpf, f.dt_nascimento, f.endereco, f.sexo, f.salario
from funcionario as f 
where f.ativo = 1
  and f.salario > 1800
  and f.sexo = 'M'
  and f.dt_nascimento between '1984-04-03' and '1989-04-03'