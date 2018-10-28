package exercicios;

import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int n;

        System.out.println("Escolha um número: ");
        n = scan.nextInt();

        int soma = 0;
        String print = "";

        for (int i = 1; i <= n;i++) {
            soma += i;
            if (i == n) {
                print = (print + i + " = ");
            } else {
                print = (print + i + " + ");
            }
        }

        System.out.println(print + soma);
    }
}
