package br.com.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate Data;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}

	public Mentoria() {

	}

	public LocalDate getData() {
		return Data;
	}

	public void setData(LocalDate data) {
		this.Data = data;
	}

	@Override
	public String toString() {
		return "Titulo" + getTitulo() + "Descrição" + getDescrição() + "Data" + Data;
	}

}
