Algoritmo "PesoIdade"

Var
   idade,nov,id,ps: inteiro
   peso,medid: real

Inicio
   ps <- 0
   id <- 0
   nov <- 0
   enquanto (ps<7)faca
      escreva ("Qual sua idade?: ")
      leia (idade)
      escreva ("Qual seu peso?: ")
      leia (peso)
      id <- id+idade
      ps <- ps+1
      se (peso>=90)entao
         nov <- nov+1
      fimse
      medid <- id/7
   fimenquanto
   escreva (nov,"pessoa(s) tem mais de 90Kg")
   escreval ("")
   escreva ("A média das idades é: ", medid)
   escreval ("")
Fimalgoritmo