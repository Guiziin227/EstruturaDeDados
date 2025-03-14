import java.util.*;

public class Glicemia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> glicemia = new ArrayList<>();
        Random rand = new Random();


        double media = 0.0;
        double medianaGlicemia = 0.0;
        int moda = 0;
        int numRepeticoes = 0;


        System.out.print("Quantos valores de glicemia deseja gerar? ");
        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {
            glicemia.add(rand.nextInt(50,240));
        }

        glicemia.sort(null);


        Iterator<Integer> it = glicemia.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Calcular a mediana
        int size = glicemia.size();
        if (size % 2 == 0) {
            medianaGlicemia = (glicemia.get(size / 2 - 1) + glicemia.get(size / 2)) / 2.0;
        } else {
            medianaGlicemia = glicemia.get(size / 2);
        }

        System.out.printf("A mediana é: %.2f\n", medianaGlicemia);

        // Calcular a média
        for (int valor : glicemia) {
            media += valor;
        }
        media = media / glicemia.size();

        System.out.printf("A média é: %.2f\n", media);

        // Calcular a moda
        for (int i = 0; i < glicemia.size(); i++) {
            int elemento = glicemia.get(i);
            int frequencia = 0;

            for (int j = 0; j < glicemia.size(); j++) {
                if (glicemia.get(j) == elemento) {
                    frequencia++;
                }
            }

            if (frequencia > numRepeticoes) {
                numRepeticoes = frequencia;
                moda = elemento;
            } else if (frequencia > numRepeticoes && elemento != moda) {
                System.out.print("As modas são: ");
                System.out.println(moda + ", " + elemento);
                return;
            }
        }

        if (numRepeticoes == 1) {
            System.out.println("Não existe moda (todos os valores são únicos).");
        } else {
            System.out.printf("A moda é: %d\n", moda);
        }
    }
}
