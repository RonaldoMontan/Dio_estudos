public class Caminhao extends Veiculo{
    
    private int numeroPortas;
    private String tipoCarroceria;
    private int quantidadeEixo;
    private String corCarroceria;

    private String cor;

    public Caminhao(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros, boolean carroceria){
        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros, carroceria);
        this.cor = cor;
    }

    int setPorta(int numeroPortas){
        return this.numeroPortas = numeroPortas;
    }

    String setCarroceria(String tipoCarroceria){
        return this.tipoCarroceria = tipoCarroceria;
    }

    int setEixo(int quantidadeEixo){
        return this.quantidadeEixo = quantidadeEixo;
    }

    String setCorCarroceria(String corCarroceria){
        return this.corCarroceria = corCarroceria;
    }

    // String getCor(){
    //     return cor;
    // }
    
}
