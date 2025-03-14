package ex3;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList> cienciaComputacao = new ArrayList<ArrayList>();


        cienciaComputacao.add(new ArrayList<String>());
        cienciaComputacao.add(new ArrayList<String>());
        cienciaComputacao.add(new ArrayList<String>());

        cienciaComputacao.get(0).add("Gui");
        cienciaComputacao.get(0).add("Biju");
        cienciaComputacao.get(0).add("Ana");
        cienciaComputacao.get(0).add("Ingrid");


        cienciaComputacao.get(1).add("Gui");
        cienciaComputacao.get(1).add("Clenio");

        cienciaComputacao.get(2).add("Malu");
        cienciaComputacao.get(2).add("Ingrid");
        cienciaComputacao.get(2).add("Ana");

        cienciaComputacao.sort(Comparator.comparingInt(ArrayList::size));

        for (ArrayList c : cienciaComputacao) {
            System.out.println(c);
        }

        ArrayList<String> nomeAvaliados = new ArrayList<String>();
        int contador = 0;
        String nomeTMP;

        for (ArrayList c : cienciaComputacao) {
            for (Object o : c) {
                nomeTMP = o.toString();

                if (!nomeAvaliados.contains(nomeTMP)) {
                    nomeAvaliados.add(nomeTMP);
                    contador = 0;
                    for (ArrayList  d : cienciaComputacao) {
                        for (Object o2 : d) {
                            if (o2.equals(nomeTMP)) {
                                contador++;
                            }
                        }
                    }
                    System.out.println("Nome: " + nomeTMP + " aparece " + contador);
                }

            }
        }
    }
}
