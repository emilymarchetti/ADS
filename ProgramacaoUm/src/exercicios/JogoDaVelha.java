package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    private static Character[][] velha = new Character[5][5];
    private static int cont = 1;
    private static int jogada;
    private static boolean ganhador;
    private static Random random = new Random();
    private static char jogadorUm,jogadorDois;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("                Bem vindo(a) ao jogo da velha");
        System.out.println();
        System.out.println("|------------------------ REGRAS -------------------------|");
        System.out.println();
        System.out.println("- Escolha sua jogada com base no desenho abaixo");
        System.out.println("- Pra fazer a escolha basta digitar o número de onde deseja");
        System.out.println();

        Desenho();

        int escolha;

        System.out.println("1 - Jogo local");
        System.out.println("2 - Jogar contra o computador");
        escolha = scan.nextInt();

        switch (escolha){
            case 1:
                Local();
            break;
            case 2:
                Computador();
            break;
            default:
                System.out.println("Escolha invalida");
                break;
        }
    }

    //------------------------------------ COMPUTADOR -----------------------------------------//
    private static void Computador (){
        Scanner scan = new Scanner(System.in);
        int peca;

        System.out.println();
        System.out.println("Jogador 1 escolha sua peça");
        System.out.println();
        System.out.println("1- Para jogar com o X");
        System.out.println("2- Para jogar com a O");
        peca = scan.nextInt();

        if (peca==1){
            jogadorUm = 'X';
            jogadorDois = 'O';
            System.out.println();
            System.out.println("Blz, o jogador 2 ficou com O");
        }else if (peca==2){
            jogadorUm = 'O';
            jogadorDois = 'X';
            System.out.println();
            System.out.println("Blz, o jogador 2 ficou com X");
        }else{
            System.out.println("Jogada invalida! Tente novamente");
        }
        System.out.println();

        ganhador = false;

        while   (ganhador == false){
            System.out.println("Jogador 1 escolha sua jogada");
            System.out.println();
            Desenho();
            System.out.println();
            jogada = scan.nextInt();
            System.out.println();
            JogadaUm();
            System.out.println();
            cont++;
            jogada = new Random().nextInt(9);
            JogadaDois();
            System.out.println();
            GanhadorUm();
            GanhadorDois();
            System.out.println("--------------------------------------------------------");
            System.out.println();
            System.out.println("Jogador 2:");
            System.out.println();
            Desenho();
            if (cont==10){
                System.out.println("Deu velha :|");
            }
        }
    }

    //-------------------------------- LOCAL -------------------------------------------------//
    private static void Local(){

        Scanner scan = new Scanner(System.in);
        int peca;

        System.out.println();
        System.out.println("Jogador 1 escolha sua peça");
        System.out.println();
        System.out.println("1- Para jogar com o X");
        System.out.println("2- Para jogar com a O");
        peca = scan.nextInt();

        if (peca==1){
            jogadorUm = 'X';
            jogadorDois = 'O';
            System.out.println();
            System.out.println("Blz, o jogador 2 ficou com O");
        }else if (peca==2){
            jogadorUm = 'O';
            jogadorDois = 'X';
            System.out.println();
            System.out.println("Blz, o jogador 2 ficou com X");
        }else{
            System.out.println("Jogada invalida! Tente novamente");
        }
        System.out.println();

        ganhador = false;

        while   (ganhador == false){
            System.out.println("Jogador 1 escolha sua jogada");
            System.out.println();
            Desenho();
            System.out.println();
            jogada = scan.nextInt();
            System.out.println();
            JogadaUm();
            System.out.println();
            System.out.println("Jogador 2 escolha sua jogada");
            jogada = scan.nextInt();
            Desenho();
            System.out.println();
            cont++;
            JogadaDois();
            System.out.println();
            Desenho();
            GanhadorUm();
            GanhadorDois();
            if (cont==10){
                System.out.println("Deu velha :|");
                break;
            }
        }
    }

    //------------------------------------- DESENHO ------------------------------------//
    private static void Desenho(){

        if  (cont==1) {
            for (int l = 0; l < velha.length; l++) {
                for (int c = 0; c < velha.length; c++) {
                    if ((c == 1) || (c == 3)) {
                        velha[l][c] = '|';
                    } else if ((l == 1) || (l == 3)) {
                        velha[l][c] = '-';
                    } else {
                        velha[l][c] = ' ';
                    }
                }
            }
            velha [0][0] = '1';
            velha [0][2] = '2';
            velha [0][4] = '3';
            velha [2][0] = '4';
            velha [2][2] = '5';
            velha [2][4] = '6';
            velha [4][0] = '7';
            velha [4][2] = '8';
            velha [4][4] = '9';
        }

        for (int l = 0; l < velha.length; l++)  {
            for (int c = 0; c < velha.length; c++)     {
                if (c==0){
                    System.out.print("                      "+velha[l][c] + " ");
                }else {
                    System.out.print(velha[l][c] + " ");
                }
            }
            System.out.println(" ");
        }
    }

    //--------------------------------------- JOGADA UM ------------------------------------//
    private static void JogadaUm(){
        if (((velha[0][0] != 1) && (velha[0][0] != jogadorUm) && (velha[0][0] != jogadorDois) && (jogada == 1))){
            velha[0][0] = jogadorUm;
        }else if (((velha[0][2] != 2) && (velha[0][2] != jogadorUm)) && (jogada == 2)) {
            velha[0][2] = jogadorUm;
        }else if ((velha[0][4] != 3 && velha[0][4] != jogadorUm) && (jogada == 3)) {
            velha[0][4] = jogadorUm;
        }else if ((velha[2][0] != 4 && velha[2][0] != jogadorUm) && (jogada == 4)) {
            velha[2][0] = jogadorUm;
        }else if ((velha[2][2] != 5 && velha[2][2] != jogadorUm) && (jogada == 5)) {
            velha[2][2] = jogadorUm;
        }else if ((velha[2][4] != 6 && velha[2][4] != jogadorUm) && (jogada == 6)) {
            velha[2][4] = jogadorUm;
        }else if ((velha[4][0] != 7 && velha[4][0] != jogadorUm) && (jogada == 7)) {
            velha[4][0] = jogadorUm;
        }else if (((velha[4][2] != 8) && (velha[4][2] != jogadorUm)) && (jogada == 8)) {
            velha[4][2] = jogadorUm;
        }else if (((velha[4][4] != 9) && (velha[4][4] != jogadorUm)) && (jogada == 9)) {
            velha[4][4] = jogadorUm;
        }else{
            System.out.println("Jogada invalida ou local já preenchido!");
        }
    }

    //------------------------------------------ JOGADA DOIS -------------------------------------------//
        private static void JogadaDois(){
        if (((velha[0][0] != 1) && (velha[0][0] != jogadorUm) && (velha[0][0] != jogadorDois) && (jogada == 1))){
            velha[0][0] = jogadorDois;
        }else if (((velha[0][2] != 2) && (velha[0][2] != jogadorUm)) && (jogada == 2)) {
            velha[0][2] = jogadorDois;
        }else if ((velha[0][4] != 3 && velha[0][4] != jogadorUm) && (jogada == 3)) {
            velha[0][4] = jogadorDois;
        }else if ((velha[2][0] != 4 && velha[2][0] != jogadorUm) && (jogada == 4)) {
            velha[2][0] = jogadorDois;
        }else if ((velha[2][2] != 5 && velha[2][2] != jogadorUm) && (jogada == 5)) {
            velha[2][2] = jogadorDois;
        }else if ((velha[2][4] != 6 && velha[2][4] != jogadorUm) && (jogada == 6)) {
            velha[2][4] = jogadorDois;
        }else if ((velha[4][0] != 7 && velha[4][0] != jogadorUm) && (jogada == 7)) {
            velha[4][0] = jogadorDois;
        }else if (((velha[4][2] != 8) && (velha[4][2] != jogadorUm)) && (jogada == 8)) {
            velha[4][2] = jogadorDois;
        }else if (((velha[4][4] != 9) && (velha[4][4] != jogadorUm)) && (jogada == 9)) {
            velha[4][4] = jogadorDois;
        }else{
            System.out.println("Jogada invalida ou local já preenchido!");
        }
    }

    //------------------------------------------ GANHADOR UM ---------------------------------------//
    private static void GanhadorUm(){
        if ((velha[0][0] == jogadorUm) && (velha[2][2] == jogadorUm) && (velha[4][4] == jogadorUm)){
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else if((velha[0][4] == jogadorUm) && (velha[2][2] == jogadorUm) && (velha[4][0] == jogadorUm)) {
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else if((velha[0][0] == jogadorUm) && (velha[2][0] == jogadorUm) && (velha[4][0] == jogadorUm)) {
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else if((velha[0][2] == jogadorUm) && (velha[2][2] == jogadorUm) && (velha[4][2] == jogadorUm)) {
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else if((velha[4][0] == jogadorUm) && (velha[4][2] == jogadorUm) && (velha[4][4] == jogadorUm)) {
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else if((velha[0][0] == jogadorUm) && (velha[0][2] == jogadorUm) && (velha[0][4] == jogadorUm)) {
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else if((velha[0][4] == jogadorUm) && (velha[2][4] == jogadorUm) && (velha[4][4] == jogadorUm)) {
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else if((velha[2][0] == jogadorUm) && (velha[2][2] == jogadorUm) && (velha[2][4] == jogadorUm)) {
            System.out.println("Jogador 1 venceu!");
            ganhador = true;
        }else{
            System.out.println();
        }
    }

    //---------------------------------------------- GANHADOR DOIS -------------------------------------//
    private static void GanhadorDois(){
        if ((velha[0][0] == jogadorDois) && (velha[2][2] == jogadorDois) && (velha[4][4] == jogadorDois)){
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else if((velha[0][4] == jogadorDois) && (velha[2][2] == jogadorDois) && (velha[4][0] == jogadorDois)) {
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else if((velha[0][0] == jogadorDois) && (velha[2][0] == jogadorDois) && (velha[4][0] == jogadorDois)) {
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else if((velha[0][2] == jogadorDois) && (velha[2][2] == jogadorDois) && (velha[4][2] == jogadorDois)) {
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else if((velha[4][0] == jogadorDois) && (velha[4][2] == jogadorDois) && (velha[4][4] == jogadorDois)) {
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else if((velha[0][0] == jogadorDois) && (velha[0][2] == jogadorDois) && (velha[0][4] == jogadorDois)) {
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else if((velha[0][4] == jogadorDois) && (velha[2][4] == jogadorDois) && (velha[4][4] == jogadorDois)) {
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else if((velha[2][0] == jogadorDois) && (velha[2][2] == jogadorDois) && (velha[2][4] == jogadorDois)) {
            System.out.println("Jogador 2 venceu!");
            ganhador = true;
        }else{
            System.out.println();
        }

    }
}
