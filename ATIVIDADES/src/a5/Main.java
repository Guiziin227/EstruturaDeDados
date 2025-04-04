package a5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cidades> cidades = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Cadastrar Cidade");
            System.out.println("2 - Listar Cidades");
            System.out.println("3 - Pesquisar Cidade");
            System.out.println("4 - Remover Cidade");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da cidade: ");
                    String nome = scanner.nextLine().toUpperCase();

                    System.out.print("Digite a sigla do estado: ");
                    String estado = scanner.nextLine().toUpperCase();

                    Cidades novaCidade = new Cidades(nome, estado);

                    if (!cidades.contains(novaCidade)) {
                        cidades.add(novaCidade);
                        System.out.println("Cidade cadastrada com sucesso!");
                    } else {
                        System.out.println("Cidade já cadastrada.");
                    }
                    break;

                case 2:
                    cidades.sort( (c1, c2) -> c1.getNome().compareTo(c2.getNome()));
                    System.out.println("\nCidades cadastradas:");
                    for (Cidades c : cidades) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome da cidade para pesquisa: ");
                    String pesquisa = scanner.nextLine().toUpperCase();
                    boolean cidadeEncontrada = false;

                    for (Cidades c : cidades) {
                        if (c.getNome().equals(pesquisa)) {
                            System.out.println("Cidade encontrada: " + c.getNome() + " - " + c.getEstado());
                            cidadeEncontrada = true;
                            break;
                        }
                    }
                    if (!cidadeEncontrada) {
                        System.out.println("Cidade não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome da cidade para remover: ");
                    String remover = scanner.nextLine().toUpperCase();
                    boolean cidadeRemovida = false;

                    for (int i = 0; i < cidades.size(); i++) {
                        if (cidades.get(i).getNome().equals(remover)) {
                            cidades.remove(i);
                            System.out.println("Cidade removida com sucesso.");
                            cidadeRemovida = true;
                            break;
                        }
                    }
                    if (!cidadeRemovida) {
                        System.out.println("Cidade não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}