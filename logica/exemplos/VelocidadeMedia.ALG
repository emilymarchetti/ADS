Algoritmo "VelocidadeMedia"

Var
vmedia,distp,temp:real

Inicio

escreva ("Qual a distancia percorrida? (Em km/h): ")
leia (distp)
escreva ("Qual o tempo?: ")
leia (temp)
vmedia <- distp/(temp/60)
escreval ("A velocidade média é: ", vmedia," Km/h")

Fimalgoritmo