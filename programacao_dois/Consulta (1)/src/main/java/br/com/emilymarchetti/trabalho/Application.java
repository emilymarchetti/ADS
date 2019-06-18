package br.com.emilymarchetti.trabalho;

import br.com.emilymarchetti.trabalho.model.Agendamento;
import br.com.emilymarchetti.trabalho.model.Consulta;
import br.com.emilymarchetti.trabalho.model.Medico;
import br.com.emilymarchetti.trabalho.model.Paciente;
import br.com.emilymarchetti.trabalho.service.AgendamentoService;
import br.com.emilymarchetti.trabalho.service.ConsultaService;
import br.com.emilymarchetti.trabalho.service.MedicoService;
import br.com.emilymarchetti.trabalho.service.PacienteService;
import org.junit.Test;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Application {
    public static void main(String[] args) {

    }

    @Test
    public void criarMedico() {
        Medico medico = new Medico();
        MedicoService medicoService = new MedicoService();
        medicoService.salvar(medico);
        medico.setCrm("587924");
        medico.setCpf("2849858796");
        assertEquals("587924", medico.getCrm());
        assertEquals("2849858796", medico.getCpf());
    }

    @Test //(expected =
    public void criarPaciente() {
        Paciente paciente = new Paciente();
        PacienteService pacienteService = new PacienteService();
        paciente.setCpf("5954478486");
        pacienteService.salvar(paciente);
        assertEquals("5954478486",paciente.getCpf());
    }

    @Test
    public void agendarRetorno(){
        Paciente paciente = new Paciente();
        PacienteService pacienteService = new PacienteService();
        pacienteService.salvar(paciente);

        Medico medico = new Medico();
        MedicoService medicoService = new MedicoService();
        medicoService.salvar(medico);

        Agendamento agendamento = new Agendamento(paciente, medico, LocalDateTime.of(2019,5,29,22,50));
        AgendamentoService agendamentoService = new AgendamentoService();
        agendamentoService.criar(agendamento);

        Consulta consulta = new Consulta(paciente,medico, "dor de cabeça");
        ConsultaService consultaService = new ConsultaService();
        consultaService.iniciarComAgendamento(agendamento);
        //consultaService.(consulta);

        consultaService.agendarRetorno(LocalDateTime.of(2019,5,29,22,50),consulta);
        assertNull(consulta.getDataHora());
    }
}
