package zad1_6;

/**
 * Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
    }
    
    /**
     * Код символа
     * @param c символ
     * @return Код символа
     */
    public static int ctoa(char c) {
        return (int)c;
    }
}
