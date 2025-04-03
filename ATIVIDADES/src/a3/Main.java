package a3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> list = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            System.out.println("Nome do livro: ");
            String titulo = sc.nextLine();
            System.out.println("Nome do autor: ");
            String autor = sc.nextLine();
            System.out.println("ISBN: ");
            String isbn = sc.nextLine();
            sc.nextLine();
            Livro livro = new Livro(titulo, autor, isbn);
            if(list.contains(livro)){
                System.out.println("Livro com esse ISBN ja cadastrado!");
                System.gc();
            } else {
                list.add(livro);
            }
        }

        for (Livro livro : list) {
            System.out.println(livro);
        }
    }
}
