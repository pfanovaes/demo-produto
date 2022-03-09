package br.com.letscode.demoproduto.entidade;

import br.com.letscode.demoproduto.dto.ProdutoDTO;
import lombok.Data;

@Data
public class ProdutoEntidade {

        private String id;
        private String nome;
        private String descricao;
        private Double valor;

        public ProdutoEntidade(ProdutoDTO produtoDTO) {
                this.nome = produtoDTO.getNome();
                this.descricao = produtoDTO.getDescricao();
                this.valor = produtoDTO.getValor();
        }

        public ProdutoEntidade() {

        }
}
