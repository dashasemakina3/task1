package zad1_2;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
    }

    /**
     * Получить площадь треугольника
     * @param h Высота
     * @param a Основание
     * @return площадь треугольника
     */
    public static float triArea(float h, float a) {
        return Math.abs(a) * Math.abs(h) / 2.0f;
    }
}
