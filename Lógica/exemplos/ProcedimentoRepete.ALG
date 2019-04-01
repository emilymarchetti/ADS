Algoritmo "ProcedimentoRepete"

Var
   palavra: caracter
procedimento repete(texto: caracter;n: inteiro)
var
   i : inteiro

inicio
   para i de 1 ate n faca
      escreval (texto)
   fimpara
   texto <- "Professor"
fimprocedimento
inicio
   escreva ("Digite uma palavra: ")
   leia (palavra)
   repete (palavra,10)
   escreval (palavra)
fimalgoritmo
