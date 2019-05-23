package br.com.emilymarchetti.trabalho.repository;

import br.com.emilymarchetti.trabalho.model.Entidade;
import java.util.List;

public interface CRUDRepository <T extends Entidade> {

    void criar(T entidade);
    void atualizar(T entidade);
    void deletar(Long id);
    T buscarPorId(Long id);
    List<T> buscarTodos();
}
