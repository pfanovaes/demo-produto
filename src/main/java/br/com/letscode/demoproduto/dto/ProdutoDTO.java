package br.com.letscode.demoproduto.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class ProdutoDTO {
    private String nome;
    private String descricao;
    private Double valor;
}
