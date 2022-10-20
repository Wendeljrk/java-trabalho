package biblioteca;

import model.*;
//WENDEL PRADO DA SILVA JUNIOR
//202009013023
public class Main {
	public static void main(String[] args) {
		System.out.println("Criando uma categoria de livro" );
		
	    Categoria aventura = new Categoria(2521,"aventura");
	    System.out.println("Categoria criada: "+ aventura.getDescricao());
	    Categoria moda = new Categoria(2521,"moda");
	    System.out.println("Categoria criada: "+ moda.getDescricao());
	    Editora abril = new Editora(1290,"abril");
	    System.out.println("Editora criada: "+ abril.getNome());
	    
	    Pessoa ciclode = new Pessoa(
	    		"ciclode",
	    		123809765,
	    		"23/10/1997",
	    		25
	    		);
	    System.out.println("Pessoa criada: "+ ciclode.getNome());
	    Gerente ororo = new Gerente(
	    		"ororo",
	    		12380976,
	    		"23/10/1994",
	    		29,
	    		55555
	    		);
	    System.out.println("Gerente criada: "+ ororo.getNome());	
	    
	    Livro noites = new Livro("noites","Awawa",aventura,abril);
	    System.out.println("Livro criado: "+ noites.getTitulo());
	    Revista capricho = new Revista("capricho","Awawa",moda,abril);
	    System.out.println("Revista criada: "+ capricho.getTitulo());
	    
	    Emprestimo ciclopeEmprestimo = new Emprestimo(
	    		12321,
	    		"25/03/2021",
	    		"25/04/2021",
	    		ciclode,
	    		ororo
	    		);
	    System.out.println("Emprestimo criado: "+ ciclopeEmprestimo.getIdEmprestimo());
	    
	    ciclopeEmprestimo.addListEmprestimos(noites);
	    ciclopeEmprestimo.addListEmprestimos(noites);
	    ciclopeEmprestimo.addListEmprestimos(noites);
	    System.out.println("Tentando adicionar mais de três livros ao emprestimo:");
	    ciclopeEmprestimo.addListEmprestimos(noites);
	}
}

