package exercicios;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double peso,altura,imc;

        System.out.println("Digite seu peso em Kg");
        peso = scan.nextDouble();

        System.out.println("Digite sua altura em metros");
        altura = scan.nextDouble();

        imc = peso/(altura^2);

        if (imc < 17){
            System.out.println("Muito abaixo do peso");
        }else if (imc > 17 && imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc => 18.5 && imc < 25){
            System.out.println("Peso normal");
        }else if (imc > 25 && imc < 30){
            System.out.println("Acima do peso");
        }else if (imc >= 30 && );
    }
}
