package Models;

public class Student extends Person {
    public double gpa;

    public Student(){
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return getPosition() + super.toString();
    }

    @Override

    public double getPaymentAmount(){
        return gpa > 2.67 ? 36660.00 : 0.00;
    }

    @Override

    public int compareTo(Person other) {
        if (other instanceof Student) {
            return Double.compare(this.getPaymentAmount(), ((Student) other).getPaymentAmount());
        }
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
