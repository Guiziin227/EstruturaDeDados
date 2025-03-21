package ex2_comfile;

import ex2_comfile.entities.Pessoa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get("names.txt"));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for (String nome : lines) {
            Pessoa pessoa = new Pessoa(nome);

            int espacos = 0;
            for (int j = 0; j < nome.length(); j++) {
                if (nome.charAt(j) == ' ') {
                    espacos++;
                }
            }

            if (espacos == 0) {
                System.out.println("Nome inválido: " + nome);
            } else {
                pessoa.GerandoEmail(nome, pessoas);
                pessoas.add(pessoa);
            }
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getEmail());
        }
    }
}