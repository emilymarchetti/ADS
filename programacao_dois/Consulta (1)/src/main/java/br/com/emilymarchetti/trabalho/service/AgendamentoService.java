package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Agendamento;
import br.com.emilymarchetti.trabalho.model.Consulta;
import br.com.emilymarchetti.trabalho.model.Medico;
import br.com.emilymarchetti.trabalho.model.Paciente;
import br.com.emilymarchetti.trabalho.repository.AgendamentoRepository;
import br.com.emilymarchetti.trabalho.repository.PacienteRepository;

import java.time.LocalDateTime;
import java.util.List;

public class AgendamentoService {

    private AgendamentoRepository agendamentoRepository = new AgendamentoRepository();

    public void criar(Agendamento agendamento){
        if (agendamento.getId() == null){
            agendamentoRepository.criar();
        }else{
            agendamentoRepository.atualizar(agendamento);
        }
    }

    public void reagendar(Agendamento agendamento, LocalDateTime dataHora){
        agendamento.reagendar(agendamento, dataHora);
        agendamentoRepository.atualizar(agendamento);
    }

    public void deletar(Long id){
        agendamentoRepository.deletar(id);
    }

    public Agendamento buscarPorId(Long id){
        return agendamentoRepository.buscarPorId(id);
    }

    public List<Agendamento> buscarTodos(){
        return agendamentoRepository.buscarTodos();
    }

    public boolean validarMedicoDisponivel(Medico medico, LocalDateTime dataHora){
        List<Agendamento> agendamentoMedico = agendamentoRepository.buscarTodos();
        for (Agendamento agendamentos: agendamentoMedico) {
            if(agendamentos.getDataHora() == dataHora && agendamentos.getMedico() == medico){
                return true;
            }
        }
        return false;
    }
}
