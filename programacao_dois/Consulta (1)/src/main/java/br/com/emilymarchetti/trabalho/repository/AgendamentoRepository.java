package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.db.FabricaDeConexao;
import br.com.emilymarchetti.trabalho.exceptions.TratamentoErrosPostgresSQL;
import br.com.emilymarchetti.trabalho.model.Agendamento;
import java.sql.*;
import java.util.List;

public class AgendamentoRepository implements CRUDRepository<Agendamento> {


    @Override
    public Agendamento criar(Agendamento agendamento) {
        try(Connection connection = FabricaDeConexao.criarConexao()) {

            String[] colunasParaRetornar = {"id"};
            String sql = "insert into agendamento (id_paciente, id_medico, data_hora, observacao)  values (?, ?, ?, ?);";

            PreparedStatement preparedStatement
                    = connection.prepareStatement(sql, colunasParaRetornar);

            preparedStatement.setLong(1, agendamento.getPaciente().getId());
            preparedStatement.setLong(2, agendamento.getMedico().getId());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(agendamento.getDataHora()));
            preparedStatement.setString(4, agendamento.getObservacao());
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if(resultSet.next()) {
                agendamento.setId(resultSet.getLong(1));
            }
        } catch (SQLException ex) {
            TratamentoErrosPostgresSQL.tratarAtualizacao(ex, "Agendamento");
        }

        return agendamento;
    }

    @Override
    public Agendamento atualizar(Agendamento agendamento) {
        try(Connection connection = FabricaDeConexao.criarConexao()) {

            String sql = "update agendamento set id_paciente = ?, id_medico = ?, data_hora = ?, observacao = ? where id = ?";

            PreparedStatement preparedStatement
                    = connection.prepareStatement(sql);

            preparedStatement.setLong(1, agendamento.getPaciente().getId());
            preparedStatement.setLong(2, agendamento.getMedico().getId());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(agendamento.getDataHora()));
            preparedStatement.setString(4, agendamento.getObservacao());
            preparedStatement.setLong(5, agendamento.getId());
            preparedStatement.execute();

        } catch (SQLException ex) {
            TratamentoErrosPostgresSQL.tratarAtualizacao(ex, "Agendamento");
        }

        return agendamento;
    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Agendamento buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Agendamento> buscarTodos() {
        return null;
    }

    @Override
    public Integer getPosicaoElemento(Long id) {
        return null;
    }
}


