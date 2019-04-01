Algoritmo "ExTres"

procedimento calculo ()

Var
   i,maior,menor,id: inteiro
   media: real
Inicio
   i <- 1
   enquanto i>0 faca
      escreva ("Digite uma idade: ")
      leia (id)
      se i=1 entao
         menor <- id
      fimse
      se id = 0 entao
         i <- i-1
         interrompa
      fimse
      media <- media+id
      se id>maior entao
         maior <- id
      fimse
      se id<menor entao
         menor <- id
      fimse
      i <- i+1
   fimenquanto
   escreval ("A média das idades é:", media/i)
   escreval ("O maior número é",maior," e o menor é",menor)
fimprocedimento
inicio
   calculo ()
Fimalgoritmo