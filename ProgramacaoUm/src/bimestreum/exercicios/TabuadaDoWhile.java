package exercicios;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {

        int x = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da tabuada que deseja exibir: ");
        x = scan.nextInt();

        imprimirTabuada(x);

    }

    private static void imprimirTabuada(int tabuada) {

        int i = 0;

        do {
            System.out.println(tabuada + " X " + i + " = " + tabuada * i);
            i++;
        } while (i <= 10);

    }
}
