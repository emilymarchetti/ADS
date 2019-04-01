Algoritmo "ExUm"

Var
   n: real
funcao parimpar (x: real): caracter
inicio
   se (x%2=0)entao
      retorne ("PAR")
   senao
      retorne ("ÍMPAR")
   fimse
fimfuncao
funcao posinega (x: real): caracter

inicio
   se (x>=0) entao
      retorne "POSITIVO"
   senao
      retorne "NEGATIVO"
   fimse
fimfuncao
Inicio
   escreva ("Digite um número: ")
   leia (n)
   escreval ("O número é ",parimpar(n)," e ",posinega(n))
Fimalgoritmo