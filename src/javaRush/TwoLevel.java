package javaRush;

import static java.lang.Math.min;

public class TwoLevel {
    //Написать функцию, которая возвращает минимум из двух чисел.

    public static int min(int t, int b) {
        int a;
        if (t<b){
            a=t;
        }else {
            a=b;
        }

            return a;
        }
        //Написать функцию, которая вычисляет максимум из двух чисел.
        public static int max(int t, int b) {
            int a;
            if (t>b){
                a=t;
            }else {
                a=b;
            }

            return a;
        }
        //Написать функцию, которая вычисляет минимум из трёх чисел.
    public static int forMax(int a,int b, int c){
        int v = 0;
        if (a>b && a>c){
            v=a;
        }else if (b>a && b>c){
            v=b;
        }else if (c>b && c>a){
          v=c;
        }
        return v;
    }
    //Написать функцию, которая вычисляет минимум из четырёх чисел.
    //Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
    public static int forMin(int a,int b,int c,int d){
        int v=0;
        if (min(a, b)<min(c, d)){
            v=min(a, b);
        }else {
            v=min(c, d);
        }
        return v;
    }
    //Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
    public static String st(String s){
        for (int i = 0; i <2 ; i++) {
            System.out.println(s);
        }
        return s;
    }
    //Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
    // Слова должны быть разделены пробелом и не должны сливаться в одно.
    public static String mt(String s){
        for (int i = 0; i <2 ; i++) {
            System.out.print(s);
        }
        return s;
    }
    public static void main(String[] args) {

        System.out.println(min(5, 6));// вызов min
        System.out.println(min(5, 6));// вызов min
        System.out.println(min(5, 6));// вызов min
        System.out.println(max(6, 5));// вызов макс
        System.out.println(forMax(8, 7, 9));// вызов forMax
System.out.println(forMin(6, 5, 7, 4));//вызов forMin
        System.out.println(st("Привет"));// вызов st
        // Напиши программу, которая выводит на экран надпись: «Мне так плохо! Хочу, чтобы все умерли!».
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");
        System.out.print(mt("Пока "));// вызов mt




        //  Создать объект типа Cat 2 раза.
        //          Сохрани каждый экземпляр в свою переменную.
        //        Имена переменных должны быть разные.
        Cat cat = new Cat();

        Cat cat2 = new Cat();


        //Создать 3 объекта типа Dog (собака).
        //Сохрани каждый экземпляр в отдельную переменную.
        //Присвоить им имена "Max", "Bella", "Jack".
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";

        //Закоментарь несколько строк, чтобы на экран вывелось число 19
        int x = 1;
        int y = 0;
        y = y + 3 * x;//3
        // x = x * 2;
        x = x * 16;
        // y = y + 2 * x;
        y = y + x;
        System.out.println("\n"+y);
//Создай 10 переменных типа Cat и 8 объектов типа Cat.
        Cat cat4 = new Cat();

        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        Cat cat11 = new Cat();
        Cat cat12;
        Cat cat13;
        // Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
        //     Присвойте каждому животному владельца (owner).

        Cat kis = new Cat();
        kis.owner = "Макс";
        Dog dix = new Dog();
        dix.owner = "Сергей";
        Fish fish = new Fish();
        fish.owner = "Саша";
        System.out.println();
        System.out.println();


        //Написать функцию, которая возвращает минимум из двух чисел.








    }

}

















