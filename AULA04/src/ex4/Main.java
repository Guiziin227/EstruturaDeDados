package ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String,String>> listaDeDicionario = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("Nome", "Pedro");
        map.put("Idade", "23");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Nome", "Guilherme");
        map2.put("Idade", "18");

        listaDeDicionario.add(map);
        listaDeDicionario.add(map2);

        for (Map<String, String> maps : listaDeDicionario) {
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }


    }
}
