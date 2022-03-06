package br.com.letscode.demoproduto.controlador;

import br.com.letscode.demoproduto.dto.ProdutoDTO;
import br.com.letscode.demoproduto.entidade.ProdutoEntidade;
import br.com.letscode.demoproduto.repositorio.ProdutoRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutoControlador {

    @GetMapping("/form")

    public String obterFormulario() {
        return "produto-form";
    }

    @PostMapping("cadastrar-produto")
    public String cadastrarProduto(ProdutoDTO produtoDTO) {
        ProdutoRepositorio repositorio = new ProdutoRepositorio();
        ProdutoEntidade entidade = new ProdutoEntidade();
        entidade.setNome(produtoDTO.getNome());
        entidade.setDescricao(produtoDTO.getDescricao());
        entidade.setValor(produtoDTO.getValor());

        repositorio.salvar(entidade);

        return "listar-produtos";
    }
}
