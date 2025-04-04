package a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> equipes = new ArrayList<>();

        System.out.print("Quantas equipes deseja cadastrar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da equipe " + (i + 1) + ": ");
            String equipe = scanner.nextLine().toUpperCase();

            if (!equipes.contains(equipe)) { // Controle de duplicados
                equipes.add(equipe);
            } else {
                System.out.println("Equipe já cadastrada. Digite outra.");
                i--; // Repete a iteração para garantir o número correto de equipes
            }
        }

        Collections.sort(equipes); // Ordena a lista de equipes

        System.out.println("\nEquipes cadastradas (ordenadas):");
        for (String equipe : equipes) {
            System.out.println("- " + equipe);
        }

        System.out.println("\nTotal de equipes cadastradas: " + equipes.size());

        scanner.close();
    }
}
