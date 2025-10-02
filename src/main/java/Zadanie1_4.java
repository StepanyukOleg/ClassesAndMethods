public class Zadanie1_4 {
    public static void main(String[] args) {
        System.out.println("Результат: " + isPositive(0));
        System.out.println("Результат: " + isPositive(-15));
        System.out.println("Результат: " + isPositive(5));
    }

    public static boolean isPositive(int x) {
        return x >= 0;
    }
}
