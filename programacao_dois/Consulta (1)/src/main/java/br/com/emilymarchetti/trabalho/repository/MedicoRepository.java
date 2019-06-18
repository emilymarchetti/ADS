package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.db.FabricaDeConexao;
import br.com.emilymarchetti.trabalho.exceptions.TratamentoErrosPostgresSQL;
import br.com.emilymarchetti.trabalho.model.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MedicoRepository implements CRUDRepository<Medico> {

    @Override
    public Medico criar(Medico medico) {
        try(final Connection connection = FabricaDeConexao.criarConexao()) {
            final String sql = "insert into medico (nome, cpf, telefone, crm) values (?, ?, ?, ?)";

            String colunasParaRetornar[]= {"id"};
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql, colunasParaRetornar);

            preparedStatement.setString(1, medico.getNome());
            preparedStatement.setString(2, medico.getCpf());
            preparedStatement.setString(3, medico.getTelefone());
            preparedStatement.setString(4, medico.getCrm());
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement
                    .getGeneratedKeys();

            if(resultSet.next()) {
                medico.setId(resultSet.getLong(1));
            }
        } catch (SQLException ex) {
            TratamentoErrosPostgresSQL.tratarAtualizacao(ex, "Medico");
        }

        return medico;
    }

    @Override
    public void atualizar(Medico entidade) {

    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Medico buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Medico> buscarTodos() {
        return null;
    }

    @Override
    public Integer getPosicaoElemento(Long id) {
        return null;
    }
}
