public class Zadanie1_2 {
    public static void main(String[] args) {
        System.out.println("Результат: " + sumLastNums(312));
        System.out.println("Результат: " + sumLastNums(123456789));
    }
    public static int sumLastNums(int x){
        int c=x%10; // Последнее число
        int z=(x/10)%10; // Предпоследнее число
        return c+z;
    }
}
