public class Moto  extends Veiculo{
         
    private  String estiloCapacete;

    public Moto(String cor, String modelo, int potencia, int quantidadeRodas, int quantidadePassageiros){

        super(cor, modelo, potencia, quantidadeRodas, quantidadePassageiros);
    }


    String setCapacete(String estiloCapacete){
        return this.estiloCapacete = estiloCapacete;
    }

    String getCor(){
        return cor;
    }
    
}




//modelo: "Biz/ES", potencia:80, quantidadePassageiros: 1, quantidadeRodas: 2,