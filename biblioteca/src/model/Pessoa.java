package model;

import java.util.ArrayList;
import java.util.List;



public class Pessoa {

	
	private String nome;
	
	private int cpf;
	
	private String dtNascimento;
	
	private int idade;
	
	
	private List<Emprestimo> emprestimoItems = new ArrayList<Emprestimo>();

	
	public Pessoa(String nome,int cpf, String dtNascimento, int idade) { 
		this.nome=nome;
		this.cpf=cpf;
		this.dtNascimento=dtNascimento;
		this.idade=idade;
		
	}
	

	
	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public String getDtNascimento() {
		return dtNascimento;
	}



	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Emprestimo> getEmprestimoItems() {
		return emprestimoItems;
	}

	public void setEmprestimoItems(List<Emprestimo> emprestimoItems) {
		this.emprestimoItems = emprestimoItems;
	}

}
