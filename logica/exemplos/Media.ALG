Algoritmo "Media"

Var
 numero1, numero2, numero3, numero4, media, total: real

Inicio
   escreva ("1� Bimestre:")
           leia (numero1)
   escreva ("2� Bimestre:")
           leia (numero2)
   escreva ("3� Bimestre:")
           leia (numero3)
   escreva ("4� Bimestre:")
           leia (numero4)
        total <- numero1+numero2+numero3+numero4
        media <- total/4
        escreva ("O resultado �: ", media)
   se (media>=6) entao
       escreva (" Aprovado")
   senao
        escreva (" Reprovado")
   fimse
Fimalgoritmo