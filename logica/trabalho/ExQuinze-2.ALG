algoritmo "ExQuinze-2"

arquivo "C:\Mercado.txt"
tipo
   produto = registro
      codigo: inteiro
      descricao: caracter
      valor:real
   fimregistro
var
   m: vetor [1..10] de produto
   i: inteiro
   m1,m2:real
inicio
   Para i de 1 ate 10 faca
      Escreva("Digite o código do produto",i,": ")
      leia(m[i].codigo)
      Escreva("Escreva a descrição do produto",i,": ")
      leia(m[i].descricao)
      Escreva("Informe o valor de custo do produto",i,": ")
      leia(m[i].valor)
      limpatela
      m1<- m[i].valor + m1
   fimpara
   Para i de 1 ate 10 faca
      m[i].valor <- (m[i].valor/100*20) + m[i].valor
      m2<- m[i].valor + m2
   fimpara
   Para i de 1 ate 10 faca
      Escreval("Produto",i)
      Escreval("Código:",m[i].codigo)
      Escreval("Descrição:",m[i].descricao)
      Escreval("Valor após o acréscimo:",m[i].valor)
      Escreval()
   fimpara
   Escreval("Média atual dos produtos:", m2/10)
   Escreval("Média antiga dos produtos:",m1/10)
fimalgoritmo