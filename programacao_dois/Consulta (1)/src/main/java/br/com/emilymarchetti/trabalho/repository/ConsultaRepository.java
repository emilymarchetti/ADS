package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.db.FabricaDeConexao;
import br.com.emilymarchetti.trabalho.exceptions.TratamentoErrosPostgresSQL;
import br.com.emilymarchetti.trabalho.model.Consulta;

import java.sql.*;
import java.util.List;

public class ConsultaRepository implements CRUDRepository<Consulta> {

    @Override
    public Consulta criar(Consulta consulta) {
        try(Connection connection = FabricaDeConexao.criarConexao()) {

            String[] colunasParaRetornar = {"id"};
            String sql = "insert into consulta (id_paciente, id_medico, data_hora, sintomas, prescricao_medica)  values (?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement
                    = connection.prepareStatement(sql, colunasParaRetornar);

            preparedStatement.setLong(1, consulta.getPaciente().getId());
            preparedStatement.setLong(2, consulta.getMedico().getId());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(consulta.getDataHora()));
            preparedStatement.setString(4, consulta.getSintomas());
            preparedStatement.setString(5, consulta.getPrescricaoMedica());
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if(resultSet.next()) {
                consulta.setId(resultSet.getLong(1));
            }
        } catch (SQLException ex) {
            TratamentoErrosPostgresSQL.tratarAtualizacao(ex, "Consulta");
        }

        return consulta;
    }

    @Override
    public void atualizar(Consulta entidade) {

    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Consulta buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Consulta> buscarTodos() {
        return null;
    }

    @Override
    public Integer getPosicaoElemento(Long id) {
        return null;
    }
}
