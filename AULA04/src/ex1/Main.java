package ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaValorOcorrencia;
        ArrayList<ArrayList> listaPrincipal = new ArrayList<>();


        listaValorOcorrencia = new ArrayList<>();
        listaValorOcorrencia.add(126);
        listaValorOcorrencia.add(14);
        listaValorOcorrencia.add(230);
        listaValorOcorrencia.add(131);
        listaPrincipal.add(listaValorOcorrencia);

        listaValorOcorrencia = new ArrayList<>();
        listaValorOcorrencia.add(129);
        listaValorOcorrencia.add(23);
        listaPrincipal.add(listaValorOcorrencia);

        System.out.println("Exibindo item a item a lista principal");
        for(Object i : listaPrincipal.get(0)) {
            System.out.println(i);
        }

        System.out.println("Exibindo somente os pares");
        for(ArrayList lista : listaPrincipal) {
            for(Object i : lista) {
                if((int)i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
