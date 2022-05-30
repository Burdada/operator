public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int addedAmount = 1200;
        int bonus;
        if (addedAmount > 1000) {
            bonus = addedAmount / 100 * 1;
        } else {
            bonus = 0;
        }
        int summedAmount = amount + addedAmount + bonus;
        System.out.println("Бонусные баллы: " + bonus);
        System.out.println("Итоговая сумма на счету:" + summedAmount);
    }
}
