package br.com.desafio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String Titulo;
	private String Descri��o;
	
	public abstract double calcularXp();
	

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public String getDescri��o() {
		return Descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.Descri��o = descri��o;
	}


	
	
	
	
}
