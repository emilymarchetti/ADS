Algoritmo "Bhaskara"

Var

triangulo,triangulo1: real
a,b,c,x,xx,xxx,xx1,xx2,triangulo2: real

Inicio

escreva ("A= ")
leia (a)
escreva ("B= ")
leia (b)
escreva ("C= ")
leia (c)
triangulo <- b^2-4
triangulo1 <- a*c
triangulo2 <- triangulo*triangulo1
escreval ("O resultado é: ", triangulo2)
se triangulo2<0 entao
  escreval ("Não existe raiz quadrada de numero negativo")
  senao
  x <- -b
  xx <- raizq (triangulo2)
  xxx <- 2*a
  xx1 <- (x+xx)/xxx
  xx2 <-  (x-xx)/xxx
  escreval ("X1: ", xx1)
  escreval ("X2: ", xx2)
  fimse

Fimalgoritmo