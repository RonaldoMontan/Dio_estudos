public class Operacoes {
    
    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;
        System.out.printf("Total soma: %.2f %n", resultado);
    }

    public static void subtrair(double numero1, double numero2){

        double resultado = numero1 - numero2;
        System.out.printf("Total subtração: %.2f %n", resultado);
    }

    public static void multiplicar(double numero1, double numero2){

        double resultado = numero1 * numero2;
        System.out.printf("Total multiplicação: %.2f %n", resultado);
    }

    public static void dividir(double numero1, double numero2){

        double resultado = numero1 / numero2;
        System.out.printf("Total divisão: %.2f %n", resultado);
    }
}
