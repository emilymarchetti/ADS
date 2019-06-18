Algoritmo "ExOito"
Var
   i,a,b,v: inteiro
funcao primo (x,y: inteiro): caracter
inicio
   para i de x ate y faca
      se (i<>1)e(i%2<>0)e(i%3<>0)e(i%5<>0)e(i%7<>0)e(i%11<>0)ou(i=2)ou(i=3)ou (i=5) ou (i=7) ou (i=11)entao
         escreval (i," é primo.")
      senao
            escreval (i," não é primo.")
         fimse
      fimpara
fimfuncao
Inicio
   enquanto (v<>1) faca
      escreva ("Digite um número: ")
      leia (a)
      escreva ("Digite outro número: ")
      leia (b)
      se (a>b)entao
         limpatela
         escreval ("")
         escreval ("         Desculpe mas o 2º número deve ser maior que o 1º")
         escreval("")
         escreval ("")
      senao
         v <- 1
         escreval (primo (a,b))
      fimse
   fimenquanto
Fimalgoritmo