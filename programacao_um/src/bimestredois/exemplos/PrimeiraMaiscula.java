package bimestredois.exemplos;

public class PrimeiraMaiscula {
    public static void main(String[] args) {

        String frase = "estou estudando programação java";
        String [] partes = frase.split(" ");
        String fraseConvertida = "";

        for (int i = 0; i < partes.length; i++){
            String palavra = partes [i];
            palavra = palavra.substring(0,1).toUpperCase() + palavra.substring(1);
            fraseConvertida += palavra + " ";
        }

        System.out.println(fraseConvertida);

    }
}
