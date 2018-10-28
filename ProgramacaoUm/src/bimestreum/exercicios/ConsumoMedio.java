package exercicios;

import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {

        float litros;
        int kmInicial,kmFinal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quilometragem inicial");
        kmInicial = scan.nextInt();

        System.out.println("Digite a quilometragem final");
        kmFinal = scan.nextInt();

        System.out.println("Digite o total de combustivel consumido em litros");
        litros = scan.nextFloat();

        System.out.printf("A média de combustivel consumido foi de %.1f ",(kmFinal-kmInicial)/litros , " Km/L");

    }
}
