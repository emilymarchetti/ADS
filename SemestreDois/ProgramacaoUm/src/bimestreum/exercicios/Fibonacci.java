package exercicios;

public class Fibonacci {
    public static void main(String[] args) {

        Integer [] soma3 = new Integer [40];
        String soma = "";
        int soma2 = 0;
        //int j = 1;
        soma3 [0] = 1;
        soma3 [1] = 1;
        for (int i = 1; i < soma3.length;i++){
            soma3[i+1] = soma3[i] + soma3[i-1];
            if (i!=1){
                soma = (soma + "," + soma3[i-1]);
            }else{
                soma = ("" + soma3[i-1]);
            }
            if (soma3[i]>= 500){
                break;
            }
            //soma2 = soma3[i];
        }
        System.out.println(soma);
    }
}
