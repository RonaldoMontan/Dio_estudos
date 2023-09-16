class Carro{

    String cor;
    String modelo;
    int capacidadeTanque;

    // Carro(){
    //     construtor simples
    // }

    //Construtor expecifico
    Carro(String modelo, int capacidadeTanque){
        this.cor = "Fundo padrão";
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    String setCor(String cor){
        return this.cor = cor;
    }
    
    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    
    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //Metodo calcular
    double calcularTanqueCheio(double real){
        return capacidadeTanque*real;
    }

    
}