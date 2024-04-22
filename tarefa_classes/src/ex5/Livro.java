package ex5;

// classe livro com as váriaveis e os contrutores //
public class Livro {
	
		
		private String autor;
		private String titulo;
		private int anoPublicacao;
		
	
	public Livro(String autor, String titulo, int anoPublicacao) {
		this.autor = autor;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	
	}
		// getters e setters das váriaveis do método

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	// Método que exibe os detalhes do livro//
	
	public void resumo() {
		System.out.println("Autor: "+ this.autor);
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Ano de publicação: "+this.anoPublicacao);
		
	
	
	}
}
