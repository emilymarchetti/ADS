Algoritmo "IgualDiferente"


Var

   maior,menor,num,num2: inteiro

Inicio

   escreva ("Insira um número: ")
   leia (num)
   escreva ("Insira outro número: ")
   leia (num2)
   se num=num2 entao
      escreval ("Os dois números são iguais")
   fimse
   se num<>num2 entao
      escreval ("Os dois números são diferentes")
   fimse
   se num>num2 entao
      maior <- num
   senao
      menor <- num
   fimse
   se num2>num entao
      maior <- num2
   senao
      menor <- num2
   fimse

Fimalgoritmo