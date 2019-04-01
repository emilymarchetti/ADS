package totvs;

import java.util.Scanner;

public class Prova {

        private char alfabeto [] = {'A','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        private char matriz [][] = new char [48][48];
        private int i,j,ref;
        public int cont = 0;

        public void ordenar(char letra){
            ref = busca(letra);
            while (ref != 0){
                for (int j = 0; j < matriz.length;j++){
                    for (int i = 0; i < matriz.length;i++){
                        if (((i == ref) && (j == (ref*2)-1)) || (i == ref) && (j == ref/2)){
                            matriz[i][j] = alfabeto[ref];
                            ref--;
                            cont++;
                        }else if (matriz[i][j] >= 65 || matriz[i][j] <= 90) {
                        }else{
                            matriz[i][j] = ' ';
                 }
                    }
                }
            }
            for (int i = 0; i < matriz.length;i++){
                for (int j = 0; j < matriz.length;j++) {
                    System.out.print(matriz[i][j] + "");
                }
                System.out.println();
            }
        }


        public int busca (char letra){
            for (int i = 0; i < alfabeto.length;i++){
                if(alfabeto[i] == letra){
                    ref = i;
                    break;
                }
            }
            return ref;
        }

    }
