Algoritmo "Bonus"

Var

   nome: caracter
   valor,x,cliente: real

Inicio

   enquanto cliente < 16 faca
   escreval ("") ("   Bem vindo ao bonus anual de compras para nossos clientes       ")
   escreval ("          A empresa x agradece a sua preferencia       ")
   escreval ("")
   escreval ("")
   escreva ("Por favor digite seu nome completo: ")
   leia (nome)
   escreval ("     Bem-vindo ",nome,"       ")
   escreva ("Escreva o valor total de suas compras do ano passado em R$: ")
   leia (valor)
   se (valor<=1000) entao
      x <- (valor*10)/100
   fimse
   se (valor>1000) entao
      x <- (valor*15)/100
   fimse
   escreva ("Seu bonus em R$ é de: ", x)
   escreval ("")
   cliente <- cliente+1
   fimenquanto

Fimalgoritmo