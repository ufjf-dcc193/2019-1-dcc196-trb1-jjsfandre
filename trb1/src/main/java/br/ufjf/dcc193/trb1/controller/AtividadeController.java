package br.ufjf.dcc193.trb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AtividadeController {
    
    @RequestMapping("Atividade/list")
    public String list(){
        return "Atividade/list";
    }
}