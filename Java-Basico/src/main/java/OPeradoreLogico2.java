public class OPeradoreLogico2 {
    public class DeMorgan {
        public static void main(String[] args) {
            boolean A = true;
            boolean B = false;

            // Original
            boolean resultado1 = !(A && B); // true
            boolean resultado2 = !A || !B;  // true

            System.out.println("!(A && B): " + resultado1);
            System.out.println("!A || !B: " + resultado2); // equivalente

            // Outro exemplo
            boolean resultado3 = !(A || B); // false
            boolean resultado4 = !A && !B;  // false

            System.out.println("!(A || B): " + resultado3);
            System.out.println("!A && !B: " + resultado4); // equivalente
        }
    }

}
