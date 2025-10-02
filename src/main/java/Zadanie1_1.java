public class Zadanie1_1 {
    public static void main(String[] args) {
        System.out.println("Результат: " + fraction(10.33333333));
        System.out.println("Результат: " + fraction(5));
        System.out.println("Результат: " + fraction(1.0157));
        System.out.println("Результат: " + fraction(+ 10987.1));
    }
    public static double fraction(double x){
        int v = (int) x;
        double rez = x-v;
        return rez;
/*Дробная часть. Дана следующая сигнатура метода:

public static double fraction(double x);
Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х. При выводе результата необходимо обеспечить точность вычислений — три
знака после запятой
Подсказка: вещественное число может быть преобразовано к целому путем
отбрасывания дробной части.

Пример:
x=5,3
результат: 0,3 */

    }
}
