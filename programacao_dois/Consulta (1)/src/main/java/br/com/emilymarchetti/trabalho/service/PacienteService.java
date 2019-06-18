package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Paciente;
import br.com.emilymarchetti.trabalho.repository.CRUDRepository;
import br.com.emilymarchetti.trabalho.repository.PacienteRepository;

public class PacienteService extends CRUDService<Paciente> {
    @Override
    public CRUDRepository<Paciente> getRepository() {
        return new PacienteRepository();
    }
}
