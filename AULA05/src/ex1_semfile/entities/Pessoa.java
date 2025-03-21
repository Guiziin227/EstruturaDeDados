package ex1_semfile.entities;

import java.util.List;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void GerandoEmail(String nome, List<Pessoa> list) {

        String email = "";
        String[] partes = nome.split(" ");
        String primeiroNome = partes[0].toLowerCase();
        String caracterDoMeio = partes.length > 2 ? partes[1].substring(0, 1).toLowerCase() : "";
        String ultimoNome = partes[partes.length - 1].toLowerCase();

        email = primeiroNome + "." + ultimoNome + "@ufn.edu.com";

        for (Pessoa p : list) {

            if (p.getEmail().equals(email)) {
                email = primeiroNome + "." + caracterDoMeio + ultimoNome + "@ufn.edu.com";
                break;
            }
        }

        this.email = email;
    }
}
