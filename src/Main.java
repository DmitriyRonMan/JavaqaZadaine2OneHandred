public class Main {
    public static void main(String[] args) {
        int check = 240;
        double repAmount = 1000.5;
        int bonus;
        if (repAmount >= 1000.5) {
            bonus = (int) repAmount / 100;
        } else {
            bonus = 0;
        }
        int userBalance = check + (int) repAmount + bonus;
        System.out.println("Сумма баланса с бонусами: " + userBalance);
        System.out.println("Сумма бонусов: " + bonus);
    }
}