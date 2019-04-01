Algoritmo "ExSete"
tipo
   regis = registro
      votos:inteiro
      nome:caracter
   fimregistro
var
   i,voto,vot: inteiro
   eleicao: vetor [1..4] de regis
Inicio
   para i de 1 ate 3 faca
      escreva ("Escreva o nome do candidato nº",i,": ")
      leia (eleicao[i].nome)
      limpatela
   fimpara
   escreva ("Qual o número total de votantes?: ")
   leia (vot)
   limpatela
   para i de 1 ate vot faca
      escreval ("Vote 1 para ",eleicao[1].nome)
      escreval ("Vote 2 para ",eleicao[2].nome)
      escreval ("Vote 3 para ",eleicao[3].nome)
      leia (voto)
      se (voto<>1) e (voto<>2) e (voto<>3) entao
         eleicao[4].votos <- eleicao[4].votos + 1
      senao
         eleicao[voto].votos <- eleicao[voto].votos + 1
      fimse
      limpatela
   fimpara
   para i de 1 ate 3 faca
      escreval ("Candidato(a) ",eleicao[i].nome,":",eleicao[i].votos," votos")
   fimpara
   escreval ("Votos nulos: ",eleicao[4].votos)
Fimalgoritmo
