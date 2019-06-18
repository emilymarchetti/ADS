package br.com.emilymarchetti.trabalho.repository.mapeadores;

import br.com.emilymarchetti.trabalho.model.Medico;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeadorMedico {

    private static final String COLUNA_ID = "id";
    private static final String COLUNA_NOME = "nome";
    private static final String COLUNA_CPF = "cpf";
    private static final String COLUNA_TELEFONE = "telefone";
    private static final String COLUNA_CRM = "crm";

    private MapeadorMedico() {}

    public static Medico mapear(ResultSet resultSet) throws SQLException {
        final Medico medico = new Medico();
        medico.setId(resultSet.getLong(COLUNA_ID));
        medico.setNome(resultSet.getString(COLUNA_NOME));
        medico.setCpf(resultSet.getString(COLUNA_CPF));
        medico.setTelefone(resultSet.getString(COLUNA_TELEFONE));
        medico.setCrm(resultSet.getString(COLUNA_CRM));
        return medico;
    }
}
