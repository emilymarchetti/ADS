package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Medico;
import br.com.emilymarchetti.trabalho.repository.MedicoRepository;

import java.util.List;

public class MedicoService implements CRUDService<Medico> {

    private MedicoRepository medicoRepository = new MedicoRepository();

    @Override
    public void salvar(Medico medico) {
        if (medico.getId() == null){
            medicoRepository.criar(medico);
        }else{
            medicoRepository.atualizar(medico);
        }
    }

    @Override
    public void deletar(Long id) {
        medicoRepository.deletar(id);
    }

    @Override
    public Medico buscarPorId(Long id) {
        return medicoRepository.buscarPorId(id);
    }

    @Override
    public List<Medico> buscarTodos() {
        return medicoRepository.buscarTodos();
    }
}
