package br.com.desafio;

import java.time.LocalDate;

public class main {
	public static void main(String[] args) {

		
		Curso curso = new Curso();
		curso.setTitulo("Java");
		curso.setDescrição("Curso java");
		curso.setCargaHoraria(2);
		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("PHP");
		curso1.setDescrição("Curso PHP");
		curso1.setCargaHoraria(2);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria JAVA");
		mentoria.setDescrição("descrição mentoria JAVA");
		mentoria.setData(LocalDate.now());
		
		
		
		Bootcamp boot = new Bootcamp();	
		boot.setNome("Java developer");
		boot.setDescrição("Descrição do conteuo");
		boot.getConteudos().add(curso);
		boot.getConteudos().add(curso1);
		boot.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("joao");
		dev.increverbootcamp(boot);
		
		System.out.println("Conteudos inscritos" +dev.getConteudoInscrito());
		dev.progredir();
		System.out.println("-------------");
		System.out.println("Conteudos inscritos" +dev.getConteudoInscrito());
		System.out.println("Conteudos Concluidos" +dev.getConteudosConcluidos());
		
		System.out.println("-------------");
		
		Dev dev1 = new Dev();
		dev.setNome("pedro");
		dev1.increverbootcamp(boot);
		
		System.out.println("Conteudos inscritos" +dev1.getConteudoInscrito());
		dev1.progredir();
		System.out.println("-------------");
		System.out.println("Conteudos inscritos" +dev.getConteudoInscrito());
		System.out.println("Conteudos Concluidos" +dev.getConteudosConcluidos());
		
		
		
		

		
	}
}
