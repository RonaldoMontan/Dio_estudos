import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String operacao = "";
        double numero1, numero2 = 0;

        //Recebe a entrada dos valores
        System.out.print("1 valor: ");
        numero1 = scan.nextDouble();
        System.out.print("2 valor: ");
        numero2 = scan.nextDouble();

        //Comunica operações disponiveis
        System.out.println("[ + ] Somar");
        System.out.println("[ - ] Subtrair");
        System.out.println("[ x ] multiplicar");
        System.out.println("[ / ] Dividir");
        // System.out.print("");
        operacao = scan.next();


        switch (operacao) {
            case "+":
                Operacoes.soma(numero1, numero2);
                break;
            
            case "-":
                Operacoes.subtrair(numero1, numero2);
                break;

            case "x":
                Operacoes.multiplicar(numero1, numero2);
                break;

            case "/":
                Operacoes.dividir(numero1, numero2);
                break;

            default:
                System.out.println("Operação invalida !");
                break;
        }
        
    }

}

