public class Zadanie1_7 {
    public static void main(String[] args) {
        System.out.println("Результат: " + isInRange(1,2,3));
        System.out.println("Результат: " + isInRange(5, 15,2));
        System.out.println("Результат: " + isInRange(25, 3, 12));
        System.out.println("Результат: " + isInRange(5, 1, 3));
        System.out.println("Результат: " + isInRange(1, 5, 3));
        System.out.println("Результат: " + isInRange(1, 5, 45));
        System.out.println("Результат: " + isInRange(5, 1, 12));

    }
    public static boolean isInRange(int a, int b, int num){
        if (a>=b) {
            return a>= num && num >= b;}
        else {
            return  b>= num && num >= a;}
    }
}
