package ch.hslu.oop.S03.A1_3;

import java.util.NoSuchElementException;

public enum Element {
    STICKSTOFF("N", -210, -196),
    QUECKSILBER("Hg",   -38.83, 356.73),
    BLEI("Pb", 327.46, 1749),
    Wasserstoff("H", -259.16, -252.87);

    private final String symbol;
    private final double schmelzpunkt;
    private final double siedepunkt;

    Element(String symbol, double schmelzpunkt, double siedepunkt) {
        this.symbol = symbol;
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    public static Element fromValue(String symbol) {
        for (Element element : Element.values()) {
            if (element.symbol.equals(symbol)) {
                return element;
            }
        }
        throw new NoSuchElementException();
    }

    String getSymbol() {
        return symbol;
    }

    public boolean isGasfoermig(double celsius) {
        return celsius >= siedepunkt;
    }

    public boolean isFest(double celsius) {
        return celsius <= schmelzpunkt;
    }
}
