public class Task2 {

    public static void main(String[] args) {

        int score = 100;
        int refill = 1100;
        int bonus;

        if (refill >= 1000) {
            bonus = refill / 100;
            score = score + refill + bonus;
            System.out.println("Количество бонусных рублей: "+bonus);
            System.out.println("Текущий счёт: "+score);
        } else {
            bonus = 0;
            score = score + refill;
            System.out.println("Количество бонусных рублей: "+bonus);
            System.out.println("Текущий счёт: "+score);
        }
    }
}
