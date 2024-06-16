package ch.hslu.oop.S05.A1_3;

import static ch.hslu.oop.S08.A1_3.Aggregatszustand.GAS;
import static ch.hslu.oop.S08.A1_3.Aggregatszustand.SOLID;
import static ch.hslu.oop.S08.A1_3.Aggregatszustand.LIQUID;


public abstract class Element extends AbstractNamed {

    private final String symbol;
    private final double schmelzpunkt;
    private final double siedepunkt;

    protected Element(String symbol, double schmelzpunkt, double siedepunkt) {
        super();
        this.symbol = symbol;
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    public String getAggregatsZustand(double celsius) {
        if (isGasfoermig(celsius)) {
            return GAS.getLabel();
        } else if (isFest(celsius)) {
            return SOLID.getLabel();
        } else {
            return LIQUID.getLabel();
        }
    }

    private boolean isFest(double celsius) {
        return celsius <= schmelzpunkt;
    }

    private boolean isGasfoermig(double celsius) {
        return celsius >= siedepunkt;
    }

    @Override
    public String toString() {
        return "Element{" + "name=" + super.getName() + ", symbol=" + symbol + ", schmelzpunkt=" + schmelzpunkt + ", siedepunkt=" + siedepunkt + '}';
    }
}
