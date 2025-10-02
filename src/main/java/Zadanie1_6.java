public class Zadanie1_6 {
    public static void main(String[] args) {
        System.out.println("Результат: " + isUpperCase('a'));
        System.out.println("Результат: " + isUpperCase('A'));
        System.out.println("Результат: " + isUpperCase('g'));

    }
    public static boolean isUpperCase(char x){
        return x >= 'A' && x <='Z';
    }
}
