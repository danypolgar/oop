package ch.hslu.oop.S07.A1_3;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private long id;
    private String nachname;
    private String vorname;

    public Person(long id, String nachname, String vorname) {
        this.id = id;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public long getId() {
        return id;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(nachname, person.nachname) && Objects.equals(vorname, person.vorname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nachname, vorname);
    }

    @Override
    public int compareTo(Person o) {
        return Long.compare(this.id, o.id);
    }
}
