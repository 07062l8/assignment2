package Models;

public class Employee extends Person{
    public String position;
    public double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override

    public double getPaymentAmount(){
        return salary;
    }

    @Override

    public int compareTo(Person other) {
        if(other instanceof Employee){
            return Double.compare(this.salary, ((Employee)other).salary);
        }
        return Double.compare(this.salary, other.getPaymentAmount());
    }
}
