public class Carros extends Veiculo {

    private int numeroPortas;

    public Carros(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros){
        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros);
    }

    int setPorta(int numeroPortas){
        return this.numeroPortas = numeroPortas;
    }

    String getCor(){
        return cor;
    }
}   
