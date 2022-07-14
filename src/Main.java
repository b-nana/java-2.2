public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refillSum = 203;
        int bonus;

        bonus = refillSum / 100;
        account = account + bonus;

        System.out.println("Количество бонусов равно " + bonus + " рублей.");
        System.out.println("Итоговый счёт " + account + " рублей.");
    }

}
