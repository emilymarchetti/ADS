Algoritmo "VetorMenor"

Var
   cont,menor: inteiro //cont poderia ser coluna ou a posi�ao q ele esta
   vet: vetor [1..10] de inteiro
Inicio
   para cont de 1 ate 10 passo 1 faca
      escreva("Digite um n�mero: ")
      leia(vet[cont])//nome da variavel[posi��o do vetor]
   fimpara
   para cont de 1 ate 10 passo 1 faca
      se (cont = 1)entao
         menor <- vet[cont]
      fimse
      se (vet[cont] < menor) entao
         menor <- vet[cont]
      fimse
fimpara
   escreval ("O menor valor do vetor �: ",menor)
Fimalgoritmo