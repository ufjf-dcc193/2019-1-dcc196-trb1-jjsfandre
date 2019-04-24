package br.ufjf.dcc193.trb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trb1.model.Membro;
import br.ufjf.dcc193.trb1.repository.MembroRepository;


@Controller
public class MembroController {
    @Autowired
    MembroRepository rep;

    @RequestMapping("Membro/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Membro/list");

        List<Membro> membros = rep.findAll();
        mv.addObject("membros", membros);
        return mv;
    }
}