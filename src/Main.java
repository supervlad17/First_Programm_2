public class Main {
    public static void main(String[] args) {

        int initialSum = 100;
        int addedSum = 4000;
        int bonusScale = 100;
        int bonus;

        if (addedSum > 1000)  {
            bonus = addedSum / bonusScale;
        }  else  {
            bonus = 0;
        }

        int final_sum = (initialSum + addedSum + bonus);

        System.out.println("Итоговый счёт: " + final_sum + "рублей");
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}
