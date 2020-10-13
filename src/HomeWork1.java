import java.util.Scanner;

public class HomeWork1 {
    private static Object String;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = 126;
        short s = -32000;
        int a = 4, year, x, x1,x2,x3,x4, y;
        long l = 2_000_000_000L;
        float f = 8.9f, res1;
        double d = 1.34;
        char c = 'C';
        String name = "name", userName;
        boolean b1 = true, res2, res4;

        System.out.println("Введите 4 числа для подсчета выражения a*(b+(c/d))");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        x3 = scanner.nextInt();
        x4 = scanner.nextInt();
        res1 = calculate(x1, x2, x3, x4);
        System.out.println("Введите 2 числа, чтобы узнать, принадлежат ли они отрезку [10;20]");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        res2 = isInterval(x1, x2);

        System.out.println("Введите целое число, чтобы узнать, является ли оно отрицательным");
        y = scanner.nextInt();
        res4 = isNegative(y);

        System.out.println("a*(b+(c/d)) = " + res1 + "\nПринадлежность интервалу [10;20]: " + res2 +
                "\nЯвляется ли " + y + " отрицательным числом: "  + res4);
        System.out.println("Введите целое число, чтобы узнать, является ли оно положительным");
        x = scanner.nextInt();
        isPositive(x);
        System.out.println("Напишите свое имя");
        scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        sayHello(userName);
        System.out.println("Введите год");
        year = scanner.nextInt();
        isLeap(year);
    }
       public static float calculate(int a, int b, int c, int d){
            return (float) (a*(b+(c/d)));
       }

       public static boolean isInterval(int a, int b){
            if ((a+b)>=10 && (a+b)<=20){
                return true;
            } else {
                return false;
            }
       }

       public static void isPositive (int a){
            if (a>=0){
                System.out.println(a + " - вы ввели положительное число");
            } else {
                System.out.println(a + " - вы ввели отрицательное число");
            }
       }

       public static boolean isNegative (int a){
            if (a<0){
                return true;
            } else{
                return false;
            }
    }

    public static void sayHello(String name){
        System.out.println("Привет, " + name);
    }

    public static void isLeap (int year){
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
