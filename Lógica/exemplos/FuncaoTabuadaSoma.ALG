Algoritmo "FuncaoTabuadaSoma"

Var
   n1,n2: real
   contador: inteiro
funcao soma (a,b:real):real
retorne a + b
fimfuncao
procedimento tabuada (a:real)
var
   cont: inteiro
inicio
   para cont de 1 ate 10 faca
      escreval (a, " x", cont,"=", a*cont)
   fimpara
fimprocedimento
inicio
   escreva ("Digite um número: ")
   leia (n1)
   escreva ("Digite outro número: ")
   leia (n2)
   escreval ("Soma: ",soma(n1,n2))
   para contador de int(n1) ate int(n2) faca
      escreval ("-----------------------------")
      escreval ("TABUADA DO",contador)
      escreval ("-----------------------------")
      tabuada (contador)
   fimpara
Fimalgoritmo