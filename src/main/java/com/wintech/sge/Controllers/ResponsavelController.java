package com.wintech.sge.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResponsavelController {
    
    @GetMapping("aluno/cadastro/step-2")
    public String cadastrarResponsavel(Model model){
        model.addAttribute("titulo", "S.G.E - Cadastro de Aluno");
        return "alunos/cadastro/dadosResponsaveis";
    }
}
