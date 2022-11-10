package zad1_7;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }
    
    /**
     * Сумма чисел
     * @param n Число
     * @return Сумма чисел
     */
    public static int addUpTo(int n) {
        // Модуль числа
        n = Math.abs(n);
        
        // Сумма чисел
        int sum = 0;
        
        // Цикл от 1 до n
        for(int i=1; i<=n;++i)
            sum+=i;
        
        // Вернуть сумму
        return sum;
    }
}
