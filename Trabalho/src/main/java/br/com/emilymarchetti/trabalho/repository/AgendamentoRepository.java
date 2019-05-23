package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.model.Agendamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AgendamentoRepository implements CRUDRepository<Agendamento> {

    private List<Agendamento> agendamentos = new ArrayList<>();

    @Override
    public void criar(Agendamento agendamento) {
        agendamento.setId(new Random().nextLong());
        this.agendamentos.add(agendamento);
        System.out.println("Agendamento criado com sucesso!");
    }

    @Override
    public void atualizar(Agendamento agendamento) {
        Integer posicaoAgendamento = getPosicaoElemento(agendamento.getId());
        this.agendamentos.remove(posicaoAgendamento.intValue());
        this.agendamentos.add(posicaoAgendamento, agendamento);
        System.out.println("Agendamento atualizado com sucesso!");
    }

    @Override
    public void deletar(Long id) {
        Integer posicaoAgendamento = getPosicaoElemento(id);
        this.agendamentos.remove(posicaoAgendamento.intValue());
        System.out.println("Agendamento deletado com sucesso!");
    }

    @Override
    public Agendamento buscarPorId(Long id){
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getId().equals(id)) {
                return agendamento;
            }
        }
        return null; //implementar uma exception
    }

    @Override
    public List<Agendamento> buscarTodos() {
        return new ArrayList<>(agendamentos);
    }

    private Integer getPosicaoElemento(Long id) {
        Integer posicaoAgendamento = null;

        for(int i = 0; i < agendamentos.size(); i++) {
            Agendamento agendamentoDaLista = agendamentos.get(i);
            if(agendamentoDaLista.getId().equals(id)) {
                posicaoAgendamento = i;
                break;
            }
        }

        if(posicaoAgendamento == null) {
            //implementar uma exception
        }

        return posicaoAgendamento;
    }
}
