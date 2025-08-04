public class App {
    public static void main(String[] args) {
        // criando a conta usando (new) e importando a classe Conta
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        // declaração dos atributos da classe Conta
        conta1.nomeUsuario = "William";
        conta1.cpf = "000.123.456-00";
        conta1.numeroConta = "123-456";
        conta1.tipoConta = "Conta Poupança";

        conta2.nomeUsuario = "Ireneu";
        conta2.cpf = "000.123.789-00";
        conta2.numeroConta = "555-456";
        conta2.tipoConta = "Conta Corrente";

        // mostrar no terminal
        System.out.println();
        System.out.println("Nome do usuário: " + conta1.nomeUsuario);
        System.out.println("CPF: " + conta1.cpf);
        System.out.println("Numero da Conta: " + conta1.numeroConta);
        System.out.println("Tipo de Conta: " + conta1.tipoConta);
        System.out.println();

        System.out.println("--------------------------------------");

        System.out.println();
        System.out.println("Nome do usuário: " + conta2.nomeUsuario);
        System.out.println("CPF: " + conta2.cpf);
        System.out.println("Numero da Conta: " + conta2.numeroConta);
        System.out.println("Tipo de Conta: " + conta2.tipoConta);
        System.out.println();
    }
}
