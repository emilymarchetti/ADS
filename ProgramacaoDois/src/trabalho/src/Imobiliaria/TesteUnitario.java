package Imobiliaria;

public class TesteUnitario {

    public static void main(String[] args) {

        Endereco enderecoPessoa = new Endereco("Rua Tocantins",124,"Zona 3",Cidade.CIANORTE,Estado.PR);
        Endereco enderecoImovel = new Endereco("Av. Goiás",2250,"Centro",Cidade.JAPURA,Estado.PR);
        Endereco enderecoVendedor = new Endereco("Rua Joaquim Francisco",2250,"Centro",Cidade.APUCARANA,Estado.PR);
        PessoaFisica pessoa = new PessoaFisica("Jefinho","991711800",enderecoPessoa,"12344097988","Silva");
        Imovel imovel = new Imovel(enderecoImovel,4,6,2,250000.00,250.00,"Venda");
        Vendedor vendedor = new Vendedor("Vitor","9964695748",enderecoVendedor,1300.00);
        Venda venda = new Venda (vendedor,pessoa,imovel);
        venda.calculoComissao();

        System.out.println("-*-*-*-*-*-*-*-*-* VENDA DE IMÓVEL -*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Endereço do Imovel vendido: " + enderecoImovel.getRua()+", "+enderecoImovel.getNumero()+" - "
                            + enderecoImovel.getBairro() + " - " + enderecoImovel.getCidade()+"-" + enderecoImovel.getEstado() +"\n" +
                            "---Descrição do imóvel---\n" +
                            "Quantidade de banheiros: " + imovel.getBanheiro() + "\n" +
                            "Quantidade de quartos: " + imovel.getQuarto() + "\n" +
                            "Quantidade de suítes: " + imovel.getSuite() + "\n" +
                            "Metragem: " + imovel.getTamanho() + "m²\n" +
                            "Cliente: " + pessoa.getNome() + " " + pessoa.getSobrenome() + "\n" +
                            "CPF: " + pessoa.getCpf() +"\n"+
                            "Preço: R$"+ imovel.getPreco() + "\n\n\n" +

                            "Vendedor: " + vendedor.getNome() + "\n" +
                            "Salário Bruto: R$" + vendedor.getSalarioBruto() + "\n" +
                            "Comissão da Venda: R$" + venda.getComissao() + "\n" +
                            "Salário Líquido: R$" + vendedor.calculaSalarioLiquido(venda.getComissao()) + "\n\n"
        );






        Endereco enderecoPessoaAluquel = new Endereco("Rua das Couves",123,"Horta",Cidade.UMUARAMA,Estado.PR);
        PessoaJuridica paluguel = new PessoaJuridica("Hamilton","1234-5678", enderecoPessoaAluquel,"1234567890123");
        Endereco enderecoImovelAluguel = new Endereco("Rua Ceci",456,"Bicicleta",Cidade.CIANORTE,Estado.PR);
        Imovel imovelAluguel = new Imovel(enderecoImovelAluguel,4,0,0,5000.00,500.00,"Aluguel");
        Aluguel aluguel = new Aluguel(imovelAluguel,4,paluguel);

        System.out.println("-*-*-*-*-*-*-*-*-* ALUGUEL DE IMÓVEL -*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Endereço do Imovel Alugado: " + enderecoImovelAluguel.getRua()+", "+enderecoImovelAluguel.getNumero()+" - "
                + enderecoImovelAluguel.getBairro() + " - " + enderecoImovelAluguel.getCidade()+"-" + enderecoImovelAluguel.getEstado() +"\n" +
                "---Descrição do imóvel---\n" +
                "Quantidade de banheiros: " + imovelAluguel.getBanheiro() + "\n" +
                "Quantidade de quartos: " + imovelAluguel.getQuarto() + "\n" +
                "Quantidade de suítes: " + imovelAluguel.getSuite() + "\n" +
                "Metragem: " + imovelAluguel.getTamanho() + "m²\n" +
                "Inquilino: " + paluguel.getNome()+ "\n" +
                "CNPJ: " + paluguel.getCnpj() +"\n"+
                "Valor do Aluguel: R$"+ aluguel.getImovel().getPreco() + " mensais \n" +
                "Duração do contrato: " + aluguel.getDuracaoContrato() + " anos"
        );
    }
}
