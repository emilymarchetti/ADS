package exercicios;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        float notaUm, notaDois;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        notaUm = scan.nextFloat();

        System.out.println("Insira a segunda nota: ");
        notaDois = scan.nextFloat();

        System.out.println("O aluno foi " + media(notaUm, notaDois));
    }

    private static String media(float notaUm, float notaDois) {
        float md;

        md = (notaUm + notaDois) / 2;

        if (md >= 6.0) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
}