package Aula.Final;

// Classe final: não pode ser herdada por outra classe
public final class ExemploFinal {

    // Variável final: valor constante, não pode ser alterado depois de atribuído
    // Geralmente usada para definir constantes
    public static final double PI = 3.14159;

    // Método final: não pode ser sobrescrito por subclasses
    // Garante que o comportamento do método será preservado
    public final void mostrarConstante() {
        System.out.println("Valor de PI: " + PI);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe
        ExemploFinal exemplo = new ExemploFinal();

        // Chamando o método final
        exemplo.mostrarConstante();

        // Tentativa de alterar a constante (descomente para ver o erro)
        // PI = 3.14; // Erro! Não é permitido alterar uma variável final
    }
}

// Abaixo está um exemplo de tentativa de herança — que causaria erro
/*
class OutraClasse extends ExemploFinal {
    // Erro! Não é possível herdar de uma classe final
}
*/