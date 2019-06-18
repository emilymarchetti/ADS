package totvs;

import java.util.Scanner;

public class TesteProva {
    public static void main(String[] args) {

        char letra;

        Prova prova = new Prova();

        Scanner scan = new Scanner (System.in);
        System.out.println("Digite uma letra: ");
        letra = scan.nextLine().charAt(0);

        prova.ordenar(letra);
        System.out.println(prova.cont);
    }
}
