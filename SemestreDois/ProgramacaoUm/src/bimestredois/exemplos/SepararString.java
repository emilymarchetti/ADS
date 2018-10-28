package bimestredois.exemplos;

public class SepararString {
    public static void main(String[] args) {

        String nomes = "Ana Maria; Mirella; Rafaela; Gerusca";
        String [] textoSeparado = nomes.split(";");
        for (String item : textoSeparado) {
            System.out.println(item.trim().toLowerCase());
        }



    }
}
