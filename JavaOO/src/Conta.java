public class Conta {
    // Uma classe é como uma "planta" ou "molde" para criar objetos.
    // Ela define quais informações (atributos) e comportamentos (métodos)
    // um objeto desse tipo terá.

    // A classe "Conta" serve como um modelo para criar contas bancárias.
    // Cada conta criada a partir dela será um objeto.

    // --- Atributos ---
    // Atributos são as características ou dados que um objeto da classe terá.
    // Eles representam o estado do objeto.

    // Por exemplo, todo objeto "Conta" terá as seguintes informações:

    String nomeUsuario; // Nome do titular da conta
    String cpf;         // CPF do titular da conta
    String numeroConta; // Número único da conta bancária
    String tipoConta;   // Tipo da conta (ex: "Corrente", "Poupança")
    double balance;

    // metodos = define o comportamento da classe
    void printBalance() {
        System.out.println("Balance: " + balance);
    }

    // sobrecarga de metodos
    boolean deposito(String numeroConta) {
        return deposito(Double.parseDouble(numeroConta));
    }

    // metodos podem ter parametros
    boolean deposito(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposito realizado com sucesso!" + amount);
            return true;
        } else {
            System.out.println("deposito não realizado!" + amount);
        }
        return false;
    }

    // metodos com parametros e retorno
    boolean saque(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Saque realizado com sucesso!" + amount);
            return true;
        } else {
            System.out.println("Saque não realizado!" + amount);
        }
        return false;
    }

    // metodo com mais de um parametros
    void transferir(double amount, Conta contaDestino) {
        saque(amount); // um metodo pode passar outro metodo
        contaDestino.deposito(amount);
    }
}