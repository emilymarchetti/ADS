Algoritmo "ParImpar"

Var
   numero: inteiro
funcao par_ou_impar(num: inteiro): caracter
inicio
   se (num%2=0) entao
      retorne "O número é par"
   senao
      retorne "O número é impar"
   fimse
fimfuncao
Inicio
   escreva ("Digite um número: ")
   leia (numero)
   escreva (par_ou_impar(numero))
fimalgoritmo

Fimalgoritmo