public class principal {
    
    public static void main(String[] args) {
        
        Moto minhaMoto = new Moto(null, "Biz ES", 65, 2, 1, false);


        System.out.println(minhaMoto.cor);

        String corDaMoto = minhaMoto.setCor("Vermelha");
        int portas = minhaMoto.setPorta(2);
        
        System.out.println(corDaMoto);
        System.out.println(portas);



    }
}
