Algoritmo "ParImpar"

Var
   numero: inteiro
funcao par_ou_impar(num: inteiro): caracter
inicio
   se (num%2=0) entao
      retorne "O n�mero � par"
   senao
      retorne "O n�mero � impar"
   fimse
fimfuncao
Inicio
   escreva ("Digite um n�mero: ")
   leia (numero)
   escreva (par_ou_impar(numero))
fimalgoritmo

Fimalgoritmo