package br.com.emilymarchetti.exercicios;

import java.io.*;
import java.util.*;

public class Forca {

    public static void main(String[] args) {

        Random random = new Random();



        Scanner scan = new Scanner(System.in);

        String banco = "Forca.txt";

        LineNumberReader leitorLinha = new LineNumberReader(new FileReader("C:/Users/dev-01/Google Drive/Forca.txt"));
        leitorLinha.skip(Long.MAX_VALUE);
        int quantPalavras = leitorLinha.getLineNumber() + 1;
        System.out.println("Existem " + quantPalavras + " palavras!\n");

        leitorLinha.close();

        String[] palavras = new String[quantPalavras];

        BufferedReader leitorArquivo = new BufferedReader(new FileReader("C:/Users/dev-01/Google Drive/Forca.txt"));

        String linhaLida;
        int linha = 0;

        while ((linhaLida = leitorArquivo.readLine()) != null) {
            palavras[linha] = linhaLida.trim();
            linha++;
        }
        leitorArquivo.close();

        int indiceSorteado = random.nextInt(quantPalavras);
        String sorteada = palavras[indiceSorteado];
        sorteada.trim();

        char[] acertos = new char[sorteada.length()];
        for (int i = 0; i < acertos.length; i++) {
            acertos[i] = 0;

            if (sorteada.charAt(i) == '-')
                acertos[i] = 1;
        }

        String letrasUtilizadas = "";

        char letra;

        boolean ganhou = false;
        int vidas = 7;

        System.out.println();

        for (int i = 0; i < sorteada.length(); i++) {
            if (acertos[i] == 1) {
                System.out.print(" - ");
            } else {
                System.out.print(" _ ");
            }
        }

        System.out.println("\n");

        do {

            System.out.print("-> Dica: Objetos \n" + "-> Você tem " + vidas + " vidas" + "\n-> Letras utilizadas: "
                    + letrasUtilizadas + "\n-> Escolha uma letra: ");

            System.out.println();
            String digitado = scan.nextLine().toUpperCase();

            if (digitado.length() > 1) {
                if (digitado.equals(sorteada)) {
                    ganhou = true;
                    break;
                } else {
                    vidas = 0;
                    break;
                }
            } else {
                letra = digitado.charAt(0);
                letrasUtilizadas += " " + letra;

                boolean perdeVida = true;
                for (int i = 0; i < sorteada.length(); i++) {

                    if (letra == sorteada.charAt(i)) {
                        acertos[i] = 1;
                        perdeVida = false;
                    }
                }

                if (perdeVida) {
                    vidas--;
                }
            }
            System.out.println("\n");
            ganhou = true;
            for (int i = 0; i < sorteada.length(); i++) {

                if (acertos[i] == 0) {
                    System.out.print(" _ ");
                    ganhou = false;

                } else {
                    System.out.print(" " + sorteada.charAt(i) + " ");
                }
            }

            System.out.println("\n");

        } while (!ganhou && vidas > 0);
        if (vidas != 0) {
            System.out.println("\n\t Você ganhou!! ");
        } else {
            System.out.println("\n\t Ops você perdeu! ");
            System.out.println("\tA palavra era: " + sorteada.toUpperCase());
        }
    }
}