Algoritmo "Pitagoras"

Var
 hipotenusa,cateto1,cateto2,totalc,totalcc,totalh,totalhh: real
 resposta: caracter
 
Inicio
escreval ("O que voce deseja calcular? Hipotenusa ou Cateto?", resposta)
leia (resposta)
escolha resposta
         caso "cateto"
              escreval ("Insira a Hipotenusa:>", hipotenusa)
              leia (hipotenusa)
              escreval ("Outro cateto:>", cateto1)
              leia (cateto1)
              totalc <- cateto1^2+hipotenusa^2
              totalcc <- raizq (totalc)
              escreva ("O resultado é:>", totalcc)
           caso "hipotenusa"
                escreval ("Insira o primeiro cateto:>", cateto1)
                leia (cateto1)
                escreval ("Insira o segundo cateto:>", cateto2)
                leia (cateto2)
                totalh <- cateto1^2+cateto2^2
                totalhh <- raizq (totalh)
                escreval ("O resultado é:", totalhh)
                fimescolha
                
Fimalgoritmo