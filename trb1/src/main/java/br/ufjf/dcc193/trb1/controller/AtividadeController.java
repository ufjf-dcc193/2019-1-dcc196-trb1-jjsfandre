package br.ufjf.dcc193.trb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trb1.model.Atividade;
import br.ufjf.dcc193.trb1.repository.AtividadeRepository;


@Controller
public class AtividadeController {
    @Autowired
    AtividadeRepository rep;


    @RequestMapping("Atividade/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Atividade/list");

        List<Atividade> atividades = rep.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }
}