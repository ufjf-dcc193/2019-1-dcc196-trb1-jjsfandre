package br.ufjf.dcc193.trb1;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.dcc193.trb1.model.*;
import br.ufjf.dcc193.trb1.repository.*;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MainApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		criarDadosTeste(ctx);
	}

	public static void criarDadosTeste(ConfigurableApplicationContext ctx){
		populaTabelaSede(ctx);
		populaTabelaMembro(ctx);
		populaTabelaAtividade(ctx);
	}

	public static void populaTabelaSede(ConfigurableApplicationContext ctx){
		SedeRepository rep = ctx.getBean(SedeRepository.class);
		Sede s1 = new Sede("Nome 1","MG","Juiz de Fora", "Centro", "(32) 3215-0088","teste@mail.com","ong1.com.br");
		Sede s2 = new Sede("Nome 2","SP","São Paulo", "São Pedro", "(11) 2222-0088","teste2@mail.com","ong2.com.br");
		Sede s3 = new Sede("Nome 3","RJ","Rio de Janeiro", "Penha", "(21) 1111-0088","teste3@mail.com","ong3.com.br");
		Sede s4 = new Sede("Nome 4","ES","Vitória", "Praia", "(27) 3333-0088","teste4@mail.com","ong3.com.br");
		rep.save(s1);
		rep.save(s2);
		rep.save(s3);
		rep.save(s4);
	}

	public static void populaTabelaMembro(ConfigurableApplicationContext ctx){
		SedeRepository sedeRep = ctx.getBean(SedeRepository.class);
		Long sedeID = sedeRep.findAll().get(0).getId();
		MembroRepository rep = ctx.getBean(MembroRepository.class);
		Membro m1 = new Membro("João da Silva", "Coordenador","joao@mail.com","01/01/2019","05/01/2019",sedeID);
		Membro m2 = new Membro("Maria Souza", "Auxiliar","maria@mail.com","02/01/2019","05/01/2019",sedeID );
		Membro m3 = new Membro("José Alvim", "Secretário","jose@mail.com","03/01/2019",null,sedeID );
		Membro m4 = new Membro("Joana Gonçalves", "Diretora","joana@mail.com","04/01/2019",null,sedeID );
		rep.save(m1);
		rep.save(m2);
		rep.save(m3);
		rep.save(m4);
	}
	public static void populaTabelaAtividade(ConfigurableApplicationContext ctx){
		AtividadeRepository rep = ctx.getBean(AtividadeRepository.class);
		SedeRepository sedeRep = ctx.getBean(SedeRepository.class);
		Long sedeID = sedeRep.findAll().get(0).getId();
		Atividade a1 = new Atividade("Atividade 1","Descrição 1", "01/01/2019","01/02/2019",10.0,20.0,30.0,40.0,sedeID);
		Atividade a2 = new Atividade("Atividade 2","Descrição 2", "02/01/2019","02/02/2019",50.0,60.0,70.0,80.0,sedeID);
		Atividade a3 = new Atividade("Atividade 3","Descrição 3", "03/01/2019","03/02/2019",90.0,100.0,110.0,120.0,sedeID);
		Atividade a4 = new Atividade("Atividade 4","Descrição 4", "04/01/2019","04/02/2019",130.0,140.0,150.0,160.0,sedeID);
		rep.save(a1);
		rep.save(a2);
		rep.save(a3);
		rep.save(a4);
	}
}