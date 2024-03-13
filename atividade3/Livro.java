package atividade3;

public class Livro {
    private String titulo;
    private String autor;
    private int quant_paginas;

    public void setLivro (String titulo, String autor, int quant_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.quant_paginas = quant_paginas;
    }

    public String getTitulo () {
        return titulo;
    }

    public String getAutor () {
        return autor;
    }

    public int getQuantPaginas () {
        return quant_paginas;
    }

    public void abrir () {
        System.out.println("abriu");
    }

    public void fechar () {
        System.out.println("fechour");
    }

    public void virarPagina() {
        System.out.println("Passou a página.");
    }
}
