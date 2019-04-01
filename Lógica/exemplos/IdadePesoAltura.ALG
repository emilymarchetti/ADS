Algoritmo "IdadePesoAltura"

Var

   altura,peso,media: real
   idade,contpessoa,contpesid,contidade,azuis,ruizul: inteiro
   olhos,cabelo: caracter

Inicio

   para contpessoa de 0 a 19 passo 1 faca
      escreva ("Qual sua idade?: ")
      leia (idade)
      escreva ("Qual seu peso?: ")
      leia (peso)
      escreva ("Qual sua altura?: ")
      leia (altura)
      escreva ("Qual a cor de seus olhos?: ")
      leia (olhos)
      escreva ("Qual a cor do seu cabelo?: ")
      leia (cabelo)

      se (idade>50) e (peso<60) entao
         contpesid <- contpesid + 1
      fimse
      se (altura<1,50)entao
         contidade <- contidade+idade
      fimse
      se (olhos="azul") entao
         azuis <- azuis + 1
      fimse
      se (cabelo="ruivo") e (olhos<>"azul") entao
         ruizul <- ruizul + 1
      fimse
   fimpara
   
    escreval (contpesid,"pessoas tem mais de 50 anos e menos de 60Kg")
    media <- contidade/20
    escreval ("Média das alturas pessoas com altura menor que 1,50: ",media)

Fimalgoritmo