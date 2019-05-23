package br.com.emilymarchetti.trabalho.service;

import br.com.emilymarchetti.trabalho.model.Entidade;
import java.util.List;

public interface CRUDService <T extends Entidade>  {
    void salvar(T entidade);
    void deletar(Long id);
    T buscarPorId(Long id);
    List<T> buscarTodos();
}
