Algoritmo "ExDois"
Var
   m1,m2,m3: real
funcao media (x,y,z: real): real
inicio
   retorne (x+y+z)/3
fimfuncao
Inicio
   escreva ("Digite sua 1ª nota: ")
   leia (m1)
   escreva ("Digite sua 2ª nota: ")
   leia (m2)
   escreva ("Digite sua 3ª nota: ")
   leia (m3)
   se media (m1,m2,m3)>=7 entao
      escreval ("Aprovado!")
   senao
      escreval ("Reprovado!")
   fimse
   se media (m1,m2,m3)=10 entao
      escreval ("Parabéns você foi aprovado com louvor! :)")
   fimse
Fimalgoritmo