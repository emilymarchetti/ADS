Algoritmo "PesoIdadePara"

Var

   idade,nov,id,ps: inteiro
   peso,medid: real

Inicio
   ps <- 0
   id <- 0
   nov <- 0
   para ps de 0 ate 7 passo 1 faca
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
   fimpara
   escreva (nov,"pessoa(s) tem mais de 90Kg")
   escreval ("")
   escreva ("A m�dia das idades �: ", medid)
   escreval ("")

Fimalgoritmo