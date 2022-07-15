public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refillSum = 1100;
        int bonus;

        if (refillSum > 1000)  {
            bonus = refillSum / 100;
        } else {
            bonus = 0;
        }

        account = account + refillSum + bonus;

        System.out.println("Количество бонусов равно " + bonus + " рублей.");
        System.out.println("Итоговый счёт " + account + " рублей.");
    }

}
