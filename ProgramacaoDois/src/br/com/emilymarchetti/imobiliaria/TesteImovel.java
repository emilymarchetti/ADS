package br.com.emilymarchetti.imobiliaria;

public class TesteImovel {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua Tocantins", 124, "Zona 3", Cidade.CIANORTE, Estado.PR);
        Imovel imovel = new Imovel(endereco, 4, 9, 3, 2000d, 3333d, TipoImovel.ALUGUEL, StatusImovel.DISPONIVEL);
        Imovel imovelUm = new Imovel(endereco, 3, 7, 2, 3000d, 5533d, TipoImovel.ALUGUEL, StatusImovel.DISPONIVEL);
        imovel.novoImovel(imovel);
        imovel.novoImovel(imovelUm);
        imovel.toString();
        System.out.println("");
        PessoaFisica pessoa = new PessoaFisica("Jefinho","991711800",endereco,"12344097988","Silva");
        Aluguel aluguel = new Aluguel(imovel,2,pessoa);
        aluguel.alugar();
        imovel.toString();
    }
}
