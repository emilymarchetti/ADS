package bimestreum.exercicios;

public class MaiorMenor {
    public static void main (String [] args){

        double[] num = new double[10];
        num[0] = 1.5;
        num[1] = 2.5;
        num[2] = 3.5;
        num[3] = 4.5;
        num[4] = 5.5;
        num[5] = 6.5;
        num[6] = 7.5;
        num[7] = 8.5;
        num[8] = 9.5;
        num[10] = 10.5;

        double maior,menor;

        maior = num[0];
        menor = num [0];

        for (int i = 0; i < num.length; i++){
            if (num[i]>maior){
                maior = num[i];
            }
            if (num[i]<menor){
                menor = num[i];
            }
        }
        System.out.println("O maior número é: " +maior);
        System.out.println("O menor número é: " +menor);
    }
}
