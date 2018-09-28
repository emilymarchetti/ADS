package exercicios;

import java.util.Scanner;

public class CalcImc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double peso,altura,imc;

        System.out.println("Digite seu peso em Kg");
        peso = scan.nextDouble();

        System.out.println("Digite sua altura em metros");
        altura = scan.nextDouble();

        imc = peso/(altura*altura);

        System.out.println(imc);

        if (imc < 17){
            System.out.println("Muito abaixo do peso");
        }else if (imc >= 17 && imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Acima do peso");
        }else if (imc >= 30 && imc < 35){
            System.out.println("Obesidade I");
        }else if (imc >= 35 && imc < 40){
            System.out.println("Obesidade II (Severa)");
        }else{
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
