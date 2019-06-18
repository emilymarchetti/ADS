Algoritmo "ExMatriz-2"

Var
   matriz: vetor [1..2,1..3] de real
   matrizt: vetor[1..3,1..2] de real
   lin,col: inteiro

Inicio

   para lin de 1 ate 2 faca
      para col de 1 ate 3 faca
         escreval ("Insira um número para [",lin,",",col,"]")
         leia (matriz[lin,col])
         matrizt[col,lin] <- matriz[lin,col]
      fimpara
   fimpara
   para lin de 1 ate 3 faca
      para col de 1 ate 2 faca
         escreva (matrizt[lin,col]:5)
      fimpara
      escreval ("")
   fimpara

Fimalgoritmo