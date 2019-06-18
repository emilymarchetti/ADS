Algoritmo "ExDoze"

Var
   sm,result: real
   i,j: inteiro
procedimento soma ()
inicio
j <- 1
   para i de 38 ate 2 passo -1 faca
      sm <- i*(i-1)
      result <- result + (sm/j)
      j <- j + 1
   fimpara
fimprocedimento
Inicio
   soma ()

Fimalgoritmo