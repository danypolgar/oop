package ch.hslu.oop.S12.A1_3;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.compareTo(o2);
    }
}
