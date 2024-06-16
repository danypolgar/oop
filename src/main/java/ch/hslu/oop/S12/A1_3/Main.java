package ch.hslu.oop.S12.A1_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        var personen = new ArrayList<>(List.of(new Person(2, "nb", "vb"), new Person(1, "na", "va"), new Person(3, "nc", "vc")));
        System.out.println(personen);
        personen.sort(Comparator.comparingLong(Person::getId));
        System.out.println(personen);
    }
}
