package br.ufjf.dcc193.trb1;

import java.util.Date;

import org.joda.time.LocalDate;
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
		//criarDadosTeste(ctx);
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
		MembroRepository rep = ctx.getBean(MembroRepository.class);
		Date dtEntrada1 = new LocalDate(2019, 1, 1).toDate();
		Date dtEntrada2 = new LocalDate(2019, 1, 2).toDate();
		Date dtEntrada3 = new LocalDate(2019, 1, 3).toDate();
		Date dtEntrada4 = new LocalDate(2019, 1, 4).toDate();
		Date dtSaida1 = new LocalDate(2019, 1, 5).toDate();
		Date dtSaida2 = new LocalDate(2019, 1, 6).toDate();
		Membro m1 = new Membro("João da Silva", "Coordenador","joao@mail.com",dtEntrada1,dtSaida1 );
		Membro m2 = new Membro("Maria Souza", "Auxiliar","maria@mail.com",dtEntrada2,dtSaida2 );
		Membro m3 = new Membro("José Alvim", "Secretário","jose@mail.com",dtEntrada3,null );
		Membro m4 = new Membro("Joana Gonçalves", "Diretora","joana@mail.com",dtEntrada4,null );
		rep.save(m1);
		rep.save(m2);
		rep.save(m3);
		rep.save(m4);
	}
	public static void populaTabelaAtividade(ConfigurableApplicationContext ctx){
		AtividadeRepository rep = ctx.getBean(AtividadeRepository.class);
		Date dtInicio1 = new LocalDate(2019, 1, 1).toDate();
		Date dtInicio2 = new LocalDate(2019, 1, 2).toDate();
		Date dtInicio3 = new LocalDate(2019, 1, 3).toDate();
		Date dtInicio4 = new LocalDate(2019, 1, 4).toDate();
		Date dtFim1 = new LocalDate(2019, 2, 1).toDate();
		Date dtFim2 = new LocalDate(2019, 2, 2).toDate();
		Date dtFim3 = new LocalDate(2019, 2, 3).toDate();
		Date dtFim4 = new LocalDate(2019, 2, 4).toDate();
		Atividade a1 = new Atividade("Atividade 1","Descrição 1", dtInicio1, dtFim1,10.0,20.0,30.0,40.0);
		Atividade a2 = new Atividade("Atividade 2","Descrição 2", dtInicio2, dtFim2,50.0,60.0,70.0,80.0);
		Atividade a3 = new Atividade("Atividade 3","Descrição 3", dtInicio3, dtFim3,90.0,100.0,110.0,120.0);
		Atividade a4 = new Atividade("Atividade 4","Descrição 4", dtInicio4, dtFim4,130.0,140.0,150.0,160.0);
		rep.save(a1);
		rep.save(a2);
		rep.save(a3);
		rep.save(a4);
	}
}