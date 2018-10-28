package exemplos;

public class SomaDouble {
    public static void main (String [] args){
        //Armazenar 5 números reais, somar todos eles e apresentar o total.

        double num[] = new double[4];
        num [0] = 1.0;
        num [1] = 1.0;
        num [2] = 1.0;
        num [3] = 1.0;

        double soma = 0;

        for (int i = 0; i < num.length; i++){
            soma = soma + num [i];
        }
        System.out.println("A soma dos números é: "+soma);
    }
}
