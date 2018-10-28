algoritmo "EX15-1"
arquivo "C:\Mercado.txt"
tipo
   produto= registro
      nome,descricao: caracter
      valor:real
   fimregistro
var
   mercadoria: vetor [1..3] de produto
   i: inteiro
inicio
   Para i de 1 ate 10 faca
      Escreva("Digite o nome do produto",contador,": ")
      leia(mercadoria[i].nome)
      Escreva("Escreva a descrição do produto",contador,": ")
      leia(mercadoria[i].descricao)
      Escreva("Informe o valor do produto",contador,": ")
      leia(mercadoria[i].valor)
      limpatela
   fimpara
fimalgoritmo