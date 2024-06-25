package forms;

public class Livro {
    private String titulo;
    private String autor;
    private int quantPaginas;

    public void setLivro (String titulo, String autor, int quantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantPaginas = quantPaginas;
    }

    public String getTitulo () {
        return titulo;
    }

    public String getAutor () {
        return autor;
    }

    public int getQuantPaginas () {
        return quantPaginas;
    }

    public String abrir () {
        System.out.println("Abriu o livro");
        String mensagem = "Abriu o livro  ";
        return mensagem + this.autor ;
    }

    public void fechar () {
        System.out.println("fechour");
    }

    public void virarPagina() {
        System.out.println("Passou a página.");
    }
}
