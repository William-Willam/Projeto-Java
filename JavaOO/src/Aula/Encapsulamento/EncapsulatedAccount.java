package Aula.Encapsulamento;

public class EncapsulatedAccount {
    // ## Entendendo o Encapsulamento
    //
    // O encapsulamento é um dos quatro pilares da Programação Orientada a Objetos (POO).
    // Ele é o conceito de agrupar dados (atributos) e os métodos que operam nesses
    // dados em uma única unidade, a classe. Além disso, ele protege os dados
    // de acesso externo e manipulação direta e não autorizada.
    //
    // Na prática, isso significa que:
    // 1. **Atributos (informações)** de um objeto devem ser privados (`private`).
    // 2. O acesso a esses atributos deve ser feito somente através de métodos públicos (`public`).
    //    Esses métodos são chamados de **getters** (para ler o valor) e **setters** (para modificar o valor).
    //
    // Este código demonstra uma classe que usa encapsulamento para controlar
    // o acesso e a modificação de seus dados, garantindo que o estado do objeto
    // seja sempre válido.

    // --- Atributos da Conta ---
    // Atributos são as características ou dados que um objeto da classe terá.
    // Eles representam o estado do objeto.
    // Neste exemplo, cada objeto "Conta" terá as seguintes informações:

    private String accountNumber;
    private String accountOwener;
    private double balance;

    // --- Construtores ---
    // Construtores são métodos especiais que inicializam um novo objeto.
    // Eles têm o mesmo nome da classe e não têm tipo de retorno.
    // A sobrecarga de construtores permite criar objetos de diferentes maneiras.

    // Construtor principal:
    // Inicializa a conta com saldo, titular e número de conta.
    public EncapsulatedAccount(double balance, String accountOwener, String accountNumber) {
        this.balance = balance;
        this.accountOwener = accountOwener;
        this.accountNumber = accountNumber;
    }

    // Construtor sobrecarregado:
    // Cria uma conta apenas com o número da conta, chamando o construtor principal
    // com valores padrão para os outros atributos (saldo 0 e titular nulo).
    public EncapsulatedAccount(String accountNumber) {
        this(0, null, accountNumber);
    }

    // Construtor sobrecarregado:
    // Cria uma conta com número e titular, com saldo inicial de 0.
    public EncapsulatedAccount(String accountNumber, String accountOwener) {
        this(0, accountOwener, accountNumber);
    }

    // Construtor sobrecarregado:
    // Cria uma conta com número e saldo, com o titular nulo.
    public EncapsulatedAccount(String accountNumber, double balance){
        this(balance, null, accountNumber);
    }

    // --- Métodos de Acesso (Getters e Setters) ---
    // Métodos `get` permitem ler o valor de um atributo privado.
    // Métodos `set` permitem modificar o valor de um atributo privado.

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwener() {
        return accountOwener;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOwener(String accountOwener) {
        this.accountOwener = accountOwener;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // --- Métodos (Comportamentos da Conta) ---
    // Métodos definem o comportamento da classe. Eles são as ações que um objeto
    // pode realizar.

    // Método para depositar um valor na conta.
    // Parâmetros: 'amount' (valor a ser depositado).
    // Retorno: `true` se o depósito for bem-sucedido, `false` caso contrário.
    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    // Sobrecarga do método `deposit`.
    // Permite depositar um valor passado como `String`.
    // Internamente, converte a `String` para `double` e chama o método `deposit` original.
    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    // Método para sacar um valor da conta.
    // Parâmetros: 'amount' (valor a ser sacado).
    // Retorno: `true` se o saque for bem-sucedido, `false` caso contrário.
    boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Método para transferir um valor para outra conta.
    // Parâmetros: 'amount' (valor a ser transferido) e 'targetAccount' (a conta de destino).
    // Comportamento: Primeiro, saca o valor desta conta e, em seguida, deposita na conta de destino.
    void transfer(double amount, EncapsulatedAccount targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    // Método para exibir o saldo atual da conta.
    // Ação: Imprime o saldo no console.
    void printBalance() {
        System.out.println("Balance: R$ " + balance);
    }
}