import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list2 {

    public static void main(String[] args){

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("momo", 8, "amarelo"));
            add(new Gato("novo", 3, "branco"));

        }};

        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println("\nImprimindo em ordem aleatória: " + meusGatos );

        Collections.sort(meusGatos);
        System.out.println("\nImprimindo em ordem natural: " + meusGatos);

        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);




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
