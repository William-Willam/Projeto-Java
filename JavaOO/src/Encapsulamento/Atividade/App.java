package Encapsulamento.Atividade;

public class App {
    public static void main(String[] args) {
        Lamp l1 = new Lamp(true);
        l1.showState();
        l1.turnOff();
        l1.showState();

        Lamp l2 = new Lamp(false);
        l1.showState();
        l1.turnOn();
        l1.showState();
    }
}
