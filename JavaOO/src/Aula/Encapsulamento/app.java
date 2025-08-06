package Aula.Encapsulamento;

public class app {
    public static void main(String[] args) {
        final var account = new EncapsulatedAccount(1000, "William", "235698-55");
        final var account1 = new EncapsulatedAccount(2500, "Ireneu", "2525-333");

        account1.printBalance();
    }

}
