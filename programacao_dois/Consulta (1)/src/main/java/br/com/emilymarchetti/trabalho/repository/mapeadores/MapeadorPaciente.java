package br.com.emilymarchetti.trabalho.repository.mapeadores;

import br.com.emilymarchetti.trabalho.model.Paciente;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeadorPaciente {

    private static final String COLUNA_ID = "id";
    private static final String COLUNA_NOME = "nome";
    private static final String COLUNA_CPF = "cpf";
    private static final String COLUNA_TELEFONE = "telefone";
    private static final String COLUNA_DATA_NASCIMENTO = "data_nascimento";

    private MapeadorPaciente() {}

    public static Paciente mapear(ResultSet resultSet) throws SQLException {
        final Paciente paciente = new Paciente();
        paciente.setId(resultSet.getLong(COLUNA_ID));
        paciente.setNome(resultSet.getString(COLUNA_NOME));
        paciente.setCpf(resultSet.getString(COLUNA_CPF));
        paciente.setTelefone(resultSet.getString(COLUNA_TELEFONE));
        paciente.setDataNascimento(resultSet.getDate(COLUNA_DATA_NASCIMENTO).toLocalDate());
        return paciente;
    }
}
