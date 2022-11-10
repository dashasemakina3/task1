package zad1_8;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
    }

    /**
     * Найти ребро треугольника
     *
     * @param a Ребро а
     * @param b Ребро b
     * @return Ребро с
     */
    public static int nextEdge(int a, int b) {
        //Ребро c
        int c = 0;
        
        // Цикл, пока сохраняется условие существования треугольника
        do {
            c++;
        } while (Math.abs(a) + Math.abs(b) > c);
        
        // Вернуть третью сторону на 1 меньше,
        // т.к. в цикле перешли предел
        return c-1;
    }
}
