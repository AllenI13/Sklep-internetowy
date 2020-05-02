public class Employee extends Person {
    private int salary;

    public Employee(int salary, String name, String surname, int id){
        super(name, surname, id);
        this.salary = salary;
    }

    @Override
    public String printInfo() {
        return super.printInfo();
    }

    public int getSalary() {
        return salary;
    }
}
