
package exercicios;

import java.util.Scanner;

public class ProdutoVendas {

//ignora esse exercicio :)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double preco;
        double novoPreco;
        int vendas;

        System.out.println("Qual o preço atual do produto?");
        preco = scan.nextDouble();

        System.out.println("Qual a quantidade de vendas desse produto?");
        vendas = scan.nextInt();

        if ((preco <= 30.00) || (vendas <= 500)){
            novoPreco = (preco*0.10)+preco;
        }else if ((preco <= 80.00) && (vendas <= 1200)){
            novoPreco = (preco*0.15)+preco;
        }else{
            novoPreco = preco - (preco*0.20) ;
        }
        System.out.println("O preco atualizado do produto é R$"+novoPreco);
    }
}
