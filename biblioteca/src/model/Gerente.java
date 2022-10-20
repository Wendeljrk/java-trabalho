package model;

public class Gerente extends Funcionario {
	private int idGerente;

	public int getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
	}

	public Gerente(String nome, int cpf, String dtNascimento, int idade, int matricula) {
		super(nome, cpf, dtNascimento, idade, matricula);
		// TODO Auto-generated constructor stub
	}
	
}
