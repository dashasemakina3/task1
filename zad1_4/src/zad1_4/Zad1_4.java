package zad1_4;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2f, 50, 9));
        System.out.println(profitableGamble(0.9f, 1, 2));
        System.out.println(profitableGamble(0.9f, 3, 2));
    }

    /**
     * Прибыльная ли игра
     *
     * @param prob Проба
     * @param prize Прибыль
     * @param pay Ставка
     * @return true, если игра прибыльная
     */
    public static boolean profitableGamble(float prob, float prize, float pay) {
        return Math.abs(prob) * Math.abs(prize) > Math.abs(pay);
    }
}
