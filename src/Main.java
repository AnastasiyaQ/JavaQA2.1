public class Main {
    public static void main(String[] args) {
        int startingMoney = 500;
        int replenishment = 1200;

        if (replenishment >= 1000) {
            startingMoney = (startingMoney + replenishment + replenishment / 100 * 1);
        } else {
            startingMoney = (startingMoney + replenishment);
        }
        {
            System.out.println("Итого на счету " + startingMoney);
        }
    }
}