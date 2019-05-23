package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Agendamento;
import br.com.emilymarchetti.trabalho.model.Consulta;
import br.com.emilymarchetti.trabalho.repository.ConsultaRepository;

import java.time.LocalDateTime;
import java.util.List;

public class ConsultaService {

    private ConsultaRepository consultaRepository = new ConsultaRepository();

    public void inicar(Consulta consulta){
        if (consulta.getId() == null){
            consultaRepository.criar(consulta);
        }else{
            consultaRepository.atualizar(consulta);
        }
    }

    public void iniciarComAgendamento(Agendamento agendamento){
        consultaRepository.criar(agendamento);
    }

    public void finalizar(Consulta consulta, String prescricaoMedica){
        consulta.setPrescricaoMedica(prescricaoMedica);
    }

    public Consulta buscarPorId(Long id){
        return consultaRepository.buscarPorId(id);
    }

    public List<Consulta> buscarTodos(){
        return consultaRepository.buscarTodos();
    }

    public void agendarRetorno(LocalDateTime dataHora){
        agendarRetorno(dataHora);
    }

}
