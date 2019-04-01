Algoritmo "MatrizMeio"

Var

   matriz: vetor[1..5,1..5] de real
   matriz2: vetor[1..5,1..5] de real
   l,c : inteiro

Inicio

   para l de 1 ate 5 faca
      para c de 1 ate 5 faca
         escreval ("Digite um número inteiro: [",l,",",c,"]")
         leia (matriz[l,c])
         matriz2[l,c] <- matriz[l,c]^3
      fimpara
   fimpara
   para l de 1 ate 5 faca
      para c de 1 ate 5 faca
         escreva(matriz2[l,c]:9)
      fimpara
      escreval ("")
   fimpara
   escreval ("")
   escreval ("Meio: ", matriz2[3,3])
Fimalgoritmo