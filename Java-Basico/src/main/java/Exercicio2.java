public class Exercicio2 {
    public static void main(String[] args) {
        //================== Exercicio 4 ================

        // Cria um objeto Scanner para ler entradas do usuário via console
        var scanner = new java.util.Scanner(System.in);

        int n = 1;           // Contador de notas
        double sum = 0.0;    // Soma total das notas

        // Loop infinito para ler notas até que o usuário envie uma linha vazia
        while (true) {
            System.out.println("Digite a nota " + n + ":");

            String line = scanner.nextLine(); // Lê a entrada do usuário

            // Se a entrada for vazia, encerra o loop
            //line.isBlank()
            if (line.equals("")) {
                n--; // Decrementa n porque a última entrada não foi uma nota válida
                break;
            }

            // Converte a entrada para double e adiciona à soma
            sum += Double.parseDouble(line);

            n++; // Incrementa o contador de notas
            System.out.println(sum); // Exibe a soma parcial
        }

        // Calcula a média das notas
        double avg = sum / n;

        // Exibe a média final
        System.out.println("A média: " + avg);
    }
}