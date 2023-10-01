public class RodarAplicacao {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();

        // Upcast - subtipos de funcionario (cllasse mae)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast - (classe filho) - não recomendado
        Vendedor vendedor_ = (Vendedor) new Funcionario();
        





    }
}
