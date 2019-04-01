Algoritmo "QuadradoRaiz"

Var

   num,raiz,quadr: real

Inicio

   escreva ("Insira um número: ")
   leia (num)
   se num>=0 entao
      raiz <- raizq (num)
      escreval ("A raiz quadrada de",num," é: ", raiz)
   senao
      quadr <- num^2
      escreval ("O quadrado de, ",num," é: ", quadr)
   fimse



Fimalgoritmo