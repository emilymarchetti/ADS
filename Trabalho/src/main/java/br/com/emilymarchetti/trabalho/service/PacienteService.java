package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Paciente;
import br.com.emilymarchetti.trabalho.repository.PacienteRepository;
import java.util.List;

public class PacienteService implements CRUDService<Paciente> {

    private PacienteRepository pacienteRepository = new PacienteRepository();

    @Override
    public void salvar(Paciente paciente) {
        if (paciente.getId() == null){
            pacienteRepository.criar(paciente);
        }else{
            pacienteRepository.atualizar(paciente);
        }
    }

    @Override
    public void deletar(Long id) {
        pacienteRepository.deletar(id);
    }

    @Override
    public Paciente buscarPorId(Long id) {
        return pacienteRepository.buscarPorId(id);
    }

    @Override
    public List<Paciente> buscarTodos() {
        return pacienteRepository.buscarTodos();
    }
}
