Algoritmo "Emprestimo"

Var

   emprestimo,juros,parcela,parcela2: real
   numparcela: inteiro

Inicio

   escreva ("Qual a quantidade desejada de emprestimo?: ")
   leia (emprestimo)
   escreva ("Em quantas parcelas deseja pagar?: ")
   leia (numparcela)
   parcela <- emprestimo/numparcela
   juros <- (parcela*20)/100
   parcela2 <- parcela+juros
   escreval ("Com juros de 20%, será parcelado em ",numparcela," vezes de", parcela2, " reais")


Fimalgoritmo