public class Fraction {
    // atributos
    int numerador;
    int denominador;

    void set(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // metodos
    Fraction multiplcar(Fraction f) {
        Fraction resultado = new Fraction();
        resultado.numerador = numerador * f.numerador;
        resultado.denominador = denominador * f.denominador;
        return resultado;
    }

    void mostraResultado() {
        System.out.println(numerador + " / " + denominador);
    }
}