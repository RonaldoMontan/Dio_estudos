import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) throws Exception {
        

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(2.5);
        notas.add(7.2);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(5.0);

        System.out.println(notas.size());
        System.out.println(notas.toString());
        System.out.println("Posição da nota 5.0 -> " + notas.indexOf(5d));
        System.out.println("Posição da nota 7.0 -> " + notas.indexOf(7d));

        for (Double value : notas) {
            System.out.println(value);
        }

        System.out.println("Adicionando o valor 10.0 na posição 4\n");
        notas.add(4, 10.0);

        for (int i = 0; i < notas.size(); i++) {
            System.out.printf("posição %d valor da nota %.2f \n", i, notas.get(i));   
        }

        System.out.println("\nSubistituindo a nota 6.0 para 8.0");

        notas.set(notas.indexOf(6d), 8.0);

        System.out.println(notas.toString());

        System.out.println("A nota 10.0 esta na lista ?: " + notas.contains(10.0));
    }
}
