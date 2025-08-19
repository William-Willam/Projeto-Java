package Aula.Static;

public class MetodoStatic {

    // Variável estática: pertence à classe, não a uma instância específica
    // Todas as instâncias compartilham o mesmo valor de 'contador'
    static int contador = 0;

    // Construtor: chamado toda vez que um novo objeto é criado
    public MetodoStatic() {
        // Incrementa o contador toda vez que um objeto é instanciado
        contador++;
    }

    // Método estático: pode ser chamado sem criar um objeto da classe
    // Ele acessa a variável estática 'contador'
    public static void mostrarContador() {
        System.out.println("Total de objetos criados: " + contador);
    }

    // Método main: ponto de entrada da aplicação
    // Também é estático, pois a JVM precisa chamá-lo sem instanciar a classe
    public static void main(String[] args) {
        // Criando dois objetos da classe Aula.Static.MetodoStatic
        new MetodoStatic();
        new MetodoStatic();

        // Chamando o método estático diretamente pela classe
        // Isso mostra quantos objetos foram criados
        MetodoStatic.mostrarContador(); // Saída: Total de objetos criados: 2
    }
}