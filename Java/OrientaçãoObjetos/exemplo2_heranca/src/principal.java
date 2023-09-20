public class principal {
    
    public static void main(String[] args) {
        
        chamaCarro();
        chamaMoto();

    }

    public static void chamaCarro(){

        Carros meusCarros = new Carros(null, "Gol GTS", 105, 4, 5, false);

        System.out.println(meusCarros.cor);

        String corCarro = meusCarros.setCor("Azul");
        int portas = meusCarros.setPorta(2);

        System.out.println(corCarro);
        System.out.println(portas);

    }

    public static void chamaMoto(){

        Moto minhaMoto = new Moto(null, "Biz ES", 65, 2, 1, false);

        System.out.println(minhaMoto.cor);

        String corDaMoto = minhaMoto.setCor("Vermelha");
        int portas = minhaMoto.setPorta(2);
        
        System.out.println(corDaMoto);
        System.out.println(portas);
    }
}
