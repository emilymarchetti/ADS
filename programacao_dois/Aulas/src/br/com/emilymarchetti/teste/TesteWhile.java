package br.com.emilymarchetti.teste;

public class TesteWhile {
    public static void main(String[] args) {

        int cont3 = 0;
        int cont2 = 0;
        int num = 99;
        int cont = 1;

        while(cont3 < 20){
            while(cont <= num){
                if(num%cont==0){
                    cont2++;
                }
                cont++;
            }
            if(cont2 == 2){
                cont3++;
                //cout << "\n" << num;
                //System.out.println(num);
            }
            cont2 = 0;
            num++;
            num = 0;
        }
    }
}
