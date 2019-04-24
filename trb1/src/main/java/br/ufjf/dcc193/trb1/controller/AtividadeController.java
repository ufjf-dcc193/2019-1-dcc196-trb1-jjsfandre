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

    @RequestMapping("Atividade/Delete")
    public ModelAndView delete(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Atividade/list");

        Atividade atividade = rep.findById(id).get();
        rep.delete(atividade);

        List<Atividade> atividades = rep.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("Atividade/Edit")
    public ModelAndView edit(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Atividade/detail");

        Atividade atividade = rep.findById(id).get();

        mv.addObject("atividade", atividade);
        return mv;
    }

    @RequestMapping("Atividade/New")
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Atividade/detail");
        return mv;
    }


    
    @RequestMapping("Atividade/Save")
    public ModelAndView save(Atividade a) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Atividade/list");

        Atividade atividade;

        if (a.getId()!=null)
            atividade = rep.findById(a.getId()).get();
        else
            atividade = new Atividade();

        atividade.setTitulo(a.getTitulo());
        atividade.setDescricao(a.getDescricao());
        atividade.setDtInicio(a.getDtInicio());
        atividade.setDtFim(a.getDtFim());
        atividade.setHrComputCatAssistencial(a.getHrComputCatAssistencial());
        atividade.setHrComputCatJuridica(a.getHrComputCatJuridica());
        atividade.setHrComputCatFinanceira(a.getHrComputCatFinanceira());
        atividade.setHrComputCatExecutiva(a.getHrComputCatExecutiva());

        rep.save(atividade);

        List<Atividade> atividades = rep.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }
}