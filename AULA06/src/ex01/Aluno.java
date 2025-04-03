package ex01;

import java.util.Objects;

public class Aluno {
    private int matricula;
    private String nome;
    private String email;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno() {}

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = gerarEmail();
    }

    public String gerarEmail() {
        String e[];
        e = this.nome.toLowerCase().split(" ");
        return e[0] + "." + e[e.length - 1] + "@" + "ufn.edu.br";
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(email, aluno.email);
    }
}
