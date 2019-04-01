Algoritmo "Media"

Var
 numero1, numero2, numero3, numero4, media, total: real

Inicio
   escreva ("1º Bimestre:")
           leia (numero1)
   escreva ("2º Bimestre:")
           leia (numero2)
   escreva ("3º Bimestre:")
           leia (numero3)
   escreva ("4º Bimestre:")
           leia (numero4)
        total <- numero1+numero2+numero3+numero4
        media <- total/4
        escreva ("O resultado é: ", media)
   se (media>=6) entao
       escreva (" Aprovado")
   senao
        escreva (" Reprovado")
   fimse
Fimalgoritmo