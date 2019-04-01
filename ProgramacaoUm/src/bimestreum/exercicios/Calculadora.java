package exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int valorUm,valorDois,operacao;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valorUm = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        valorDois = scan.nextInt();

        System.out.println("Que tipo de operação voce deseja fazer com esses números? ");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        operacao = scan.nextInt();

        switch (operacao){
            case 1 :
                System.out.println("O resultado é: "+soma(valorUm,valorDois));
                break;
            case 2 :
                System.out.println("O resultado é: "+subtracao(valorUm,valorDois));
                break;
            case 3 :
                System.out.println("O resultado é: "+multiplicacao(valorUm,valorDois));
                break;
            case 4 :
                System.out.println("O resultado é: "+divisao(valorUm,valorDois));
                break;
            default:
                System.out.println("Operação invalida! Por favor tente novamente.");
                break ;
        }
    }

    private static int soma (int valorUm,int valorDois){
        return valorUm+valorDois;
    }
    private static int subtracao (int valorUm,int valorDois){
        return valorUm-valorDois;
    }
    private static int multiplicacao (int valorUm,int valorDois){
        return valorUm*valorDois;
    }
    private static int divisao (int valorUm,int valorDois){
        return valorUm/valorDois;
    }
}

