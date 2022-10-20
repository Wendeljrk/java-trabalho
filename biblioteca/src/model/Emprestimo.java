package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Emprestimo {

	private int idEmprestimo;
	public int getIdEmprestimo() {
		return idEmprestimo;
	}



	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}



	public List<Livro> getEmprestimoItems() {
		return emprestimoItems;
	}



	public void setEmprestimoItems(List<Livro> emprestimoItems) {
		this.emprestimoItems = emprestimoItems;
	}

	private String dtEmprestimo;

	private Pessoa pessoa;
	private String dtDevolucao;
	private Funcionario funcionario;

	private Livro livro;
	private List<Livro> emprestimoItems = new ArrayList<Livro>();
	
	public Emprestimo(int idEmprestimo,String dtEmprestimo, String dtDevolucao,Pessoa pessoa,Funcionario funcionario ) {
		this.idEmprestimo=idEmprestimo;
		this.dtEmprestimo=dtEmprestimo;
		this.dtDevolucao=dtDevolucao;
		this.pessoa=pessoa;
		this.funcionario=funcionario;
		
	}
	
		
	
	public Pessoa getPessoa() {
		return pessoa;
	}



	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}



	public String getDtEmprestimo() {
		return dtEmprestimo;
	}
	
	public void setDtEmprestimo(String dtEmprestimo) {
		this.dtEmprestimo = dtEmprestimo;
	}

	public String getDtDevolucao() {
		return dtDevolucao;
	}
	
	public void setDtDevolucao(String dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	
	
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}



	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}



	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public void addListEmprestimos(Livro livro) {
		if(emprestimoItems.size()<3) {
		this.emprestimoItems.add(livro);
			}
		else {
			System.out.println("Nao e possivel adicionar mais livros a este emprestimo");
			}
		}
}
