Algoritmo "Divisao"

Var
   x: inteiro
   contador,soma: real


Inicio
   escreval ("Algoritmo - Divida at� o seu n�mero ser o dividento e soma")
   escreval ("Insira um n�mero: ")
   leia (x)
   se (x<1)entao
      escreval ("Insira um n�mero positivo :)")
   fimse
   contador <- 1
   enquanto (contador<=x) faca
      soma <- soma+(1/contador)
      contador <- contador+1
      fimenquanto
      escreval ("A soma �: ", soma)

Fimalgoritmo