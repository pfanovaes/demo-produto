package br.com.letscode.demoproduto.controlador;

import br.com.letscode.demoproduto.dto.ProdutoDTO;
import br.com.letscode.demoproduto.entidade.ProdutoEntidade;
import br.com.letscode.demoproduto.repositorio.ProdutoRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/produtos")
public class ProdutoControlador {

    @GetMapping("/form")

    public String obterFormulario() {
        return "produto-form";
    }

    @PostMapping("/cadastrar-produto")
    public RedirectView cadastrarProduto(ProdutoDTO produtoDTO, RedirectAttributes redirectAttributes) {
        ProdutoRepositorio repositorio = new ProdutoRepositorio();

        ProdutoEntidade entidade = new ProdutoEntidade(produtoDTO);

        ProdutoEntidade entidadeSalva = repositorio.salvar(entidade);

        //model.addAttribute("produtos", repositorio.obterTodos());

        // Repassando Atributos para Listar
        redirectAttributes.addFlashAttribute("produtos", repositorio.obterTodos());

        RedirectView redirectView = new RedirectView("/produtos/listar", true);

        return redirectView;
    }

    @GetMapping("/listar")
    public String listar() {
        return "listar-produtos";
    }

}
