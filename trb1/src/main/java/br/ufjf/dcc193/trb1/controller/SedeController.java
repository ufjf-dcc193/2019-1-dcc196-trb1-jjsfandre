package br.ufjf.dcc193.trb1.controller;

import java.util.List;
import java.util.Optional;

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
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Sede/list");

        List<Sede> sedes = rep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("Sede/Delete")
    public ModelAndView delete(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Sede/list");

        Sede sede = rep.findById(id).get();
        rep.delete(sede);

        List<Sede> sedes = rep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("Sede/Edit")
    public ModelAndView edit(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Sede/detail");

        Sede sede = rep.findById(id).get();

        mv.addObject("sede", sede);
        return mv;
    }

    @RequestMapping("Sede/New")
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Sede/detail");
        return mv;
    }


    
    @RequestMapping("Sede/Save")
    public ModelAndView save(Sede s) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Sede/list");

        Sede sede;

        if (s.getId()!=null)
            sede = rep.findById(s.getId()).get();
        else
            sede = new Sede();

        sede.setBairro(s.getBairro());
        sede.setCidade(s.getCidade());
        sede.setEmail(s.getEmail());
        sede.setNomeFantasia(s.getNomeFantasia());
        sede.setSite(s.getSite());
        sede.setTelefone(s.getTelefone());
        sede.setUf(s.getUf());

        rep.save(sede);

        List<Sede> sedes = rep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

}