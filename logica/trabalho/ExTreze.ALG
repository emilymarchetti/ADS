Algoritmo "ExTreze"

Var
   n: inteiro
   a,b,c: real
funcao triangulo (x,y,z: real): caracter
inicio
   se (x=y) e (x<>z)ou(x=z)e(x<>y)ou(y=z)e(y<>x)entao
      retorne "is�sceles"
   fimse
   se (x<>y) e (y<>z) e (x<>z) entao
      retorne "escaleno"
   fimse
   se (x=y) e (y=z) e (x=z) entao
      retorne "equil�tero"
   fimse
fimfuncao
Inicio
   repita
      escreva ("Digite o 1� lado: ")
      leia (a)
      escreva ("Digite o 2� lado: ")
      leia (b)
      escreva ("Digite o 3� lado: ")
      leia (c)
      se (b+c>a)e(a+c>b)e(a+b>c) entao
         n <- 1
         escreval ("Esse triangulo � um ",triangulo (a,b,c))
      senao
         limpatela
         escreval ("Desculpe mas isso n�o � um triangulo. Tente novamente")
      fimse
   ate n = 1
Fimalgoritmo