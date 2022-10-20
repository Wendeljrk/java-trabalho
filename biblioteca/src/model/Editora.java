package model;

public class Editora {

		private int idEditora;
		
		private String nome;
		
		
		public Editora(int idEditora, String nome) {
			this.idEditora=idEditora;
			this.nome=nome;
		}
		
		public int getIdEditora() {
			return idEditora;
		}
		
		public void setIdEditora(int idEditora) {
			this.idEditora = idEditora;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}


}
