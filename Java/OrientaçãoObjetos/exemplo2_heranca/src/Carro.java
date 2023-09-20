public class Carros extends Veiculo {

    private numeroPortas;

    public Carros(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros, boolean carroceria){
        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros, carroceria)
        this.numeroPortas = numeroPortas;
    }
}
