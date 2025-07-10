public class TipoChar {
    public static void main(String[] args) {
        // O tipo char armazena um único caractere Unicode.
        // Ele é declarado usando aspas simples: 'a', 'B', '1', '#', etc.
        char c1 = 'a'; // armazena o caractere 'a'
        System.out.println(c1); // imprime o caractere diretamente

        // Quando atribuímos um char a uma variável int, o Java faz um casting implícito.
        // O caractere é convertido para seu valor numérico de código na tabela Unicode (ASCII no caso de 'a').
        int i1 = c1; // 'a' tem valor 97 na tabela Unicode
        System.out.println(i1); // imprime 97

        // Podemos fazer operações aritméticas com char, porque internamente ele é tratado como um número.
        // Aqui, 'a' (97) + 2 = 99, que é o caractere 'c'
        char c2 = 'a' + 2; // resultado será 'c'
        System.out.println(c2); // imprime 'c'
    }
}