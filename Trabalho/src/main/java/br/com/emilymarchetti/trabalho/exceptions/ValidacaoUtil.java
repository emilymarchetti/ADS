package br.com.emilymarchetti.trabalho.exceptions;

import br.com.emilymarchetti.trabalho.model.Entidade;

public class ValidacaoUtil{

    public static void validarCampoObrigatorio(String valor, String mensagem) {
        if(valor == null || valor.isEmpty()) {
            throw new CampoObrigatorioException(mensagem);
        }
    }

    public static void validarCampoObrigatorio(Object valor, String mensagem) {
        if(valor == null) {
            throw new CampoObrigatorioException(mensagem);
        }
    }

    public static void validarEntidadeExistente(Entidade entidade, String mensagem) {
        if(entidade == null || entidade.getId() == null) {
            throw new RegistroNaoExistenteException(mensagem);
        }
    }
}
