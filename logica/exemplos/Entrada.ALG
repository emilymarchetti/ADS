Algoritmo "Entrada"

Var

   ano,ano2,idade: inteiro
   nome: caracter
Inicio

   escreva ("Em que ano voce nasceu?: ")
   leia (ano)
   escreva ("Em que ano voce esta?: ")
   leia (ano2)
   idade <- ano2-ano
   se idade>= 18 entao
      escreva ("Qual seu nome?: ")
      leia (nome)
      escreval ("")
      escreval (nome,",sua entrada foi autorizada!")
   senao
      escreval ("")
      escreval ("Desculpe, sua entrada não pode ser autorizada.")
   fimse
Fimalgoritmo