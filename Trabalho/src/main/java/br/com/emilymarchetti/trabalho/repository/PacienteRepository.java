package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.model.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PacienteRepository implements CRUDRepository<Paciente> {

    private List<Paciente> pacientes = new ArrayList<>();

    @Override
    public void criar(Paciente paciente) {
        paciente.setId(new Random().nextLong());
        this.pacientes.add(paciente);
        System.out.println("Paciente criado com sucesso!");
    }

    @Override
    public void atualizar(Paciente paciente) {
        Integer posicaoPaciente = getPosicaoElemento(paciente.getId());
        this.pacientes.remove(posicaoPaciente.intValue());
        this.pacientes.add(posicaoPaciente, paciente);
        System.out.println("Paciente atualizado com sucesso!");
    }

    @Override
    public void deletar(Long id) {
        Integer posicaoPaciente = getPosicaoElemento(id);
        this.pacientes.remove(posicaoPaciente.intValue());
        System.out.println("Paciente deletado com sucesso!");
    }

    @Override
    public Paciente buscarPorId(Long id) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId().equals(id)) {
                return paciente;
            }
        }
        return null; //implementar uma exception
    }

    @Override
    public List<Paciente> buscarTodos(){
        return new ArrayList<>(pacientes);
    }

    private Integer getPosicaoElemento(Long id) {
        Integer posicaoPaciente = null;

        for(int i = 0; i < pacientes.size(); i++) {
            Paciente pacienteDaLista = pacientes.get(i);
            if(pacienteDaLista.getId().equals(id)) {
                posicaoPaciente = i;
                break;
            }
        }

        if(posicaoPaciente == null) {
            //implementar uma exception
        }

        return posicaoPaciente;
    }
}


