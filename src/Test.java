public class Test {
    public static void main(String[] args) {
        Director director = new Director(6000, "Mariusz", "Szulc", 666);
        director.setBonus(500);
        System.out.println(director.totalPayment());
    }
}
