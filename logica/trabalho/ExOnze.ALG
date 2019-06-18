Algoritmo "ExOnze"
Var
i,j,n1: inteiro
procedimento tabuada (x: inteiro)
inicio
         para i de 1 ate x faca
      para j de 1 ate 10 faca
         escreval (i," X",j," =",j*i)
      fimpara
      escreval ("")
   fimpara
fimprocedimento
Inicio
   escreva("Voce quer a tabuada do 1 até quanto?: ")
   leia (n1)
   limpatela
   escreval ("-------------------- TABUADA DO 1 AO",n1," --------------------")
   tabuada(n1)
Fimalgoritmo