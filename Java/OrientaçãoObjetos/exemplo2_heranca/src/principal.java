public class principal {
    
    public static void main(String[] args) {
        
        chamaCarro();
        chamaMoto();
        chamaMotoPasseio();
        chamaCaminhao();

    }

    public static void chamaCarro(){

        Carros meusCarro = new Carros(null, "Gol GTS", 105, 4, 5);

        //Iniciando valores privado (exclusivo da sua classe Carro)

        meusCarro.setCategoria("Coleção");
        meusCarro.setCor("Azul-Riviera");
        meusCarro.setPorta(2);
        meusCarro.setTurbo(false);
        
        System.out.println();
        System.out.println(">>>> Informações da Classe Carro <<<<\n");

        System.out.println("A cor do carro é: " + meusCarro.getCor());
        System.out.println("Seu modelo é: " + meusCarro.modelo);
        System.out.printf("Com uma potencia de %d Cavalos\n", meusCarro.potencia);
        System.out.println("Possui um total de rodas: " + meusCarro.quantidadeRodas);
        System.out.printf("Consegue transportar até %d pessoas\n", meusCarro.quantidadePassageiros);
        System.out.printf("mas só tem %d Portas\n", meusCarro.getPorta());
        System.out.print("Por ser um veículo de " + meusCarro.getCategoria() + " ele recebe " + meusCarro.getTurbo() + " para turbo\n");


    }

    public static void chamaMoto(){

        Moto minhaMoto = new Moto(null, "Biz ES", 65, 2, 2);

        //Instnciando valores privado (exclusivo da sua calsse Moto)

        minhaMoto.setCapacete("Fechado");
        minhaMoto.setCor("Vermelha");

        System.out.println();
        System.out.println(">>>> Informações da Classe Moto <<<<\n");
        System.out.println("A Cor da moto é: " + minhaMoto.getCor());
        System.out.println("O modelo é: " + minhaMoto.modelo);
        System.out.println("Sua potencia é: " + minhaMoto.potencia);
        System.out.printf("Com %d rodas\n", minhaMoto.quantidadeRodas);
        System.out.printf("Só consegue transportar %d Pessoa\n", minhaMoto.quantidadePassageiros);
        System.out.println("Com essa moto você usa o capacete: " + minhaMoto.getCapacete());


    }

    public static void chamaMotoPasseio(){

        Moto minhMotoPasseio = new Moto(null, "Harley Davidson / Freewheeler", 600, 3, 1);

        //Instnciando valores privado (exclusivo da sua calsse Moto)

        minhMotoPasseio.setCapacete("Aberto");
        minhMotoPasseio.setCor("Preta");

        System.out.println();
        System.out.println(">>>> Informações da Classe MotoPasseio <<<<\n");
        System.out.println("A Cor da moto é: " + minhMotoPasseio.getCor());
        System.out.println("O modelo é: " + minhMotoPasseio.modelo);
        System.out.println("Sua potencia é: " + minhMotoPasseio.potencia);
        System.out.printf("Com %d rodas\n", minhMotoPasseio.quantidadeRodas);
        System.out.printf("Só consegue transportar %d Pessoa\n", minhMotoPasseio.quantidadePassageiros);
        System.out.println("Com essa moto você usa o capacete: " + minhMotoPasseio.getCapacete());

    }
    
    public static void chamaCaminhao(){
        
        Caminhao meuCaminhao = new Caminhao(null, "Mercedes Benz / 1113", 150, 6, 3);


        // Instanciando valores privado (exclusivo da sua classe Caminhão)

        meuCaminhao.setCor("Verde-Calro");
        meuCaminhao.setPorta(2);
        meuCaminhao.setCarroceria("Aberta");
        meuCaminhao.setEixo(5);
        meuCaminhao.setCorCarroceria("Preto e Cinza");
        
        
        System.out.println();
        System.out.println(">>>> Informações da Classe Caminhão <<<<\n");
        System.out.println("Caminhão modelo: " + meuCaminhao.modelo);
        System.out.println("A cor da cabine passou a ser: " + meuCaminhao.cor);
        System.out.println("Sua correcia tem a cor: " + meuCaminhao.getCorCarroceria());
        System.out.println("A potencia do caminhão é: " + meuCaminhao.potencia);
        System.out.println("Quantidade de rodas no caminhão: " + meuCaminhao.quantidadeRodas);
        System.out.println("Quantidade de passageiros: " + meuCaminhao.quantidadePassageiros);
        System.out.println("Quanntidade de portas no caminhão: " + meuCaminhao.getNumeroPortas());
        System.out.println("O tipo de carroceria: " + meuCaminhao.getTipoCarroceria());
        System.out.println("Possui um total de eixos: " + meuCaminhao.getQtdEixo());
        System.out.println("\n");
    }
}
