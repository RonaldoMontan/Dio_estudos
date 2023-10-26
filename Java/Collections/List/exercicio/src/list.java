import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class list {
    public static void main(String[] args) throws Exception {
        

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(2.5);
        notas.add(7.2);
        notas.add(6.0);
        notas.add(7.0);
        notas.add(5.0);

        System.out.println("Quantidade de notas na lista: " + notas.size());
        System.out.println("\nTodas as notas são: " + notas.toString());
        System.out.println("\nPosição da nota 5.0 -> " + notas.indexOf(5d));
        System.out.println("\nPosição da nota 7.0 -> " + notas.indexOf(7d));

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
        System.out.println();

        System.out.println("A nota 10.0 esta na lista ?: " + notas.contains(10.0));

        System.out.println("\nA menor nota é: " + Collections.min(notas));
        System.out.println("\nA maior nota é : " + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double total = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            // System.out.println(iterator.hasNext());
            // System.out.println(iterator.next());
            total += next;
        }
        System.out.println("\nA soma dos valores contidos na lista é: " + total);
        System.out.println("\nA media dos valores contidos na lista é: " + (total/notas.size()));

        System.out.println("\nRemovendo a nota da posição 1");
        notas.remove(1);
        System.out.println(notas.toString());

        System.out.println("\nRemovendo a nota 5.0");
        notas.remove(5d);
        System.out.println(notas.toString());
        
        System.out.println("\nRemovendo valores menores que 8");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next <8) iterator1.remove();
        }

        System.out.println("Lista atualizada: " + notas.toString());

        System.out.println("\nApagando a lista: ");
        notas.clear();
        System.out.println(notas);

    }
}
