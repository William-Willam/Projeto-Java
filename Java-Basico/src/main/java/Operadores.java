public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Prioridade: Soma (+) e Subtração (-) têm menor prioridade
        int soma = a + b; // prioridade 2
        System.out.println("Soma: " + soma); // 13

        int subtracao = a - b; // prioridade 2
        System.out.println("Subtração: " + subtracao); // 7

        // Prioridade: Multiplicação (*) tem maior prioridade
        int multiplicacao = a * b; // prioridade 1
        System.out.println("Multiplicação: " + multiplicacao); // 30

        // Prioridade: Divisão (/) tem maior prioridade
        int divisao = a / b; // prioridade 1
        System.out.println("Divisão: " + divisao); // 3

        // Prioridade: Módulo (%) tem maior prioridade
        int modulo = a % b; // prioridade 1
        System.out.println("Módulo: " + modulo); // 1

        // Expressão combinada sem parênteses
        // Prioridade: b * 2 é avaliado primeiro (prioridade 1), depois soma com a (prioridade 2)
        int resultado = a + b * 2; // equivalente a: a + (b * 2)
        System.out.println("Resultado da expressão a + b * 2: " + resultado); // 10 + 6 = 16

        // Expressão com parênteses altera a ordem de avaliação
        // Prioridade: (a + b) é avaliado primeiro por causa dos parênteses
        int resultadoComParenteses = (a + b) * 2;
        System.out.println("Resultado com parênteses: " + resultadoComParenteses); // (10 + 3) * 2 = 26
    }
}
