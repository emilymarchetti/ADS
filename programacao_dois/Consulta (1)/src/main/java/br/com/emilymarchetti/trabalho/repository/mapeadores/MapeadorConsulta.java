package br.com.emilymarchetti.trabalho.repository.mapeadores;

import br.com.emilymarchetti.trabalho.model.Consulta;
import br.com.emilymarchetti.trabalho.model.Medico;
import br.com.emilymarchetti.trabalho.model.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeadorConsulta {

    private static final String COLUNA_ID = "id";
    private static final String COLUNA_ID_PACIENTE = "id_paciente";
    private static final String COLUNA_ID_MEDICO = "id_medico";
    private static final String COLUNA_DATA_HORA = "data_hora";
    private static final String COLUNA_SINTOMAS = "sintomas";
    private static final String COLUNA_PRESCRICAO_MEDICA = "prescricao_medica";

    private MapeadorConsulta() {}

    public static Consulta mapear(ResultSet resultSet) throws SQLException {
        final Paciente paciente = new Paciente();
        paciente.setId(resultSet.getLong(COLUNA_ID_PACIENTE));

        final Medico medico = new Medico();
        medico.setId(resultSet.getLong(COLUNA_ID_MEDICO));

        final Consulta consulta = new Consulta();
        consulta.setId(resultSet.getLong(COLUNA_ID));
        consulta.setPaciente(paciente);
        consulta.setMedico(medico);
        consulta.setDataHora(resultSet.getTimestamp(COLUNA_DATA_HORA).toLocalDateTime());
        consulta.setSintomas(resultSet.getString(COLUNA_SINTOMAS));
        consulta.setPrescricaoMedica(resultSet.getString(COLUNA_PRESCRICAO_MEDICA));
        return consulta;
    }

    public static Consulta mapear(ResultSet resultSet, Paciente paciente, Medico medico) throws SQLException {
        final Consulta consulta = new Consulta();
        consulta.setId(resultSet.getLong(COLUNA_ID));
        consulta.setPaciente(paciente);
        consulta.setMedico(medico);
        consulta.setDataHora(resultSet.getTimestamp(COLUNA_DATA_HORA).toLocalDateTime());
        consulta.setSintomas(resultSet.getString(COLUNA_SINTOMAS));
        consulta.setPrescricaoMedica(resultSet.getString(COLUNA_PRESCRICAO_MEDICA));
        return consulta;
    }
}
