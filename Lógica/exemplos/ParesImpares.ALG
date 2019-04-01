Algoritmo "ParesImpares"

Var
   contador,resto, par, impar: inteiro

Inicio

   contador <- 1000
   resto <- 0
   enquanto (contador<=10000) faca
      se (contador%11=5) entao
         resto <- resto+1
      fimse
      se (contador%2=0)entao
         contador+1
         par (contador%2=0)
         impar (contador%2=1)
         escreval ("Tem ",contador, " pares")
      senao
         escreval ("Tem ",contador, "ímpares")
      fimse

      contador <- contador+1
   fimenquanto

Fimalgoritmo