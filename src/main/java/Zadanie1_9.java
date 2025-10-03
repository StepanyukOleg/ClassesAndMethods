public class Zadanie1_9 {
    public static void main(String[] args) {
        System.out.println("Результат: " + isEqual(666,6, 5));
        System.out.println("Результат: " + isEqual(6, 6, 6));
         System.out.println("Результат: " + isEqual(2, 3, 6));
         System.out.println("Результат: " + isEqual(5, 15, 15));
         System.out.println("Результат: " + isEqual(0, 3, 3));
         System.out.println("Результат: " + isEqual(3, 0, 5));
         System.out.println("Результат: " + isEqual(3, 3, 3));

    }
    public static boolean isEqual (int a, int b, int c){
        return a == b && a == c;
    }
}
