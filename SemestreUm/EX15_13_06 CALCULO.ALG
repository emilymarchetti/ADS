algoritmo "Ex15_13_06 Calculo"
arquivo "C:\Temp\Mercado.txt"
tipo
   produto= registro
      codigo: inteiro
      descricao: caracter
      valor:real
   fimregistro
var
   mercadoria: vetor [1..10] de produto
   contador: inteiro
   media1,media2:real
inicio
   Para contador de 1 ate 10 faca
      Escreva("Digite o código do produto",contador,": ")
      leia(mercadoria[contador].codigo)
      Escreva("Escreva a descrição do produto",contador,": ")
      leia(mercadoria[contador].descricao)
      Escreva("Informe o valor de custo do produto",contador,": ")
      leia(mercadoria[contador].valor)
      limpatela
      media1<- mercadoria[contador].valor + media1
   fimpara
   Para contador de 1 ate 10 faca
      mercadoria[contador].valor <- (mercadoria[contador].valor/100*20) + mercadoria[contador].valor
      media2<- mercadoria[contador].valor + media2
   fimpara
   Para contador de 1 ate 10 faca
      Escreval("Produto",contador)
      Escreval("Código:",mercadoria[contador].codigo)
      Escreval("Descrição:",mercadoria[contador].descricao)
      Escreval("Valor após o acréscimo:",mercadoria[contador].valor)
      Escreval()
   fimpara
   Escreval("Média atual dos produtos:", media2/10)
   Escreval("Média antiga dos produtos:",media1/10)
fimalgoritmo