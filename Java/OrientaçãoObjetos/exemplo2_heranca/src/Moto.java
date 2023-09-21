public class Moto  extends Veiculo{
         
    private int numeroPortas;


    public Moto(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros, boolean carroceria){

        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros, carroceria);
    }

    int setPorta(int numeroPortas){
        return this.numeroPortas = numeroPortas;
    }
    
}




//modelo: "Biz/ES", potencia:80, quantidadePassageiros: 1, quantidadeRodas: 2,