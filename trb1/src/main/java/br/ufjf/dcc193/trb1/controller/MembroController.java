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



    @RequestMapping("Membro/Delete")
    public ModelAndView delete(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Membro/list");

        Membro membro = rep.findById(id).get();
        rep.delete(membro);

        List<Membro> membros = rep.findAll();
        mv.addObject("membros", membros);
        return mv;
    }

    @RequestMapping("Membro/Edit")
    public ModelAndView edit(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Membro/detail");

        Membro membro = rep.findById(id).get();

        mv.addObject("membro", membro);
        return mv;
    }

    @RequestMapping("Membro/New")
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Membro/detail");
        return mv;
    }


    
    @RequestMapping("Membro/Save")
    public ModelAndView save(Membro m) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Membro/list");

        Membro membro;

        if (m.getId()!=null)
            membro = rep.findById(m.getId()).get();
        else
            membro = new Membro();
            
        membro.setNome(m.getNome());
        membro.setFuncao(m.getFuncao());
        membro.setEmail(m.getEmail());
        membro.setDtEntrada(m.getDtEntrada());
        membro.setDtSaida(m.getDtSaida());

        rep.save(membro);

        List<Membro> membros = rep.findAll();
        mv.addObject("membros", membros);
        return mv;
    }
}