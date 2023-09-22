public class principal {
    
    public static void main(String[] args) {
        
        chamaCarro();
        // chamaMoto();
        chamaCaminhao();

    }

    public static void chamaCarro(){

        Carros meusCarros = new Carros(null, "Gol GTS", 105, 4, 5, false);

        System.out.println(meusCarros.cor);

        meusCarros.setCor("Azul");
        int portas = meusCarros.setPorta(2);

        System.out.println(meusCarros.getCor());
        System.out.println(portas);

    }

    public static void chamaMoto(){

        Moto minhaMoto = new Moto(null, "Biz ES", 65, 2, 1, false);

        System.out.println(minhaMoto.cor);

        minhaMoto.setCor("Vermelha");
        int portas = minhaMoto.setPorta(2);
        
        System.out.println(minhaMoto.getCor());
        System.out.println(portas);
    }

    public static void chamaCaminhao(){
        
        Caminhao meuCaminhao = new Caminhao(null, null, 0, 0, 0, false);

        System.out.println(meuCaminhao.cor);

        meuCaminhao.setCor("Verde-Claro");
        meuCaminhao.setPorta(2);
        meuCaminhao.setPotencia(250);
        meuCaminhao.setCarroceria(true);
        meuCaminhao.setCorCarroceria("Verde-militar");
        meuCaminhao.setEixo(4);
        meuCaminhao.setRodas(6);

        System.out.println(meuCaminhao.getCor());
        // System.out.println(meuCaminhao.numeroPortas);
        System.out.println(meuCaminhao.potencia);
        System.out.println("O caminhão tem carroceria ?" + meuCaminhao.carroceria);
        System.out.println(meuCaminhao.quantidadeRodas);
        System.out.println();


    }
}
