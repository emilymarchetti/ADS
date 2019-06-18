Algoritmo "Divisao"

Var
   x: inteiro
   contador,soma: real


Inicio
   escreval ("Algoritmo - Divida até o seu número ser o dividento e soma")
   escreval ("Insira um número: ")
   leia (x)
   se (x<1)entao
      escreval ("Insira um número positivo :)")
   fimse
   contador <- 1
   enquanto (contador<=x) faca
      soma <- soma+(1/contador)
      contador <- contador+1
      fimenquanto
      escreval ("A soma é: ", soma)

Fimalgoritmo