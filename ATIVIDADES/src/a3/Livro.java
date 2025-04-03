package a3;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    // Construtor
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Sobrescrita do método equals para comparar pelo ISBN
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica se é um Livro
        Livro livro = (Livro) obj;
        return Objects.equals(isbn, livro.isbn); // Compara apenas o ISBN
    }

    // Método toString para facilitar a exibição dos livros
    @Override
    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn;
    }
}