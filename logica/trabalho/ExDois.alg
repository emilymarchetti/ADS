Algoritmo "ExDois"
Var
   m1,m2,m3: real
funcao media (x,y,z: real): real
inicio
   retorne (x+y+z)/3
fimfuncao
Inicio
   escreva ("Digite sua 1� nota: ")
   leia (m1)
   escreva ("Digite sua 2� nota: ")
   leia (m2)
   escreva ("Digite sua 3� nota: ")
   leia (m3)
   se media (m1,m2,m3)>=7 entao
      escreval ("Aprovado!")
   senao
      escreval ("Reprovado!")
   fimse
   se media (m1,m2,m3)=10 entao
      escreval ("Parab�ns voc� foi aprovado com louvor! :)")
   fimse
Fimalgoritmo