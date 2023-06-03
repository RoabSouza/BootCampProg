package br.com.desafio;

public class Curso extends Conteudo {
	
	private int CargaHoraria;

	public Curso() {

	}

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO  * CargaHoraria;
	}

	@Override
	public String toString() {
		return  "Titulo" + getTitulo() + 
				"Descrição" + getDescrição() + 
				"CargaHoraria=" + CargaHoraria + "]";
	}

}
