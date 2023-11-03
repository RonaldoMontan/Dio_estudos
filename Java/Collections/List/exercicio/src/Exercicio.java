import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        String resposta = "";
        String sentenca = "";
        List<String> respostas = new ArrayList<>();

        System.out.println("[ Exercício 1 Interrogatório.]");

        System.out.println("\n Telefonou para a vitima ?");
        resposta = ler.nextLine().toUpperCase();
        respostas.add(resposta);

        System.out.println("\n Esteve no local do crime ?");
        resposta = ler.nextLine().toUpperCase();
        respostas.add(resposta);
        
        System.out.println("\n Mora perto da vitima ?");
        resposta = ler.nextLine().toUpperCase();
        respostas.add(resposta);

        System.out.println("\n Devia para a vítima ?");
        resposta = ler.nextLine().toUpperCase();
        respostas.add(resposta);

        System.out.println("\n Já trabalhou com a vítima ?");
        resposta = ler.nextLine().toUpperCase();
        respostas.add(resposta);


        int qtdeSim = Collections.frequency(respostas, "SIM");

        if (qtdeSim == 2){
            sentenca = "Suspeito(a)";

        } else if (qtdeSim >=3 || qtdeSim <=4){
            sentenca = "Cúmplice";
        } else if (qtdeSim == 5) {
            sentenca = "Culpado"; 
        } else {
            sentenca = "Inocente";
        }

        System.out.println("\nDecisão final julgamento: [ " + sentenca + " ]");
        


    }   
}
