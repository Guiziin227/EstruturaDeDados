/*Trabalho Estrutura de Dados pegando nomes por scanner
Código feito para criar um programa que receba o nome de N pessoas e gere um email para cada uma delas
Caso exista nome de duas pessoas iguais irá pegar a primeira letra do segundo nome e adicionar ao email
Igual feito no sistema da UFN.
 */

package ex1_semfile;

import ex1_semfile.entities.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex1_semfile.entities.Pessoa pessoa;
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantas pessoas serão registradas?");
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {

            System.out.println("Nome:");
            String nome = sc.nextLine();
            pessoa = new Pessoa(nome);

            int espacos = 0;
            for (int j = 0; j < nome.length(); j++) {
                if (nome.charAt(j) == ' ') {
                    espacos++;
                }
            }

            if (espacos == 0) {
                System.out.println("Nome inválido");
            } else {
                pessoa.GerandoEmail(nome, pessoas);
                pessoas.add(pessoa);
            }
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getEmail());
        }

        sc.close();
    }
}
