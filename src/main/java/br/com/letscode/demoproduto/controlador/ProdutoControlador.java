package br.com.letscode.demoproduto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutoControlador {

    @GetMapping("/form")

    public String obterFormulario() {
        return "produto-form";
    }
}
