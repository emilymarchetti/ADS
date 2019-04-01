Algoritmo "ConjuntoCrescenteDescrescente"

Var
   var1,var2,var3,var4,var5,var6, var7, var8, var9, var10,var11,var12,var13,var14,var15,var16,var17,var18,var19,var20:inteiro
   maior,menor: inteiro

Inicio
   escreva ("Insira 4 números: ")
   leia (var1,var2,var3,var4)
   escreva ("Insira 4 números: ")
   leia (var5,var6,var7,var8)
   escreva ("Insira 4 números: ")
   leia (var9,var10,var11,var12)
   escreva ("Insira 4 números: ")
   leia (var13,var14,var15,var16)
   escreva ("Insira 4 números: ")
   leia (var17,var18,var19,var20)
   escreval (" ")
   escreval ("Grupo 1: ",var1,var2,var3,var4)
   escreval (" ")
   escreval ("Grupo 2: ",var5,var6,var7,var8)
   escreval (" ")
   escreval ("Grupo 3: ",var9,var10,var11,var12)
   escreval (" ")
   escreval ("Grupo 4: ",var13,var14,var15,var16)
   escreval (" ")
   escreval ("Grupo 5: ",var17,var18,var19,var20)
   escreval (" ")

   //CRESCENTE

   //Grupo 1

   se (var1<var2) e (var1<var3) e (var1<var4) entao
      menor <- var1
   fimse
   se(var2<var1) e (var2<var3) e (var2<var4)entao
      menor <- var2
      var2 <- var1
      var1 <- menor
   fimse
   se(var3<var1) e (var3<var2) e (var3<var4)entao
      menor <- var3
      var3 <- var1
      var1 <- menor
   fimse
   se(var4<var1) e (var4<var2) e (var4<var3)entao
      menor <- var4
      var4 <- var1
      var1 <- menor
   fimse
   se (menor<var2) e (var2<var3) e (var2<var4)entao
      menor <- var2
   fimse
   se (menor<var3)e (var3<var2) e (var3<var4)entao
      menor <- var3
      var3 <- var2
      var2 <- menor
   fimse
   se (var4>menor) e (var4<var2)e (var4<var3)entao
      menor <- var4
      var4 <- var2
      var2 <- menor
   fimse
   se (var3<var4)entao
      menor <- var3
   fimse
   se (var4<var3)entao
      menor <- var4
      var4 <- var3
      var3 <- menor
   fimse

   escreval ("A ordem crescente do Grupo 1 é: ", var1,var2,var3,var4)

   //GRUPO 2

   se (var5<var6) e (var5<var7) e (var5<var8) entao
      menor <- var5
   fimse
   se(var6<var5) e (var6<var7) e (var6<var8)entao
      menor <- var6
      var6 <- var5
      var5 <- menor
   fimse
   se(var7<var5) e (var7<var6) e (var7<var8)entao
      menor <- var7
      var7 <- var5
      var5 <- menor
   fimse
   se(var8<var5) e (var8<var6) e (var8<var7)entao
      menor <- var8
      var8 <- var5
      var5 <- menor
   fimse
   se (menor<var6) e (var6<var7) e (var6<var8)entao
      menor <- var6
   fimse
   se (menor<var7)e (var7<var6) e (var7<var8)entao
      menor <- var7
      var7 <- var6
      var6 <- menor
   fimse
   se (var8>menor) e (var8<var6)e (var8<var7)entao
      menor <- var8
      var8 <- var6
      var6 <- menor
   fimse
   se (var8<var7)entao
      menor <- var8
   fimse
   se (var7<var8)entao
      menor <- var8
      var8 <- var7
      var7 <- menor
   fimse
   escreval ("A ordem crescente do Grupo 2 é: ", var5,var6,var7,var8)

   //Grupo 3

   se (var9<var10) e (var9<var11) e (var9<var12) entao
      menor <- var9
   fimse
   se(var10<var9) e (var10<var11) e (var10<var12)entao
      menor <- var10
      var10 <- var9
      var9 <- menor
   fimse
   se(var11<var9) e (var11<var10) e (var11<var12)entao
      menor <- var11
      var11 <- var9
      var9 <- menor
   fimse
   se(var12<var9) e (var12<var10) e (var12<var11)entao
      menor <- var12
      var12 <- var9
      var9 <- menor
   fimse
   se (menor<var10) e (var10<var11) e (var10<var12)entao
      menor <- var10
   fimse
   se (menor<var11)e (var11<var10) e (var11<var12)entao
      menor <- var11
      var11 <- var10
      var10 <- menor
   fimse
   se (var12>menor) e (var12<var10)e (var12<var11)entao
      menor <- var12
      var12 <- var10
      var10 <- menor
   fimse
   se (var12<var11)entao
      menor <- var12
   fimse
   se (var11<var12)entao
      menor <- var12
      var12 <- var11
      var11 <- menor
   fimse
   escreval ("A ordem crescente do Grupo 3 é: ", var9,var10,var11,var12)

   //Grupo 4

   se (var13<var14) e (var13<var15) e (var13<var16) entao
      menor <- var13
   fimse
   se(var14<var13) e (var14<var15) e (var14<var16)entao
      menor <- var14
      var14 <- var13
      var13 <- menor
   fimse
   se(var15<var13) e (var15<var14) e (var15<var16)entao
      menor <- var15
      var15 <- var13
      var13 <- menor
   fimse
   se(var16<var13) e (var16<var14) e (var16<var15)entao
      menor <- var16
      var16 <- var13
      var13 <- menor
   fimse
   se (menor<var14) e (var14<var15) e (var14<var16)entao
      menor <- var14
   fimse
   se (menor<var15)e (var15<var14) e (var15<var16)entao
      menor <- var15
      var15 <- var14
      var14 <- menor
   fimse
   se (var16>menor) e (var16<var14)e (var16<var15)entao
      menor <- var16
      var16 <- var14
      var14 <- menor
   fimse
   se (var16<var15)entao
      menor <- var16
   fimse
   se (var15<var16)entao
      menor <- var16
      var16 <- var15
      var15 <- menor
   fimse
   escreval ("A ordem crescente do Grupo 4 é: ", var13,var14,var15,var16)

   //Grupo 5

   se (var17<var18) e (var17<var19) e (var17<var20) entao
      menor <- var17
   fimse
   se(var18<var17) e (var18<var19) e (var18<var20)entao
      menor <- var18
      var18 <- var17
      var17 <- menor
   fimse
   se(var19<var17) e (var19<var18) e (var19<var20)entao
      menor <- var19
      var19 <- var17
      var17 <- menor
   fimse
   se(var20<var17) e (var20<var18) e (var20<var19)entao
      menor <- var20
      var20 <- var17
      var17 <- menor
   fimse
   se (menor<var18) e (var18<var19) e (var18<var20)entao
      menor <- var18
   fimse
   se (menor<var19)e (var19<var18) e (var19<var20)entao
      menor <- var19
      var19 <- var18
      var18 <- menor
   fimse
   se (var20>menor) e (var20<var18)e (var20<var19)entao
      menor <- var20
      var20 <- var18
      var18 <- menor
   fimse
   se (var20<var19)entao
      menor <- var20
   fimse
   se (var19<var20)entao
      menor <- var20
      var20 <- var19
      var19 <- menor
   fimse
   escreval ("A ordem crescente do Grupo 5 é: ", var17,var18,var19,var20)
   escreval (" ")
   escreval (" ")

   //DECRESCENTE

   //Grupo 1

   se (var1>var2) e (var1>var3) e (var1>var4) entao
      maior <- var1
   fimse
   se(var2>var1) e (var2>var3) e (var2>var4)entao
      maior <- var2
      var2 <- var1
      var1 <- maior
   fimse
   se(var3>var1) e (var3>var2) e (var3>var4)entao
      maior <- var3
      var3 <- var1
      var1 <- maior
   fimse
   se(var4>var1) e (var4>var2) e (var4>var3)entao
      maior <- var4
      var4 <- var1
      var1 <- maior
   fimse
   se (maior>var2) e (var2>var3) e (var2>var4)entao
      maior <- var2
   fimse
   se (maior>var3)e (var3>var2) e (var3>var4)entao
      maior <- var3
      var3 <- var2
      var2 <- maior
   fimse
   se (var4>maior) e (var4>var2)e (var4>var3)entao
      maior <- var4
      var4 <- var2
      var2 <- maior
   fimse
   se (var4>var3)entao
      maior <- var4
   fimse
   se (var3>var4)entao
      maior <- var4
      var4 <- var3
      var3 <- maior
   fimse
   escreval ("A ordem decrescente do Grupo 1 é: ", var1,var2,var3,var4)

   //Grupo 2

   se (var5>var6) e (var5>var7) e (var5>var8) entao
      maior <- var5
   fimse
   se(var6>var5) e (var6>var7) e (var6>var8)entao
      maior <- var6
      var6 <- var5
      var5 <- maior
   fimse
   se(var7>var5) e (var7>var6) e (var7>var8)entao
      maior <- var7
      var7 <- var5
      var5 <- maior
   fimse
   se(var8>var5) e (var8>var6) e (var8>var7)entao
      maior <- var8
      var8 <- var5
      var5 <- maior
   fimse
   se (maior>var6) e (var6>var7) e (var6>var8)entao
      maior <- var6
   fimse
   se (maior>var7)e (var7>var6) e (var7>var8)entao
      maior <- var7
      var7 <- var6
      var6 <- maior
   fimse
   se (var8>maior) e (var8>var6)e (var8>var7)entao
      maior <- var8
      var8 <- var6
      var6 <- maior
   fimse
   se (var8>var7)entao
      maior <- var8
   fimse
   se (var7>var8)entao
      maior <- var8
      var8 <- var7
      var7 <- maior
   fimse
   escreval ("A ordem decrescente do Grupo 2 é: ", var5,var6,var7,var8)

   //Grupo 3

   se (var9>var10) e (var9>var11) e (var9>var12) entao
      maior <- var9
   fimse
   se(var10>var9) e (var10>var11) e (var10>var12)entao
      maior <- var10
      var10 <- var9
      var9 <- maior
   fimse
   se(var11>var9) e (var11>var10) e (var11>var12)entao
      maior <- var11
      var11 <- var9
      var9 <- maior
   fimse
   se(var12>var9) e (var12>var10) e (var12>var11)entao
      maior <- var12
      var12 <- var9
      var9 <- maior
   fimse
   se (maior>var10) e (var10>var11) e (var10>var12)entao
      maior <- var10
   fimse
   se (maior>var11)e (var11>var10) e (var11>var12)entao
      maior <- var11
      var11 <- var10
      var10 <- maior
   fimse
   se (var12>maior) e (var12>var10)e (var12>var11)entao
      maior <- var12
      var12 <- var10
      var10 <- maior
   fimse
   se (var12>var11)entao
      maior <- var12
   fimse
   se (var11>var12)entao
      maior <- var12
      var12 <- var11
      var11 <- maior
   fimse
   escreval ("A ordem decrescente do Grupo 3 é: ", var9,var10,var11,var12)

   //Grupo 4

   se (var13>var14) e (var13>var15) e (var13>var16) entao
      maior <- var13
   fimse
   se(var14>var13) e (var14>var15) e (var14>var16)entao
      maior <- var14
      var14 <- var13
      var13 <- maior
   fimse
   se(var15>var13) e (var15>var14) e (var15>var16)entao
      maior <- var15
      var15 <- var13
      var13 <- maior
   fimse
   se(var16>var13) e (var16>var14) e (var16>var15)entao
      maior <- var16
      var16 <- var13
      var13 <- maior
   fimse
   se (maior>var14) e (var14>var15) e (var14>var16)entao
      maior <- var14
   fimse
   se (maior>var15)e (var15>var14) e (var15>var16)entao
      maior <- var15
      var15 <- var14
      var14 <- maior
   fimse
   se (var16>maior) e (var16>var14)e (var16>var15)entao
      maior <- var16
      var16 <- var14
      var14 <- maior
   fimse
   se (var16>var15)entao
      maior <- var16
   fimse
   se (var15>var16)entao
      maior <- var16
      var16 <- var15
      var15 <- maior
   fimse
   escreval ("A ordem decrescente do Grupo 4 é: ", var13,var14,var15,var16)

   //Grupo 5

   se (var17>var18) e (var17>var19) e (var17>var20) entao
      maior <- var17
   fimse
   se(var18>var17) e (var18>var19) e (var18>var20)entao
      maior <- var18
      var18 <- var17
      var17 <- maior
   fimse
   se(var19>var17) e (var19>var18) e (var19>var20)entao
      maior <- var19
      var19 <- var17
      var17 <- maior
   fimse
   se(var20>var17) e (var20>var18) e (var20>var19)entao
      maior <- var20
      var20 <- var17
      var17 <- maior
   fimse
   se (maior>var18) e (var18>var19) e (var18>var20)entao
      maior <- var18
   fimse
   se (maior>var19)e (var19>var18) e (var19>var20)entao
      maior <- var19
      var19 <- var18
      var18 <- maior
   fimse
   se (var20>maior) e (var20>var18)e (var20>var19)entao
      maior <- var20
      var20 <- var18
      var18 <- maior
   fimse
   se (var20>var19)entao
      maior <- var20
   fimse
   se (var19>var20)entao
      maior <- var20
      var20 <- var19
      var19 <- maior
   fimse
   escreval ("A ordem decrescente do Grupo 5 é: ", var17,var18,var19,var20)


Fimalgoritmo
