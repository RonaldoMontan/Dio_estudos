public class Usacarro{
    
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Ferrari", 50);

        
        String corDoCarro = meuCarro.getCor();
        System.out.println("cor inicial " + corDoCarro);

        String corDoCarroAlterada = meuCarro.setCor("Azul");
        System.out.println("A cor do carro é " + corDoCarroAlterada);

        String corDoCarroNew = meuCarro.getCor();
        System.out.println("cor agora " + corDoCarroNew);
    }
}