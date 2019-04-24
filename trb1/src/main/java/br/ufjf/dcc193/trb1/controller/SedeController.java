package br.ufjf.dcc193.trb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trb1.model.Sede;
import br.ufjf.dcc193.trb1.repository.SedeRepository;


@Controller
public class SedeController {
    @Autowired
    SedeRepository rep;

    @RequestMapping("Sede/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Sede/list");

        List<Sede> sedes = rep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }    
}