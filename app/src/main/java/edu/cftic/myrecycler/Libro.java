package edu.cftic.myrecycler;

public class Libro {


    private String autor;
    private String titulo;
    private String editorial;

    public Libro(String autor, String titulo, String editorial) {
        this.autor = autor;
        this.titulo = titulo;
        this.editorial= editorial;


    }
    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

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
}
