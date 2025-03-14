package ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList> listaCienciaComputacao = new ArrayList<ArrayList>();
        ArrayList<String> bancoDeDados;
        ArrayList<String> estruturaDeDados;
        ArrayList<String> comunicacaoDeDados;
        ArrayList<String> programacaoOrientada;

        bancoDeDados = new ArrayList<>();
        bancoDeDados.add("Pedro");
        bancoDeDados.add("Maria");
        bancoDeDados.add("Joao");
        bancoDeDados.sort(null);
        listaCienciaComputacao.add(bancoDeDados);

        comunicacaoDeDados = new ArrayList<>();
        comunicacaoDeDados.add("Pedro");
        comunicacaoDeDados.add("Maria");
        comunicacaoDeDados.add("Arthur");
        comunicacaoDeDados.add("Ana");
        comunicacaoDeDados.add("Guilherme");
        listaCienciaComputacao.add(comunicacaoDeDados);

        estruturaDeDados = new ArrayList<>();
        estruturaDeDados.add("Pedro");
        //estruturaDeDados.add("Maria");
        estruturaDeDados.add("Joao");
        listaCienciaComputacao.add(estruturaDeDados);

        programacaoOrientada = new ArrayList<>();
        programacaoOrientada.add("Ana");
        programacaoOrientada.add("Maria");
        programacaoOrientada.add("Guilherme");
        programacaoOrientada.add("Arthur");
        listaCienciaComputacao.add(programacaoOrientada);


        // Ordenar listaCienciaComputacao com base no número de pessoas
        listaCienciaComputacao.sort(Comparator.comparingInt(ArrayList::size));

        for(ArrayList lista : listaCienciaComputacao){
            System.out.println("Disciplina: " + lista + " | Alunos: " + lista.size());
        }

//        String nome;
//        System.out.println("Quem você quer ver o numero de aparecicoes");
//        nome = sc.nextLine();
//        System.out.println(nome);

//        int aparece = 0;
//
//        for(ArrayList lista : listaCienciaComputacao){
//            for (Object o : lista) {
//                if (o.equals(nome)) {
//                    aparece++;
//                }
//            }
//      }
//
//        if (aparece == 1) {
//            System.out.println("Nome " + nome + " cursa " + aparece + " disciplina");
//        }else{
//            System.out.println("Nome " + nome + " cursa " + aparece + " disciplinas");
//        }

        ArrayList<String> nomesAvaliados = new ArrayList<>();
        String nomeTmp;
        int contador;
        for (ArrayList lista : listaCienciaComputacao) {
            for (Object nm : lista) {
                nomeTmp = nm.toString();
                if (!nomesAvaliados.contains(nomeTmp)) {
                    nomesAvaliados.add(nomeTmp);
                    contador = 0;
                    for (ArrayList d : listaCienciaComputacao) {
                        for (Object nm2 : d) {
                            if (nm.equals(nm2)) {
                                contador++;
                            }
                        }
                    }
                    System.out.println("Nome: " + nomeTmp + " aparece " + contador);
                }

            }
        }
    }
}
