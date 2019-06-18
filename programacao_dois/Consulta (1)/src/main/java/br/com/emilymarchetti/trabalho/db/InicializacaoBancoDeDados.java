package br.com.emilymarchetti.trabalho.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InicializacaoBancoDeDados {

    public void criarTabelaAgendamento() {
        String sql = "create table if not exists agendamento(" +
                "id bigserial primary key," +
                "id_paciente bigint not null," +
                "id_medico bigint not null," +
                "data_hora timestamp not null," +
                "observacao varchar(50)," +
                " CONSTRAINT agendamento_id_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(id)," +
                " CONSTRAINT agendamento_id_medico_fk FOREIGN KEY (id_medico) REFERENCES medico(id)" +
                ");";
        criarTabela(sql);
    }

    public void criarTabelaConsulta() {
        String sql = "create table if not exists consulta(" +
                "id bigserial primary key," +
                "id_paciente bigint not null," +
                "id_medico bigint not null," +
                "data_hora timestamp not null," +
                "sintomas varchar(50) not null," +
                "prescricao_medica varchar(100) not null," +
                " CONSTRAINT agendamento_id_paciente_fk FOREIGN KEY (id_paciente) REFERENCES paciente(id)," +
                " CONSTRAINT agendamento_id_medico_fk FOREIGN KEY (id_medico) REFERENCES medico(id)" +
                ");";

        criarTabela(sql);
    }

    public void criarTabelaPaciente() {
        String sql = "create table if not exists paciente(" +
                "id bigserial primary key," +
                "nome varchar(50) not null," +
                "cpf varchar(11) not null," +
                "telefone varchar(15) not null," +
                "data_nascimento timestamp not null" +
                ");";

        criarTabela(sql);
    }

    public void criarTabelaMedico() {
        String sql = "create table if not exists medico(" +
                "id bigserial primary key," +
                "nome varchar(50) not null," +
                "cpf varchar(11) not null," +
                "telefone varchar(15) not null," +
                "crm varchar(10) not null" +
                ");";

        criarTabela(sql);
    }

    private void criarTabela(final String sql) {
        Connection connection = FabricaDeConexao.criarConexao();

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar tabela", e);
        }
    }

}
