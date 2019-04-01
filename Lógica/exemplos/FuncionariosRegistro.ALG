Algoritmo "FuncionariosRegistro"

 tipo
  regis = registro
    mat:    inteiro
    nome:   caractere
    salbruto,inss,salliq : real
    i :   inteiro
  fimregistro
Var
   func: vetor[1..2] de regis
   i: inteiro

Inicio
   para i de 1 ate 2 faca
      escreva ("Digite a matricula do funcionário:")
      leia (func[i].mat)
      escreva ("Digite o nome do fucionário:")
      leia (func[i].nome)
      escreva ("Digite o salário bruto do funcionário:")
      leia (func[i].salbruto)
   fimpara
   para i de 1 ate 2 faca
      func[i].inss <- func[i].salbruto*0.11
      func[i].salliq <- func[i].salbruto - func[i].inss
   fimpara
   para i de 1 ate 2 faca
      escreval ("Matricula: ",func[i].mat)
      escreval ("Nome: ",func[i].nome)
      escreval ("Salário Bruto: ",func[i].salbruto)
      escreval ("Inss: ",func[i].inss)
      escreval ("Salário Liquido: ",func[i].salliq)
      escreval("-----------------------------------------")
   fimpara

Fimalgoritmo