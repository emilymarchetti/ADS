Algoritmo "TrocaProcedimento"

Var
   n1,n2,aux: inteiro
procedimento troca(x,y: inteiro)
var
   aux: inteiro
inicio
   aux <- x
   x <- y
   y <- aux
   n1<-x
   n2<-y
fimprocedimento
Inicio
   escreva ("Digite n1: ")
   leia (n1)
   escreval ("Digite n2: ")
   leia (n2)
   troca (n1,n2)
   escreval ("N1 é: ",n1)
   escreval ("N2 é: ",n2)
Fimalgoritmo