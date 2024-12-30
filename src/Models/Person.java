package Models;

public class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private int id;
    public String name;
    public String surname;

    private void generateID() {
        id = id_gen++;
    }

    public Person(){
        generateID();
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition(){
        return "";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname;
    }

    @Override

    public double getPaymentAmount(){
        return 0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
