/*
Construir um programa que receba, via teclado do uysuario, n nomes de pessoas.
1) não pode haver nomes repitidos -- foi
2) ordernar -- foi
3) adicionar o usuario, pesquisar se ele esta la
4) mostrar -- foi
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        char escolha;
        String nome;

        do {

            System.out.println("Digite um nome:");
            nome = input.nextLine();
           if (!list.contains(nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase())) {
                    list.add(nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase());
            } else {
                System.out.println("Nome já existe na lista");
            }

            System.out.println("Você quer adicionar outro nome? (s/n)");
            escolha = input.next().charAt(0);
            input.nextLine();

            list.sort(null);

        }while(escolha != 'n' && escolha != 'N');

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Deseja excluir alguém da lista? (s/n)");
        escolha = input.next().charAt(0);
        input.nextLine();

        if (escolha != 'n') {
            System.out.println("Digite o nome que deseja excluir:");
            nome = input.nextLine();
            list.remove(nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase());
        }

        for (String n : list) {
            System.out.println(n);
        }

    }
}
