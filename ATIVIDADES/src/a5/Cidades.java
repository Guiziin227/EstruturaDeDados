package a5;

public class Cidades {
    private String nome;
    private String estado;

    public Cidades(String nome, String estado) {
        this.nome = nome.toUpperCase();
        this.estado = estado.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cidades)) return false;
        Cidades outra = (Cidades) obj;
        return this.nome.equals(outra.nome);
    }

    @Override
    public String toString() {
        return nome + " - " + estado;
    }
}