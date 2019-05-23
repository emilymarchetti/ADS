package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.model.Agendamento;
import br.com.emilymarchetti.trabalho.model.Consulta;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConsultaRepository implements CRUDRepository<Consulta> {

    private List<Consulta> consultas = new ArrayList<>();

    @Override
    public void criar(Consulta consulta) {
        consulta.setId(new Random().nextLong());
        this.consultas.add(consulta);
        System.out.println("Consulta criada com sucesso!");
    }

    public void criar(Agendamento agendamento) {
        Consulta consulta = new Consulta();
        consulta.setId(agendamento.getId());
        this.consultas.add(consulta);
        System.out.println("Consulta criada com sucesso!");
    }

    @Override
    public void atualizar(Consulta consulta) {
        Integer posicaoConsulta = getPosicaoElemento(consulta.getId());
        this.consultas.remove(posicaoConsulta.intValue());
        this.consultas.add(posicaoConsulta, consulta);
        System.out.println("Consulta atualizada com sucesso!");
    }

    @Override
    public void deletar(Long id) {
        Integer posicaoConsulta = getPosicaoElemento(id);
        this.consultas.remove(posicaoConsulta.intValue());
        System.out.println("Consulta deletada com sucesso!");
    }

    @Override
    public Consulta buscarPorId(Long id) {
        for (Consulta consulta : consultas) {
            if (consulta.getId().equals(id)) {
                return consulta;
            }
        }
        return null; //implementar uma exception
    }

    @Override
    public List<Consulta> buscarTodos() {
        return new ArrayList<>(consultas);
    }

    private Integer getPosicaoElemento(Long id) {
        Integer posicaoConsulta = null;

        for(int i = 0; i < consultas.size(); i++) {
            Consulta consultaDaLista = consultas.get(i);
            if(consultaDaLista.getId().equals(id)){
                posicaoConsulta = i;
                break;
            }
        }

        if(posicaoConsulta == null) {
            //implementar uma exception
        }

        return posicaoConsulta;
    }
}
