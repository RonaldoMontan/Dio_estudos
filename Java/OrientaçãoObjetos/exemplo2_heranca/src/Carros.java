public class Carros extends Veiculo {

    private int numeroPortas;
    private boolean turbo;
    private String categoria;

    public Carros(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros){
        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros);
    }

    int setPorta(int numeroPortas){
        return this.numeroPortas = numeroPortas;
    }

    boolean setTurbo(boolean turbo){
        return this.turbo = turbo;
    }

    String setCategoria(String categoria){
        return this.categoria = categoria;
    }

    String getCor(){
        return cor;
    }

    int getPorta(){
        return numeroPortas;
    }

    boolean getTurbo(){
        return turbo;
    }

    String getCategoria(){
        return categoria;
    }
}   
