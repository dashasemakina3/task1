package zad1_5;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }

    /**
     * Поиск операции
     *
     * @param a a
     * @param b b
     * @param N N
     * @return Результат
     */
    public static String operation(int a, int b, int N) {
        if ((a + b) == N) {
            return "added";
        } else if ((a - b) == N || (b - a) == N) {
            return "subtracted";
        } else if ((a * b) == N) {
            return "multiplied";
        } else if ((a / b) == N || (b / a) == N) {
            return "divided";
        }
        else return "none";
    }
}
