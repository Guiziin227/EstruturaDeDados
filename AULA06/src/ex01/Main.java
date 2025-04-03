package ex01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> list = new ArrayList<Aluno>();
        String nome;
        int matricula = 1;
        String opcao;

        while (true) {
            System.out.println("Digite o nome do aluno: ");
            nome = sc.nextLine().toUpperCase();
            Aluno aluno = new Aluno(matricula, nome);
            if (list.contains(aluno)) {
                System.out.println("Aluno com esse email ja cadastrado!");
                System.gc();
            } else {
                list.add(aluno);
                matricula++;
            }


            System.out.println("Quer continuar? ");
            opcao = sc.nextLine();
            if (opcao.equals("exit")) {
                break;
            }
        }

        //list.sort(Comparator.comparing(Aluno::getNome));

        list.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        for (Aluno aluno : list) {
            System.out.println(aluno);
        }

    }
}