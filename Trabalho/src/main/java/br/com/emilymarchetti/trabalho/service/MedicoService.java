package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Medico;
import br.com.emilymarchetti.trabalho.repository.CRUDRepository;
import br.com.emilymarchetti.trabalho.repository.MedicoRepository;

public class MedicoService extends CRUDService<Medico> {

    @Override
    public CRUDRepository<Medico> getRepository() {
        return new MedicoRepository();
    }
}
