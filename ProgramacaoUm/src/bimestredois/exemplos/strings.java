package bimestredois.exemplos;

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {

        /*String nome = "Emily";
        String nome = "Emily\nMarchetti";
        String nome = "Emily\tMarchetti";
        String nome = "Emily\'Marchetti\'";
        String nome = "Emily\"Marchetti\"";
        String nome = "Emily\t\\\tMarchetti\\\\\\\\\\";
        String endereco = new String ("Emily");
        String endereco = null;
        System.out.println(nome);
        int tamanhoString = nome.length();
        System.out.println(tamanhoString);*/

        //Concatenação
        /*String endereco = "Rua Constituição";
        String numero = "1148";
        String bairro = "Zona 2";
        String enderecoCompleto = endereco.concat(", ");
        enderecoCompleto += numero.concat(" - ");
        enderecoCompleto += bairro.concat("");
        System.out.println(enderecoCompleto);*/

        /*String nomeCompleto = "Cianorte - Faculdade Facec";
        char decimoChar = nomeCompleto.charAt(9);
        System.out.println("O décimo caracter da string é: "+decimoChar);*/

        /*String nomeCompleto = "Cianorte - Faculdade Facec";
        char[] nomeCompArray = nomeCompleto.toCharArray();

        for (char letra: nomeCompArray){
            System.out.print(letra);
        }
        System.out.println();
        System.out.println(Arrays.toString(nomeCompArray));*/

        /*String nomeCompleto = "Cianorte - Faculdade Facec";
        System.out.println("A letra 'n' aparece primeiro na posição (" +
                (nomeCompleto.indexOf('p')) + ") ");
        System.out.println("A letra 'e' aparece primeiro na posição (" +
        (nomeCompleto.lastIndexOf('e')) + ") ");*/

        /*String stringE = "um; dois; tres; quatro";
        String numeroDois = stringE.substring(4,8);
        System.out.println("Numero dois : "+numeroDois);*/

        String nome = "Emily";
        System.out.println("Maiusculo: "+ nome.toUpperCase());
        System.out.println("Minúsculo: "+ nome.toLowerCase());
    }
}
