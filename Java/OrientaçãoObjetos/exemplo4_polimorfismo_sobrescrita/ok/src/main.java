public class main {
    public static void main(String[] args) {
        
        ClassMae[] classes = new ClassMae[]{
            new ClasseFilha1(),
            new ClasseFilha2(),
            new ClassMae()
        };

        // sobrescrito com polimorfismo
        for (ClassMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        // sobrescrito com polimorfismo
        for (ClassMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        // sbrescrito  pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
