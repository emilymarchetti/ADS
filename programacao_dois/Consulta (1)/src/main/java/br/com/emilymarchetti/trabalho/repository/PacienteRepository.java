package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.db.FabricaDeConexao;
import br.com.emilymarchetti.trabalho.exceptions.TratamentoErrosPostgresSQL;
import br.com.emilymarchetti.trabalho.model.Paciente;

import java.sql.*;
import java.util.List;

public class PacienteRepository implements CRUDRepository<Paciente> {

    @Override
    public Paciente criar(Paciente paciente) {
        try(final Connection connection = FabricaDeConexao.criarConexao()) {
            final String sql = "insert into paciente (nome, cpf, telefone, data_nascimento) values (?, ?, ?, ?)";

            String colunasParaRetornar[]= {"id"};
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql, colunasParaRetornar);

            preparedStatement.setString(1, paciente.getNome());
            preparedStatement.setString(2, paciente.getCpf());
            preparedStatement.setString(3, paciente.getTelefone());
            preparedStatement.setDate(4, Date.valueOf(paciente.getDataNascimento()));
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement
                    .getGeneratedKeys();

            if(resultSet.next()) {
                paciente.setId(resultSet.getLong(1));
            }
        } catch (SQLException ex) {
            TratamentoErrosPostgresSQL.tratarAtualizacao(ex, "Medico");
        }

        return paciente;
    }

    @Override
    public void atualizar(Paciente entidade) {

    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Paciente buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Paciente> buscarTodos() {
        return null;
    }

    @Override
    public Integer getPosicaoElemento(Long id) {
        return null;
    }
}


