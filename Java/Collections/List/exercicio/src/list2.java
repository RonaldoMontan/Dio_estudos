import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list2 {

    public static void main(String[] args){

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("momo", 8, "amarelo"));
            add(new Gato("novo", 3, "branco"));
            add(new Gato("petrukio", 3, "rajado"));

        }};

        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println("\nImprimindo em ordem aleatória: " + meusGatos );

        Collections.sort(meusGatos);
        System.out.println("\nImprimindo em ordem natural: " + meusGatos);

        // Collections.sort(meusGatos, new ComparatorIdade());
        // System.out.println(meusGatos);

        meusGatos.sort(new ComparatorIdade());
        System.out.println("\nImprimindo em ordem de idade: " + meusGatos);

        meusGatos.sort(new ComparatorCor());
        System.out.println("\nImprimindo na ordem da cor: " + meusGatos);

        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println("\nImprimindo na ordem da cor: " + meusGatos);

    }
    
}

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString(){
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    
    @Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());

    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2){

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor =g1.getCor().compareToIgnoreCase(g2.getCor());
        if(nome != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
