Algoritmo "ExDez"

Var
   anac,fel: real
   anos: inteiro
Inicio
   anac <- 50
   fel <- 10
   anos <- 0
   repita
      anac <- anac + 2
      fel <- fel + 3
      se fel>anac entao
      anos <- anos + 1
         interrompa
      senao
         anos <- anos + 1
      fimse
      ate fel>anac
   escreval ("Demorou",anos," anos para Felisberto ser maior que Anacleto")
Fimalgoritmo