import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===================== Exercicio 1 ========================
        System.out.println("Exercicio 1 = Calcular a média!");

        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(input.nextLine());

        System.out.print("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(input.nextLine());

        System.out.print("Digite a terceira nota: ");
        double nota3 = Double.parseDouble(input.nextLine());

        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;

        // Saída formatada
        System.out.printf("Resultado da média: %.2f%n", media);

        // ===================== Exercicio 2 ========================
        System.out.println("\nExercicio 2 = Converter Temperatura!");

        // Entrada da temperatura
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempF = Double.parseDouble(input.nextLine());

        // Conversão para Celsius
        double tempC = (tempF - 32) * 5 / 9;

        // Saída formatada
        System.out.printf("Temperatura em Celsius: %.2f°C%n", tempC);

        input.close();
    }
}
