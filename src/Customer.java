public class Customer extends Person {
    private int expenses;

    public Customer(int expenses, String name, String surname, int id){
        super(name, surname, id);
        this.expenses = expenses;
    }
    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    @Override
    public String printInfo() {
        return super.printInfo() +" expenses : " + expenses;
    }
}
