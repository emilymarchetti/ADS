Algoritmo "QuadradoRaiz"

Var

   num,raiz,quadr: real

Inicio

   escreva ("Insira um n�mero: ")
   leia (num)
   se num>=0 entao
      raiz <- raizq (num)
      escreval ("A raiz quadrada de",num," �: ", raiz)
   senao
      quadr <- num^2
      escreval ("O quadrado de, ",num," �: ", quadr)
   fimse



Fimalgoritmo