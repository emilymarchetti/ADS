Algoritmo "ExQuatorze"

Var
   i: inteiro
   nt: real
   notas: vetor [1..3] de real
Inicio
   para i de 1 ate 3 faca
      escreva ("Digite a 1ª nota do aluno",i,": ")
      leia (notas[i])
      nt <- nt + (notas[i]*2)
      escreva ("Digite a 2ª nota do aluno",i,": ")
      leia (notas[i])
      nt <- nt + (notas[i]*4)
      escreva ("Digite a 3ª nota do aluno",i,": ")
      leia (notas[i])
      nt <- nt + (notas[i]*3)
      notas[i] <- nt/9
      escreval ("")
   fimpara
   escreval ("")
   para i de 1 ate 3 faca
      escreval ("A média poderada do(a) aluno(a)",i," é",notas[i])
   fimpara
Fimalgoritmo