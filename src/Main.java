public class Main {
    public static void main(String[] args) {

        int initial_sum = 100;
        int added_sum = 4000;
        int bonus_scale = 100;
        int bonus;

        if (added_sum > 1000)  {
            bonus = added_sum / bonus_scale;
        }  else  {
            bonus = 0;
        }

        int final_sum = (initial_sum + added_sum + bonus);

        System.out.println("Итоговый счёт: " + final_sum + "рублей");
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}
