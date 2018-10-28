package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

    public static void main (String [] args){

        int escolha;

        Scanner scan = new Scanner (System.in);

        System.out.println ("---------------- Bem vindo ao Jokenpô! -------------------");
        System.out.println("");
        System.out.println("1 - Jogo local");
        System.out.println("2 - Jogar contra o computador");
        escolha = scan.nextInt();

        if (escolha==1){
            JokempoLocal();
        }else if (escolha==2){
            JokempoRandom();
        }else{
            System.out.println("Opção invalida!");
        }
    }

    public static void JokempoLocal (){

        int jogada,jogadaDois;

        Scanner scan = new Scanner (System.in);

        System.out.println ("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        jogada = scan.nextInt();

        //if (jogada != 0 || jogada != 1 || jogada != 2){
        //System.out.println("Jogada invalida! Tente novamente");}

        for (int i=0; i<50; i++) {
            System.out.println();
        }
        System.out.println ("Vez do jogador 2");
        System.out.println("");
        System.out.println ("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        jogadaDois = scan.nextInt();
        if ((jogada == 0 && jogadaDois == 1) || (jogada == 1 && jogadaDois == 2) || (jogada == 2 && jogadaDois == 0)){
            System.out.println ("Jogador dois venceu!");
        }else if (jogada==jogadaDois){
            System.out.println("Ops voces jogaram igual. Tentem novamente");
        }else{
            System.out.println("Jogador um venceu!");
        }
    }
    public static void JokempoRandom (){

        Random random = new Random();
        Scanner scan = new Scanner (System.in);

        int jogada,jogadaDois;
        String peca = "";
        //jogadaDois = new Random().nextInt(3);

        System.out.println ("---------------- Bem vindo ao Jokenpô! -------------------");
        System.out.println("");
        System.out.println ("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        jogada = scan.nextInt();

        jogadaDois = random.nextInt(3);

        switch (jogadaDois){
            case 0:
                peca = "pedra";
                break;
            case 1:
                peca = "papel";
                break;
            case 2:
                peca = "tesoura";
                break;
        }
        if ((jogada == 0 && jogadaDois == 1) || (jogada == 1 && jogadaDois == 2) || (jogada == 2 && jogadaDois == 0)){
            System.out.println ("Jogador dois jogou "+peca);
            System.out.println("Ele venceu :(");
        } else if (jogada==jogadaDois){
            System.out.println("Empatou!");
        }else {
            System.out.println("Jogador dois jogou "+peca);
            System.out.println("Voce venceu!!! :)");
        }
    }
}