package bimestredois.exercicios;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {

        String frase = "";
        char cont = ' ';
        int vogal = 0;
        int consoante = 0;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite uma frase: ");
        frase = scan.nextLine().toLowerCase();

        for (int i = 0; i < frase.length();i++){
            cont = frase.charAt(i);
            if (cont == 'a' || cont == 'e' || cont == 'i' || cont == 'o' || cont == 'u' ){
                vogal ++;
            }else if (cont != ' '){
                consoante ++;
            }else{
            }
        }
        System.out.println("Sua frase: "+frase);
        System.out.println();
        System.out.println("Vogais: "+vogal);
        System.out.println("Consoantes: "+consoante);
    }
}
