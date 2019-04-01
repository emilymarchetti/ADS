package avaliacao;

import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {

        String nome,cargo;
        double salarioFixo, percentualComissao, valorAcumuladoComissao, valorServico;

        Scanner scan = new Scanner (System.in);

        System.out.println("Informe seu nome: ");
        nome = scan.nextLine();

        while (true) {
            System.out.println("Infome seu cargo: ");
            cargo = scan.nextLine();
            if (cargo.equals("Cabeleireiro") || cargo.equals("Manicure")){
                break;
            }
        }
        System.out.println("Informe o valor do seu salário: ");
        salarioFixo = scan.nextDouble();

        System.out.println("Informe o percentual da comissão: ");
        percentualComissao = scan.nextDouble();

        System.out.println("Informe o valor do serviço: ");
        valorServico = scan.nextDouble();

        percentualComissao = percentualComissao/100;

        valorAcumuladoComissao = 0;

        for (int i = 0; i < 5; i++){
           valorAcumuladoComissao = valorAcumuladoComissao + (valorServico*percentualComissao);
        }

        if (valorAcumuladoComissao >= 500){
            valorAcumuladoComissao = valorAcumuladoComissao +100;
        }

        System.out.println("Nome da funcionária: "+nome);
        System.out.println("Cargo da funcionária: "+cargo);
        System.out.println("Salário fixo: "+salarioFixo);
        System.out.println("Percentual de comissão da funcionária: "+percentualComissao*100);
        System.out.println("Valor do serviço: "+valorServico);
        System.out.println("Valor da comissão acumulado: "+valorAcumuladoComissao);
        System.out.println("Salário total: "+(valorAcumuladoComissao+salarioFixo));
    }
}
