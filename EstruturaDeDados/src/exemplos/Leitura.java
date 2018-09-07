package exemplos;

import java.util.Scanner;

public class Leitura {
	
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Qual o seu nome?");
		System.out.println("Seu nome é: "+ scanner.nextLine());
	}

}
