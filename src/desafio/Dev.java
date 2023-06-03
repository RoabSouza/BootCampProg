package br.com.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> ConteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet<>();

	public void increverbootcamp(Bootcamp bootcamp) {

		this.ConteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDesvsincritos().add(this);

	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.ConteudoInscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.ConteudosConcluidos.add(conteudo.get());
			this.ConteudoInscrito.remove(conteudo.get());
		}
		else {
			System.err.println("Você não esta matriculado em nenhum conteudo!!");
		}
	}

	public double calcularTotalXP() {
		return this.ConteudosConcluidos
				.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return ConteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		ConteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return ConteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		ConteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ConteudoInscrito, ConteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(ConteudoInscrito, other.ConteudoInscrito)
				&& Objects.equals(ConteudosConcluidos, other.ConteudosConcluidos) && Objects.equals(nome, other.nome);
	}
}
