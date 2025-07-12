public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operadores lógicos
        // Prioridade: ! (negação) > && (E lógico) > || (OU lógico)

        // "&&" - E lógico (ambas as condições devem ser verdadeiras)
        boolean resultadoE = condicao1 && condicao2; // false
        System.out.println("condicao1 && condicao2: " + resultadoE);

        // "||" - OU lógico (pelo menos uma condição deve ser verdadeira)
        boolean resultadoOU = condicao1 || condicao2; // true
        System.out.println("condicao1 || condicao2: " + resultadoOU);

        // "!" - negação (inverte o valor lógico)
        boolean resultadoNegacao = !condicao1; // false
        System.out.println("!condicao1: " + resultadoNegacao);

        // Expressão combinada com parênteses
        // Prioridade: !condicao2 é avaliado primeiro, depois &&, depois ||
        boolean expressaoComposta = condicao1 || (condicao2 && !condicao2);
        System.out.println("Expressão composta condicao1 || (condicao2 && !condicao2): " + expressaoComposta); // true

        // Exemplo com valores numéricos e operadores relacionais + lógicos
        int a = 10;
        int b = 5;
        boolean exemplo = (a > b) && (a != b); // true && true = true
        System.out.println("Exemplo com números: (a > b) && (a != b): " + exemplo);
    }
}
