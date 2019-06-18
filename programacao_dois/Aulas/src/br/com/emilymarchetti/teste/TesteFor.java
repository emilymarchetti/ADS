package br.com.emilymarchetti.teste;

public class TesteFor {
    public static void main(String[] args) {

        int primo = 0, cont = 0;

        for(int num = 103; primo < 20; num++){
            for(int i = num; i > 0; i--){
                if(num%i==0){
                    cont++;
                }
                if (i == 1 && cont != 2){
                    cont = 0;
                }
            }
            if(cont == 2){
                primo++;
                cont = 0;
                System.out.println(num);
            }
        }
    }
    }

