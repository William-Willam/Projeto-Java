public class RepresentacaoNumerica {
    public static void main(String[] args) {

        long a = 20_000_000_000l;
        long b = 20_000_000_000L;

        int c = 0b1010_1111_0101;
        int d = 0x12AF_2020;
        int e = 0444;

        System.out.println("Binário: "+ c);
        System.out.println("Hexadecimal: "+ d);
        System.out.println("Octal: "+ e);
    }
}
