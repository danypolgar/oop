package ch.hslu.oop.S10.A1_3;

public class Main {

    public static void main(String[] args){
        final var auto = new Auto(new Motor(), new Licht());

        auto.getMotor().switchOn();
        auto.getMotor().switchOff();
        auto.getLicht().switchOn();
        auto.getLicht().switchOff();
    }
}
