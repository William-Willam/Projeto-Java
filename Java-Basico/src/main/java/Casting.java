public class Casting {
    public static void main(String[] args) {
        // Casting Implícito (conversão automática pelo Java)
        // byte -> short -> int -> long -> float -> double
        // Acontece quando convertimos de um tipo menor para um tipo maior — sem perda de dados.
        // Exemplo: int -> double
        int i = 200;
        double d = i;        // O valor de 'i' é convertido automaticamente para double
        double d2 = 200;     // Literal inteiro também pode ser atribuído diretamente
        long l = 500;        // int para long também é implícito

        System.out.println("Casting Implícito:");
        System.out.println("int: " + i);
        System.out.println("double (a partir de int): " + d);
        System.out.println("double (literal int): " + d2);
        System.out.println("long: " + l);

        // Casting Explícito (conversão manual)
        // Necessário quando passamos de tipo maior para menor — pode haver perda de dados!
        // Exemplo: double -> int
        double valorDouble = 123.456;
        int valorInt = (int) valorDouble;  // Precisamos usar (tipo) antes da variável

        long valorLong = 1_000_000L;
        short valorShort = (short) valorLong;  // Pode truncar o valor se exceder a faixa

        System.out.println("\nCasting Explícito:");
        System.out.println("double original: " + valorDouble);
        System.out.println("int convertido: " + valorInt);
        System.out.println("long original: " + valorLong);
        System.out.println("short convertido: " + valorShort);
    }
}