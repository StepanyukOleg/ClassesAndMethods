public class Zadanie1_8 {
    public static void main(String[] args) {
        System.out.println("Результат: " + isDivisor(666,6));
        System.out.println("Результат: " + isDivisor(6, 666));
         System.out.println("Результат: " + isDivisor(2, 3));
         System.out.println("Результат: " + isDivisor(15, 5));
         System.out.println("Результат: " + isDivisor(0, 3));
         System.out.println("Результат: " + isDivisor(3, 0));

    }
    public static boolean isDivisor (int a, int b){
        // Вариант 1
       if (a == 0 || b ==0){return false;}
        return a%b ==0 || b%a ==0;
       /*  Вариант 2
       if (a%b==0) {
            return true;}
        if (b%a==0){
            return true;}
        else {
            return false;}
     */
    }
}
