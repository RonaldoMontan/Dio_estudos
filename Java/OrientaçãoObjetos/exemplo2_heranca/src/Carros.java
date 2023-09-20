public class Carros extends Veiculo {

    private int numeroPortas;

    public Carros(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros, boolean carroceria){
        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros, carroceria);
        this.numeroPortas = numeroPortas;
    }

    int setPorta(int numeroPortas){
        return this.numeroPortas = numeroPortas;
    }
}   
