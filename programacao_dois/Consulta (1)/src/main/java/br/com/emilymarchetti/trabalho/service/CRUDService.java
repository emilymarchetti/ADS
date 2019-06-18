package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Entidade;
import br.com.emilymarchetti.trabalho.repository.CRUDRepository;

import java.util.List;

public abstract class CRUDService <T extends Entidade>  {

    private CRUDRepository<T> repository = getRepository();

    public void salvar(T entidade) {
        if (entidade.getId() == null){
            repository.criar(entidade);
        }else{
            repository.atualizar(entidade);
        }
    }

    public void deletar(Long id) {
        repository.deletar(id);
    }

    public T buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    public List<T> buscarTodos() {
        return repository.buscarTodos();
    }

    public abstract CRUDRepository<T> getRepository();
}
