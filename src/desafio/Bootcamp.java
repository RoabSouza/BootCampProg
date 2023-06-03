package br.com.desafio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descrição;
	private LocalDate dataInicial = LocalDate.now();
	private LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> desvsincritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Set<Dev> getDesvsincritos() {
		return desvsincritos;
	}

	public void setDesvsincritos(Set<Dev> desvsincritos) {
		this.desvsincritos = desvsincritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descrição, desvsincritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descrição, other.descrição)
				&& Objects.equals(desvsincritos, other.desvsincritos) && Objects.equals(nome, other.nome);
	}

}
