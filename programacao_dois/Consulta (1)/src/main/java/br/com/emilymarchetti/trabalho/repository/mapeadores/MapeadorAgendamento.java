package br.com.emilymarchetti.trabalho.repository.mapeadores;

import br.com.emilymarchetti.trabalho.model.Agendamento;
import br.com.emilymarchetti.trabalho.model.Medico;
import br.com.emilymarchetti.trabalho.model.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeadorAgendamento {

    private static final String COLUNA_ID = "id";
    private static final String COLUNA_ID_PACIENTE = "id_paciente";
    private static final String COLUNA_ID_MEDICO = "id_medico";
    private static final String COLUNA_DATA_HORA = "data_hora";
    private static final String COLUNA_OBSERVACAO = "observacao";

    private MapeadorAgendamento() {}

    public static Agendamento mapear(ResultSet resultSet) throws SQLException {
        final Paciente paciente = new Paciente();
        paciente.setId(resultSet.getLong(COLUNA_ID_PACIENTE));

        final Medico medico = new Medico();
        medico.setId(resultSet.getLong(COLUNA_ID_MEDICO));

        final Agendamento agendamento = new Agendamento();
        agendamento.setId(resultSet.getLong(COLUNA_ID));
        agendamento.setPaciente(paciente);
        agendamento.setMedico(medico);
        agendamento.setObservacao(resultSet.getString(COLUNA_OBSERVACAO));
        agendamento.setDataHora(resultSet.getTimestamp(COLUNA_DATA_HORA).toLocalDateTime());
        return agendamento;
    }

    public static Agendamento mapear(ResultSet resultSet, Paciente paciente, Medico medico) throws SQLException {
        final Agendamento agendamento = new Agendamento();
        agendamento.setId(resultSet.getLong(COLUNA_ID));
        agendamento.setPaciente(paciente);
        agendamento.setMedico(medico);
        agendamento.setObservacao(resultSet.getString(COLUNA_OBSERVACAO));
        agendamento.setDataHora(resultSet.getTimestamp(COLUNA_DATA_HORA).toLocalDateTime());
        return agendamento;
    }
}
