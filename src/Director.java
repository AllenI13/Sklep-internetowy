public class Director extends  Employee {
    private int bonus;
    public Director(int salary, String name, String surname, int id) {
        super(salary, name, surname, id);
    }
    public int totalPayment(){
        return getSalary()+bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
