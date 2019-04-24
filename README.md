# 2019-1-dcc196-trb1-jjsfandre

****Autor****

Nome: Jônatas Sousa de Faria André
E-mail: jjsfandre@gmail.com
Matrícula: 201676030

****Projeto****

Sistema de gestão e acompanhamento voltado para atividades de Organizações não governamentais. 

O projeto está configurado para dropar e recriar o banco todas as vezes que o servidor do spring boot é iniciado. 
Para facilitar o uso, o MainApplication.java possui um método que é chamado sempre que o servidor é iniciado, populando dados básicos para os 3 principais objetos. 

Caso queira manter os dados mesmo após a interrupção do servidor, retirar a chamada do método 'criarDadosTeste' do 'main' da classe MainApplication.java e configurar o hibernate em application.properties para não realizar nada no banco (spring.jpa.hibernate.ddl-auto=none)