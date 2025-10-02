public class Zadanie1_5 {
    public static void main(String[] args) {
        System.out.println("Результат: " + is2Digits(0));
        System.out.println("Результат: " + is2Digits(100));
        System.out.println("Результат: " + is2Digits(45));

    }
    public static boolean is2Digits(int x){
        return x < 100 && x >9;
    }
}
