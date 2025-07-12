public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operadores relacionais
        // Prioridade: todos têm a mesma precedência e são avaliados da esquerda para a direita

        // "==" - igual
        boolean igual = a == b; // false
        System.out.println("a == b: " + igual);

        // "!=" - diferente
        boolean diferente = a != b; // true
        System.out.println("a != b: " + diferente);

        // ">" - maior que
        boolean maior = a > b; // true
        System.out.println("a > b: " + maior);

        // "<" - menor que
        boolean menor = a < b; // false
        System.out.println("a < b: " + menor);

        // ">=" - maior ou igual
        boolean maiorOuIgual = a >= b; // true
        System.out.println("a >= b: " + maiorOuIgual);

        // "<=" - menor ou igual
        boolean menorOuIgual = a <= b; // false
        System.out.println("a <= b: " + menorOuIgual);

        // Exemplo com parênteses para clareza em expressões compostas
        boolean expressaoComposta = (a > b) && (a != b); // true && true = true
        System.out.println("Expressão composta (a > b && a != b): " + expressaoComposta);
    }
}

