package br.com.letscode.demoproduto.entidade;


import lombok.Data;

@Data
public class ProdutoEntidade {

        private String id;
        private String nome;
        private String descricao;
        private Double valor;
}
