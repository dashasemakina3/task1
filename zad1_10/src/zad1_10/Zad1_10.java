package zad1_10;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    public static boolean abcmath(int a, int b, int c) {

        // Цикл b раз
        for (int i = 0; i < b; ++i) {
            // Прибавить к сумме a
            a += a;
        }

        // Если a делиться на с, то есть
        // остаток от деления равен нулю
        if (a % c == 0) {
            return true;
        }

        return false;
    }
}
