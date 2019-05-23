package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.model.Medico;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MedicoRepository implements CRUDRepository<Medico> {

    private List<Medico> medicos = new ArrayList<>();

    @Override
    public void criar(Medico medico) {
        medico.setId(new Random().nextLong());
        this.medicos.add(medico);
        System.out.println("Médico criado com sucesso!");
    }

    @Override
    public void atualizar(Medico medico) {
        Integer posicaoMedico = getPosicaoElemento(medico.getId());
        this.medicos.remove(posicaoMedico.intValue());
        this.medicos.add(posicaoMedico, medico);
        System.out.println("Médico atualizado com sucesso!");
    }

    @Override
    public void deletar(Long id) {
        Integer posicaoMedico = getPosicaoElemento(id);
        this.medicos.remove(posicaoMedico.intValue());
        System.out.println("Médico deletado com sucesso!");
    }

    @Override
    public Medico buscarPorId(Long id) {
        for (Medico medico : medicos) {
            if (medico.getId().equals(id)) {
                return medico;
            }
        }
        return null; //implementar uma exception
    }

    @Override
    public List<Medico> buscarTodos() {
        return new ArrayList<>(medicos);
    }

    private Integer getPosicaoElemento(Long id) {
        Integer posicaoMedico = null;

        for(int i = 0; i < medicos.size(); i++) {
            Medico medicoDaLista = medicos.get(i);
            if(medicoDaLista.getId().equals(id)) {
                posicaoMedico = i;
                break;
            }
        }

        if(posicaoMedico == null) {
            //implementar uma exception
        }

        return posicaoMedico;
    }
}
