public class principal {
    
    public static void main(String[] args) {
        
        // chamaCarro();
        // chamaMoto();
        chamaCaminhao();

    }

    public static void chamaCarro(){

        Carros meusCarros = new Carros(null, "Gol GTS", 105, 4, 5);

        System.out.println(meusCarros.cor);

        meusCarros.setCor("Azul");
        int portas = meusCarros.setPorta(2);

        System.out.println(meusCarros.getCor());
        System.out.println(portas);

    }

    public static void chamaMoto(){

        Moto minhaMoto = new Moto(null, "Biz ES", 65, 2, 1);

        System.out.println(minhaMoto.cor);

        minhaMoto.setCor("Vermelha");
        int portas = minhaMoto.setPorta(2);
        
        System.out.println(minhaMoto.getCor());
        System.out.println(portas);
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
