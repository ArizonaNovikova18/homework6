public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
       for (int a = 0; a <= 10; a++){
           System.out.println(a);
       }
       System.out.println("Задание 2");
       for (int b = 10; b >= 0; b--){
           System.out.println(b);
       }
        System.out.println("Задание 3");
       for (int c = 0; c <= 17; c = c + 2){
           System.out.println(c);
       }
        System.out.println("Задание 4");
       for (int d = 10; d >= -10; d--){
           System.out.println(d);
       }
        System.out.println("Задание 5");
       for (int e = 1904; e <= 2096; e = e + 4){
           System.out.println(e + " год является високосным");
       }
        System.out.println("Задание 6");
       for (int f = 7; f <= 98; f = f + 7){
           System.out.println(f);
       }
        System.out.println("Задание 7");
       for (int g = 1; g <= 512; g = g * 2){
           System.out.println(g);
       }
        System.out.println("Задание 8");
       int salary = 29000;
       int beginning = 0;
       for (int month = 1; month <= 12; month++){
           beginning = beginning + salary;
           System.out.println("Месяц " + month + " сумма накопления равна " + beginning + " рублей");
       }
        System.out.println("Задание 9");
       int s = 29000;
       int bg = 0;
       for (int i = 0; i < 12; i ++){
           bg = bg + bg/100;
           bg = bg + s;
           System.out.println("Месяц " + i + " сумма накоплений равна " + bg + " рублей");
       }
        System.out.println("Задание 10");
       int two = 2;
       for (int t = 1; t <= 10; t ++){
           System.out.println(two + "*" + t + "=" + two * t);
        }
    }
}