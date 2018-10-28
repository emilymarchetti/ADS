package exercicios;

import java.util.Scanner;

public class ParesImpares {
    public static Integer[] num;

    public static void main(String[] args) {

        num = new Integer [10];
        Scanner scan = new Scanner (System.in);

        for (int i=0; i < num.length;i++){
            System.out.println("Digite o " +(i+1)+"º número");
            num [i] = scan.nextInt();
        }
        Quantidade();
    }

    private static void Quantidade (){

        int numpares = 0;
        String pares = "";

        int numimpares = 0;
        String impares = "";

        for (int i = 0; i < num.length; i++){
            if (num[i]%2 == 0){
                numpares++;
                pares = pares + num[i] + " ";
            }else{
                numimpares++;
                impares = impares + num[i] + " ";
            }
        }
        System.out.println("Quantidade de pares: "+ numpares);
        System.out.println("Quantidade de impares: "+ numimpares);
        System.out.println("Impares: "+impares);
        System.out.println("Pares: "+pares);
    }
}
