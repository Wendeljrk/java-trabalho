package model;

import java.util.ArrayList;
import java.util.List;

public class Jornal {

	
	private String titulo;
	
	private String autor;
	

	private Categoria categoria;


	private Editora editora;
	
	
	private List<Estoque> estoqueItems = new ArrayList<Estoque>();
	

	private List<Emprestimo> emprestimoItems = new ArrayList<Emprestimo>();
	
	public Jornal(String titulo,String autor,Categoria categoria,Editora editora) { 
		this.titulo=titulo;
		this.autor=autor;
		this.categoria=categoria;
		this.editora=editora;
	}
	

	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Editora getEditora() {
		return editora;
	}
	
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public List<Estoque> getEstoqueItems() {
		return estoqueItems;
	}
	
	public void setEstoqueItems(List<Estoque> estoqueItems) {
		this.estoqueItems = estoqueItems;
	}

	public List<Emprestimo> getEmprestimoItems() {
		return emprestimoItems;
	}

	public void setEmprestimoItems(List<Emprestimo> emprestimoItems) {
		this.emprestimoItems = emprestimoItems;
	}

}
