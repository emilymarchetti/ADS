Algoritmo "ExTreze-2"

tipo
   regis=registro
      nome,sexo: caracter
      altura: real
   fimregistro
Var
   media,maior,menor,ph,pm: real
   h,f,m,i: inteiro
   pessoa: vetor [1..3] de regis
Inicio
   para i de 1 ate 50 faca
      escreva ("Digite o nome: ")
      leia (pessoa[i].nome)
      escreva ("Digite a altura: ")
      leia (pessoa[i].altura)
      se i=1 entao
         menor <- pessoa[i].altura
      fimse
      se pessoa[i].altura>maior entao
         maior <- pessoa[i].altura
      fimse
      se pessoa[i].altura<menor entao
         menor <- pessoa[i].altura
      fimse
      escreva ("Sexo (Masculino ou Feminino): ")
      leia (pessoa[i].sexo)
      se (pessoa[i].sexo)= "masculino" entao
         m <- m+1
      senao
         f <- f+1
      fimse
      se (pessoa[i].sexo)= "feminino" entao
         media <- media + pessoa[i].altura
      fimse
   fimpara
   escreval ("A maior altura é,",maior,"e a menor é ",menor)
   escreval ("A média da altura da mulheres é ",media/m)
   escreval ("O número total de homens é ",h)
   escreval ("A média de homens é",(m*100)/50,"% e de mulheres é ",(f*100)/50,"%")
Fimalgoritmo