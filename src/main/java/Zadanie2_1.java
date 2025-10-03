public class Zadanie2_1 {
    public static void main(String[] args) {
        System.out.println("Результат: " + abs(5));
        System.out.println("Результат: " + safeDiv(5, 0));
        System.out.println("Результат: " + max(222, 1));
        System.out.println("Результат: " + makeDecision(222, 1));
        System.out.println("Результат: " + max3(1, 1, 1));
        System.out.println("Результат: " + sum3(1, 5, 7));
        System.out.println("Результат: " + sum3(7, 1, 5));
        System.out.println("Результат: " + sum3(6, 4, 2));
        System.out.println("Результат: " + sum3(-33, 11, -22));
        System.out.println("Результат: " + sum2(15, 20));
        System.out.println("Результат: " + sum2(3, 5));
        System.out.println("Результат: " + sum2(5, 8));
        System.out.println("Результат: " + sum2(10, 8));
        System.out.println("Результат: " + sum2(2, 8));
        System.out.println("Результат: " + sum2(0, 19));
        System.out.println("Результат: " + is35(0));
        System.out.println("Результат: " + is35(1));
        System.out.println("Результат: " + is35(15));
        System.out.println("Результат: " + is35(3));
        System.out.println("Результат: " + is35(5));
        System.out.println("Результат: " + is35(8));
        System.out.println("Результат: " + age(11111));
        System.out.println("Результат: " + age(454));
        System.out.println("Результат: " + age(1894));
        System.out.println("Результат: " + magic6(6, 6));
        System.out.println("Результат: " + magic6(3, 3));
        System.out.println("Результат: " + magic6(8, 2));
        System.out.println("Результат: " + magic6(2, 8));
        System.out.println("Результат: " + magic6(2, 4));
        System.out.println("Результат: " + magic6(4, 2));
        System.out.println("Результат: " + magic6(0, 5));
        System.out.println("Результат: " + magic6(4, 2));
        System.out.println("Результат: " + day(4));
        System.out.println("Результат: " + day(1));
        System.out.println("Результат: " + day(7));
        System.out.println("Результат: " + day(415));
       printDays("Среда");
    }
    public static int abs(int x){
        if (x>0) {return x;}
        return -x; // IDE еще подсказывает, что можно просто -x (Вместо x-x-x)
    }
    public static int safeDiv(int x, int y){
        if (x == 0 || y == 0) {return 0;}
        return x/y;
    }
    public static int max(int x, int y){
    if (x>y) {return x;}
    return y;}
    public static String makeDecision(int x, int y){
        if (x>y){return x + " > " + y;}
        if (x<y){return x + " < " + y;}
        return x + " == " + y;
    }
    public static int max3(int x, int y, int z){
        if (x>y && x>z) {return x;}
        if (y>x && y>z) {return y;}
        return z;
    }
    public static boolean sum3(int x, int y, int z)
    {
        if (x+y==z || z+y==x || x+z==y)
        {return true;}
    return false;}

    public static int sum2(int x, int y)
    {
        int sum=x+y;
        if (sum>=10 && sum<19) {return 20;}
        return sum;
    }
    public static boolean is35(int x)
    {
        if ((x%3==0 && x%5!=0) || (x%5==0 && x%3!=0)) {return true;}
        return false;
    }
    public static boolean magic6(int x, int y)
    {
        if ((x+y==6) /* Сумма */ || (x-y==6 || y-x==6) /* Разница */ || (x==6 || y==6)) {return true;}
        return false;
    }
    public static String age(int x){
        if ((x%10 == 1 && x!= 11 && x%100!=11) || (x%100 == 1 && x!= 11 && x%100!=11)){
            return x +" год";}
        if (((x%10 == 2 || x%10 == 3 || x%10 == 4) || (x%100 == 2 || x%100 == 3 || x%100 == 4)) && (x!= 12 && x!= 13 && x!= 14 && x%100!=12 && x%100!=13 && x%100!=14)){
            return x +" года";}
        else{
            return x +" лет";}
}
    public static String day(int x) {
        switch (x) {
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресение";
            default: return "Это не день недели.";
        }
    }

    public static void printDays(String x){
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
                case "Вторник":
                System.out.println("Вторник");
                 case "Среда":
                System.out.println("Среда");
                 case "Четверг":
                System.out.println("Четверг");
                 case "Пятница":
                System.out.println("Пятница");
                 case "Суббота":
                System.out.println("Суббота");
                 case "Воскресение":
                System.out.println("Воскресение");
                break;
            default:
                System.out.println("Это не день недели");
        }
        }
    }
