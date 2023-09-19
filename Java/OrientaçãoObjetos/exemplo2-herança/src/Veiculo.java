public class Veiculo {
    
    String cor;
    String modelo;
    String potencia;
    int quantidadeRodas;
    int quantidadePassageiros;
    boolean carroceria;
    

    Veiculo(String cor,                 String modelo,
            String potencia,            int quantidadeRodas,
            int quantidadePassageiros,  boolean carroceria){

            this.cor = "Fundo padrão";
            this.potencia = potencia;
            this.quantidadePassageiros = quantidadePassageiros;
            this.modelo = modelo;
            this.quantidadeRodas = quantidadeRodas;
            this.carroceria = false;
        }

    String setCor(String cor){
        return this.cor = cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    void setPotencia(String potencia){
        this.potencia = potencia;
    }

    void setPassageiros(int quantidadePassageiros){
        this.quantidadePassageiros = quantidadePassageiros;
    }

    void setRodas(int quantidadeRodas){
        this.quantidadeRodas = quantidadeRodas;
    }

    boolean setCarroceria(boolean carroceria){
        return this.carroceria = carroceria;
    }
}
