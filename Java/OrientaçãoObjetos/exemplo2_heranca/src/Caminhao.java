public class Caminhao extends Veiculo{
    
    private int numeroPortas;
    private String tipoCarroceria;
    private int quantidadeEixo;
    private String corCarroceria;


    public Caminhao(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros){
        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros);
        
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

    String getCor(){
        return cor;
    }

    int getNumeroPortas(){
        return numeroPortas;
    }
    
    String getTipoCarroceria(){
        return tipoCarroceria;
    }
    
    int getQtdEixo(){
        return quantidadeEixo;
    }

    String getCorCarroceria(){
        return corCarroceria;
    }
}
