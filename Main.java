public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 1100;
        int bonus;
        int percent = 1;
        if (amount <= 1050) {
            bonus = 0;
        } else {
            bonus = amount * percent / 100;
        }
        int total = account + amount + bonus;
        System.out.println(total);
    }
}