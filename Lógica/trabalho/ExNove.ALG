Algoritmo "ExNove"

Var
   soma,result: real
   x, divi: inteiro
Inicio
   x <- 1000
   para divi de 1 ate 50 passo 1 faca
      soma <- x/divi
      se (divi%2=0) entao
         result <- result - soma
      senao
         result <- result + soma
      fimse
      se divi=50 entao
         interrompa
      fimse
      x <- x - 3
   fimpara
   escreval ("A soma é: ",result)
Fimalgoritmo