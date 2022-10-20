package model;

public class Funcionario extends Pessoa{
	
	private int Matricula;
	
	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public Funcionario(String nome, int cpf, String dtNascimento, int idade, int matricula) {
		super(nome, cpf, dtNascimento, idade);
		this.Matricula = matricula;
	}

}
