package ch.hslu.oop.S02.A1_3;

import java.util.NoSuchElementException;

public enum Element {
    STICKSTOFF("N", -210, -196),
    QUECKSILBER("Hg",   -38.83, 356.73),
    BLEI("Pb", 327.46, 1749);

    private final String symbol;
    private final double schmelzpunkt;
    private final double siedepunkt;

    Element(String symbol, double schmelzpunkt, double siedepunkt) {
        this.symbol = symbol;
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    static Element fromValue(String symbol) {
        for (var element : Element.values()) {
            if (element.symbol.equals(symbol)) {
                return element;
            }
        }
        throw new NoSuchElementException();
    }

    String getSymbol() {
        return symbol;
    }

    boolean isGasfoermig(double celsius) {
        return celsius >= siedepunkt;
    }

    boolean isFest(double celsius) {
        return celsius <= schmelzpunkt;
    }
}
