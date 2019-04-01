package exemplos;

public class NotaAluno {
    public static void main (String [] args){

        double notas [][] = {
                {7.5, 8.0, 9.9, 6.0},
                {7.5, 8.0, 9.9, 6.0},
                {7.5, 8.0, 9.9, 6.0},
                {7.5, 8.0, 9.9, 6.0},
                {6.5, 8.0, 9.9, 6.0},
                {4.5, 8.0, 1.0, 6.0},
                {7.5, 8.0, 9.9, 6.0},
                {4.5, 4.0, 1.8, 1.0},
                {7.5, 8.0, 9.9, 6.0},
                {7.5, 8.0, 8.9, 6.0},
        };
        double media[] = new double [10];
        String result = "";
        for (int i = 0;i < notas.length;i++) {
            System.out.println("");
            for (int j = 0; j < notas[i].length; j++){
                System.out.println("Nota do aluno " +i+ ": " +notas[i][j]);
            }
        }
        System.out.println("");
        for (int i = 0; i < notas.length;i++) {
            for (int j = 0; j < notas[i].length; j++) {
                media[i] = media [i] + (notas[i][j]);
            }
            media[i] = media[i]/4;
            if (media[i] >= 6.0) {
                result = "aprovado";
            }else{
                result = "reprovado";
            }
            System.out.println("A media do aluno "+ i + " é " +media[i]+ " e ele está "+result);
        }
    }
}