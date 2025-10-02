public class Zadanie1_3 {
    public static void main(String[] args) {
        System.out.println("Результат: " + charToNum('0'));
        System.out.println("Результат: " + charToNum('1'));
        System.out.println("Результат: " + charToNum('2'));
        System.out.println("Результат: " + charToNum('3'));
        System.out.println("Результат: " + charToNum('4'));
        System.out.println("Результат: " + charToNum('5'));
        System.out.println("Результат: " + charToNum('6'));
        System.out.println("Результат: " + charToNum('7'));
        System.out.println("Результат: " + charToNum('8'));
        System.out.println("Результат: " + charToNum('9'));
    }

    public static int charToNum(char x) {
        return x-48;
    }
}
