package zad1_1;
/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }

    /**
     * Получить остаток от деления
     *
     * @param dividend делимое
     * @param divisor делитель
     * @return остаток от деления
     */
    public static int remainder(int dividend, int divisor) {
        // Модули чисел
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        // Если делимое меньще делителя
        // вернуть делимое
        if(divisor>dividend) return dividend;

        // множитель
        int k = 0;
        
        // Цикл, пока делимое меньше произведения divisor * k
        do {
            k++;
        } while (dividend > (divisor * k));
        
        if (dividend == (divisor * k)) {
            return 0;
        }
        
        return dividend - divisor * (k-1);
    }
}
