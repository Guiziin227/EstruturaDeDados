package a1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<HashMap> cienciaComputacao = new ArrayList<>();

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put("Banco de Dados", new ArrayList<String>());
        map.get("Banco de Dados").add("Guilherme");
        map.get("Banco de Dados").add("Clenio");
        map.get("Banco de Dados").add("Ingrid");
        map.get("Banco de Dados").add("Pedro");
        cienciaComputacao.add((HashMap) map);

        map = new HashMap<>();
        map.put("Comunicacao de Dados", new ArrayList<String>());
        map.get("Comunicacao de Dados").add("Ana");
        map.get("Comunicacao de Dados").add("Clenio");
        map.get("Comunicacao de Dados").add("Malu");
        map.get("Comunicacao de Dados").add("Biju");
        cienciaComputacao.add((HashMap) map);

        map = new HashMap<>();
        map.put("Estrutura de Dados", new ArrayList<String>());
        map.get("Estrutura de Dados").add("Ana");
        map.get("Estrutura de Dados").add("Biju");
        map.get("Estrutura de Dados").add("Guilherme");
        map.get("Estrutura de Dados").add("Pedro");
        map.get("Estrutura de Dados").add("Clenio");
        cienciaComputacao.add((HashMap) map);

        cienciaComputacao.sort(Comparator.comparingInt(HashMap::size));

        for (HashMap<String, ArrayList<String>> disciplina : cienciaComputacao) {
            for (Map.Entry<String, ArrayList<String>> entry : disciplina.entrySet()) {
                System.out.println("Disciplina: " + entry.getKey() + " | Alunos: " + entry.getValue().size());
            }
        }

        ArrayList<String> nomeAvaliados = new ArrayList<>();
        int contador = 0;
        String nomeTMP;

        for(HashMap<String, ArrayList<String>> disciplina : cienciaComputacao) {
            for(Map.Entry<String,ArrayList<String>> entry : disciplina.entrySet()){
                for (Object nome : entry.getValue()) {
                    nomeTMP = nome.toString();

                    if (!nomeAvaliados.contains(nomeTMP)) {
                        nomeAvaliados.add(nomeTMP);
                        contador = 0;

                        for (HashMap<String, ArrayList<String>> d : cienciaComputacao) {
                            for (Map.Entry<String, ArrayList<String>> entry2 : d.entrySet()) {
                                for (Object nome2 : entry2.getValue()) {
                                    if (nome2.equals(nomeTMP)) {
                                        contador++;
                                    }
                                }
                            }
                        }
                        System.out.println("Nome: " + nomeTMP + " aparece " + contador);
                    }
                }
            }
        }

    }
}