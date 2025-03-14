import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int tamanho = r.nextInt(10, 20); // Gera um tamanho aleatório entre 10 e 19

        int numero;
        for (int i = 0; i < tamanho; i++) {
            numero = r.nextInt(100); // Gera números aleatórios entre 0 e 99
            if (!list.contains(numero)) { // Adiciona o número se não estiver presente
                list.add(numero);
            }
        }

        System.out.println("Lista original:");
        for (Integer num : list) {
            System.out.printf("%d\t", num);
        }

        System.out.println();

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 != 0) {
                iterator.set(-1);
            }
        }

        System.out.println("Lista após substituir ímpares por -1:");
        for (Integer num : list) {
            System.out.printf("%d\t", num);
        }

        System.out.println();
    }
}
