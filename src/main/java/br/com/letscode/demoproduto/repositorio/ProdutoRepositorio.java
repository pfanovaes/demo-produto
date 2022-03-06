package br.com.letscode.demoproduto.repositorio;

import br.com.letscode.demoproduto.entidade.ProdutoEntidade;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio {

    private static List<ProdutoEntidade> lista = new ArrayList<>();

    public void salvar(ProdutoEntidade produtoEntidade) {
            lista.add(produtoEntidade);
    }

    public List<ProdutoEntidade> obterTodos() {
        return lista;
    }

    public ProdutoEntidade obter(String id) {
        return null;
    }


}
