package br.com.desafio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String Titulo;
	private String Descrição;
	
	public abstract double calcularXp();
	

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		this.Descrição = descrição;
	}


	
	
	
	
}
