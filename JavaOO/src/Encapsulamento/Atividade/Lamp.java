package Encapsulamento.Atividade;

public class Lamp {
    private boolean on;

    //construtor
    public Lamp(boolean on) {
        this.on = on;
    }

    // GET e SET
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // metodos
    public void turnOn(){
        on = true;
    }

    public  void turnOff(){
        on = false;
    }

    public void showState(){
        if (on = true){
            System.out.println("Lampada ligada");
        }else {
            System.out.println("Lampada desligada");
        }

        // pode usar o ternario System.out.println("lampada" + (on ? "ligada" : "desligada"));
    }
}
