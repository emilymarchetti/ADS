Algoritmo "RestaUm"

Var
   mt: vetor [1..7,1..7] de caracter
   l,c: inteiro
   linha,coluna: inteiro
   direcao: caracter
procedimento preenche ()
inicio
   para l de 1 ate 7 faca
      para c de 1 ate 7 faca
         se ((l=1)ou(l=2)ou(l=6)ou(l=7)) e ((c=1) ou( c=2) ou (c=6) ou (c=7)) entao
            mt[l,c] <- ("  ")
         senao
            se ((l=4) e (c=4)) entao
               mt[l,c] <- ("- ")
            senao
               mt [l,c] <- ("* ")
            fimse
         fimse
      fimpara
   fimpara
   escreval ("       RESTA UM         ")
   escreval ("")
   para l de 1 ate 7 faca
      para c de 1 ate 7 faca
         escreva ("  ",mt[l,c]:1)
      fimpara
      escreval ("":3)
   fimpara
fimprocedimento
Inicio
   preenche ()
   escreval ("")
   escreva ("Insira a linha e, logo depois, a coluna: ")
   leia (linha,coluna)
   se (mt[linha,coluna]="* ") entao
      escreval ("Escolha uma direção(D=direita - E=esquerda - B=baixo - C=cima: ")
      leia (direcao)
   fimse
Fimalgoritmo