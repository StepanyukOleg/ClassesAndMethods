public class Zadanie1_10 {
    public static void main(String[] args) {
        System.out.println("Результат: " + lastNumSum(5,11));
        System.out.println("Результат: " + lastNumSum(lastNumSum(5, 11), 123));
         System.out.println("Результат: " + lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14));
         System.out.println("Результат: " + lastNumSum(lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14), 1));

    }
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}
