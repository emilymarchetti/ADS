package br.com.emilymarchetti.trabalho.model;

public abstract class Entidade {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    protected abstract void validar();
}
