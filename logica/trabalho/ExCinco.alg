Algoritmo "ExCinco"
Var
   a,b,i: inteiro
   cub,soma: real
funcao cubos (x,y: inteiro): real
inicio
   escreval ("")
   escreval ("Ok podemos prosseguir!")
   escreval ("")
   para i de x ate y faca
      se (i%2=0) entao
         cub <- i^3
         soma <- soma + cub
      fimse
   fimpara
   retorne soma
fimfuncao
Inicio
   repita
      escreva ("Digite o 1� n�mero: ")
      leia (a)
      escreva ("Digite o 2� n�mero: ")
      leia (b)
      se b>a entao
         escreval ("A soma do cubo dos n�mero pares nesse intervalo �:",cubos (a,b))
      senao
         limpatela
         escreval ("Desculpe mas o 2� n�mero deve ser maior que o 1� :(")
         escreval ("                Vamos tentar de novo?")
         escreval ("")
      fimse
   ate b>a
Fimalgoritmo