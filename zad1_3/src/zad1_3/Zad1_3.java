package zad1_3;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
    }

    /**
     * Получить количество ног животных
     *
     * @param chickens Число кур
     * @param cows Число коров
     * @param pigs Число свиней
     * @return количество ног животных
     */
    public static int animals(int chickens, int cows, int pigs) {
        return (Math.abs(pigs) + Math.abs(cows)) * 4
                + Math.abs(chickens) * 2;
    }
}
