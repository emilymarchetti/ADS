package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.exceptions.RegistroNaoExistenteException;
import br.com.emilymarchetti.trabalho.model.Agendamento;
import br.com.emilymarchetti.trabalho.model.Entidade;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class CRUDRepository <T extends Entidade> {

    private List<T> entidades = new ArrayList<>();

    //public <P extends Entidade> String (P ){ }

    public void criar(T entidade) {
        entidade.setId(new Random().nextLong());
        this.entidades.add(entidade);
    }

    public void criar(Agendamento agendamento) {
        agendamento.setId(new Random().nextLong());
        this.entidades.add((T) agendamento);
    }

    public void atualizar(T entidade) {
        Integer posicaoEntidade = getPosicaoElemento(entidade.getId());
        this.entidades.remove(posicaoEntidade.intValue());
        this.entidades.add(posicaoEntidade, entidade);
    }

    public void deletar(Long id) {
        Integer posicaoEntidade = getPosicaoElemento(id);
        this.entidades.remove(posicaoEntidade.intValue());
    }

    public T buscarPorId(Long id){
        for (T entidade : entidades) {
            if (entidade.getId().equals(id)) {
                return entidade;
            }
        }
        throw new RegistroNaoExistenteException("O id: " + id + " não existe");
    }

    public List<T> buscarTodos() {
        return new ArrayList(entidades);
    }

    private Integer getPosicaoElemento(Long id) {
        Integer posicaoAgendamento = null;

        for(int i = 0; i < entidades.size(); i++) {
            T entidadesDaLista = entidades.get(i);
            if(entidadesDaLista.getId().equals(id)) {
                posicaoAgendamento = i;
                break;
            }
        }

        if(posicaoAgendamento == null) {
            throw new RegistroNaoExistenteException("");
        }

        return posicaoAgendamento;
    }
}
