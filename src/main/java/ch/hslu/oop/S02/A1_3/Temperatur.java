package ch.hslu.oop.S02.A1_3;

public class Temperatur {

    private static final String GASFOERMIG = "gasförmig";
    private static final String FEST = "fest";
    private static final String FLUESSIG = "flüssig";

    private double celsius;

    public Temperatur(double celsius) {
        this.celsius = celsius;
    }

    public Temperatur() {
        celsius = 20;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double calculateKelvin() {
        return celsius + 273.15;
    }

    public double calculateFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public void addCelsius(double celsius) {
        this.celsius += celsius;
    }

    public String aggregatsZustand(String elementenbezeichnung) {

        final var element = Element.fromValue(elementenbezeichnung);
        if (element.isGasfoermig(celsius)) {
            return GASFOERMIG;
        } else if (element.isFest(celsius)) {
            return FEST;
        } else {
            return FLUESSIG;
        }

    }
}
