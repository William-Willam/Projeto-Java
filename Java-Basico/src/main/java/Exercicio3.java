public class Exercicio3 {
    public static void main(String[] args) {
        var entrada = new java.util.Scanner(System.in);

        System.out.print("Digite um numero para gerar a tabuada: ");
        int n = Integer.parseInt(entrada.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
