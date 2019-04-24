package br.ufjf.dcc193.trb1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trb1.model.*;
import br.ufjf.dcc193.trb1.repository.*;


@Controller
public class RelatorioController {
    @Autowired
    SedeRepository sedeRep;
    @Autowired
    AtividadeRepository atvRep;

    @RequestMapping("Relatorio/somaHoraCategoriaPorSede")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Relatorio/somaHoraCategoriaPorSede");

        List<Atividade> atividades = atvRep.findAll();
        List<Sede> sedes = sedeRep.findAll();

        List<SomatorioHorasCategoria> itens= new ArrayList<SomatorioHorasCategoria>();

        for (Sede sede : sedes) {
            SomatorioHorasCategoria item = new SomatorioHorasCategoria();
            item.setSede(sede.getNomeFantasia());
            Double hrComputCatAssistencial=0.0;
            Double hrComputCatJuridica=0.0;
            Double hrComputCatFinanceira=0.0;
            Double hrComputCatExecutiva=0.0;
            for (Atividade atividade : atividades) {
                if(atividade.getSedeId() == sede.getId()){
                    hrComputCatAssistencial += atividade.getHrComputCatAssistencial();
                    hrComputCatJuridica += atividade.getHrComputCatJuridica();
                    hrComputCatFinanceira += atividade.getHrComputCatFinanceira();
                    hrComputCatExecutiva += atividade.getHrComputCatExecutiva();
                }
            }
            item.setSumHrComputCatAssistencial(hrComputCatAssistencial);
            item.setSumHrComputCatJuridica(hrComputCatJuridica);
            item.setSumHrComputCatFinanceira(hrComputCatFinanceira);
            item.setSumHrComputCatExecutiva(hrComputCatExecutiva);
            itens.add(item);
        }
        mv.addObject("itens", itens);
        return mv;
    }
}