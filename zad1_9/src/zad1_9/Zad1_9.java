package zad1_9;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Инициализировать массивы
        int[] m1 = {3, 4, 5};
        int[] m2 = {2};
        int[] m3 = {};
        System.out.println(sumOfCubes(m1));
        System.out.println(sumOfCubes(m2));
        System.out.println(sumOfCubes(m3));
    }

    public static int sumOfCubes(int[] m) {
        // Размер массива
        int len = m.length;
        
        // Если массив пустой
        if(len==0)return 0;
        
        // Сумма кубов
        int sum = 0;
        
        // Цикл по всему массиву
        for(int i=0;i<len;++i){
            
            // Прибавить к сумме куб очередного элемента массива
            sum+=m[i]*m[i]*m[i];
        }
        
        // Вывод результата
        return sum;
    }
}
