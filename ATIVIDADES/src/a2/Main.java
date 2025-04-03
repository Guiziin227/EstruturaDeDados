package a2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<ArrayList> cienciaDaComputacao = new ArrayList<>();

        //0 - estruturas de dados
        //1 - banco de dados
        //2 - comunicacao de dados

        cienciaDaComputacao.add(new ArrayList<>());
        cienciaDaComputacao.add(new ArrayList<>());
        cienciaDaComputacao.add(new ArrayList<>());

        cienciaDaComputacao.get(0).add("Ana");
        cienciaDaComputacao.get(0).add("Biju");
        cienciaDaComputacao.get(0).add("Gui");

        cienciaDaComputacao.get(1).add("Ana");
        cienciaDaComputacao.get(1).add("Biju");
        cienciaDaComputacao.get(1).add("Gui");

        cienciaDaComputacao.get(2).add("Ana");
        cienciaDaComputacao.get(2).add("Clenio");
        cienciaDaComputacao.get(2).add("Gui");


        ArrayList<String> nomeAvaliados = new ArrayList<>();
        String nomeTMP;
        int contador = 0;

        for (ArrayList cc : cienciaDaComputacao) {
            for (Object o : cc) {
                nomeTMP = o.toString();
                if(!nomeAvaliados .contains(nomeTMP)){
                    nomeAvaliados.add(nomeTMP);
                    contador = 0;
                    for (ArrayList c : cienciaDaComputacao) {
                        for (Object o2 : c) {
                            if (o2.equals(nomeTMP)) {
                                contador++;
                            }
                        }
                    }
                    System.out.println("Nome: " + nomeTMP + " aparece " + contador);
                }
            }
        }

        sc.close();

    }
}
