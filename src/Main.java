public class Main {
    public static void main(String[] args) {
        //Входные данные
       int account = 100;
       int replenishment = 1100;
       int priceBonus = 100;
       //Решение
        int newAccount;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment/priceBonus;
            newAccount = account + replenishment + bonus;
        } else {
            bonus = 0;
            newAccount = account + replenishment;
        }
        System.out.println("На вашем счете " + newAccount + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
    }
}
