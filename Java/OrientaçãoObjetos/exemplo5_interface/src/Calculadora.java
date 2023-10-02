class Calculadora implements OperacaoMatematica{

    /*
     * Define um contrato que deve ser seguido pela classe que a implementa.
     * Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos 
     * que a interface diponibiliza.
     */
    @Override
    public void soma(double valor1, double valor2){
        System.out.println("Soma: " + valor1 + valor2);
    }

    @Override
    public void subtracao(double valor1, double valor2){
        System.out.println("Subtração: " + (valor1 - valor2));

    }

    @Override
    public void multiplicacao(double valor1, double valor2){
        System.out.println("Multiplicação: " + (valor1 * valor2));

    }

    @Override
    public void divisao(double valor1, double valor2){
        System.out.println("Divisão: " + (valor1 / valor2));

    }
}