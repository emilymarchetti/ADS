package exercicios;

import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String maiorVinte = "";

        for (int i = 0;i< 10;i++) {
            System.out.println("Digite o elemento "+i+":");
            lista[i]= scan.nextInt();
        }
        ordeminversa();

        //Dado uma lista de 10 elementos inteiros retorne todos elementos que são maior que 20

        for (int i = 0; i < lista.length; i++){
            if (lista[i] > 20){
                maiorVinte = maiorVinte + lista[i] + " ";
            }
        }
        System.out.println("Maiores que 20: "+maiorVinte);
    }
    public static Integer[] lista = new Integer[10];

    //Imprima 10 elementos de uma lista na ordem inversa

    public static void ordeminversa (){
        for (int i=9; i >= 0;i--){
            System.out.println("Posição "+i+": "+lista[i]);
        }


    }
}
