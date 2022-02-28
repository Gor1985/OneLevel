package javaRush;

import java.util.ArrayList;

public class OneLevel {
    public static void main(String[] args) {
        //	Объявите переменные name1, name2, name3 типа String.
        //	Сразу же в строке объявления присвойте им какие-нибудь значения. Значениями могут быть любые строки.
        String name1 = "Имя";
        String name2 = "Фамилия";
        String name3 = "Отчество";
        //Напиши программу, которая выводит на экран надпись: Я думаю, быть программистом круто
        System.out.println("Я думаю, быть программистом круто");

        //Напиши программу, которая выводит на экран надпись: «Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.
        for (int i = 0; i < 10; i++) {
            System.out.println("Когда я вырасту, то хочу быть паровым экскаватором!");

        }

        //Написать программу, выводящую на экран надпись «Элли очень умная» 5 раз. Каждый раз – с новой строки.
        // Пример вывода на экран: Элли очень умная Элли очень умная Элли очень умная Элли очень умная Элли очень умная
        for (int j = 0; j < 5; j++) {
            System.out.println("Элли очень умная Элли очень умная");

        }
        //Сейчас 3126 год. Мой друг родился 8 лет назад. Написать программу, выводящую на экран год рождения моего друга.
        int a = 3126;
        int b = 8;
        int c = a - b;
        System.out.println(c);


        //Напиши программу, которая в методе main объявляет такие переменные: name типа String, age типа int и city типа
        // String. Примечание: "объявить переменную" - значит то же, что и "создать переменную".
        String name = "name";
        int age = 5;
        String sity = "sity";


        //Раскомментируй одну строчку, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2).
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

        //Убери комментарии с части кода, чтобы на экран вывелось сообщение "Happy New Year".
        // String s = "Merry";
        // System.out.println("Christmas");
        // System.out.println("Merry New");
        // System.out.println("weekend");
        System.out.print("Happy New");
        // System.out.println("weekend");
        // System.out.println(s);
        // System.out.print("Merry New!");
        System.out.print(" ");
        System.out.println("Year");

        //Закомментируй ненужные строки кода, чтобы на экран вывелась надпись "2 плюс 3 равно 5"
        int v = 3;
        int n = 2;

        //  System.out.print("два");
        System.out.print(n);
        System.out.print(" плюс ");
        //  System.out.print(" минус ");
        System.out.print(v);
        // System.out.print("три");
        System.out.print(" равно ");
        // System.out.print(" будет ");
        // System.out.print("пять");
        System.out.println(v + n);

        //Закомментируй часть кода, чтобы на экран вывелось сообщение "sum = 12".
        // изменил значения т.к есть уже в коде
        int r = 3;
      //  int a = 10;
        int t = 6;
       // int b = 12;
      //  int sum = 1 + a + b;
       // int sum = 2 + a + b;
        int summa = 3 + r + t;
       // int sum = 4 + a + b;

        System.out.println("sum = " + summa);
        //Напиши программу, которая выводит на экран надпись:
        //Это не баг, это фича.
        System.out.println("Это не баг, это фича");
        //задание: написать программу, которая выводит на экран строки:Меня зовут Амиго.
        //
        //Я согласен на зарплату $800/месяц в первый год.
        //Я согласен на зарплату $1500/месяц во второй год.
        //Я согласен на зарплату $2200/месяц в третий год.
        //Я согласен на зарплату $2700/месяц в четвертый год.
        //Я согласен на зарплату $3200/месяц в пятый год.
        //
        //Поцелуй мой блестящий металлический зад!
        ArrayList arrayList=new ArrayList();
        arrayList.add("Я согласен на зарплату $800/месяц в первый год.");
        arrayList.add("Я согласен на зарплату $1500/месяц во второй год.");
        arrayList.add("Я согласен на зарплату $2200/месяц в третий год.");
        arrayList.add("Я согласен на зарплату $2700/месяц в четвертый год.");
        arrayList.add("Я согласен на зарплату $3200/месяц в пятый год.");
        arrayList.add("Поцелуй мой блестящий металлический зад!");
        for (Object s:arrayList) {
            System.out.println(s);
        }
//
//Nothing personal, it's just business.
//Переставьте строки так, чтобы получился текст "Nothing personal, it's just business."
            // так как там подписка на дж раш второй уровень платная я беру задания из плана заданий
 String X = "Nothing";
       X = X + " ";
       X = X + "personal";
        X = X + ",";
        X = X + " ";
        X = X + "it's";
        X = X + " ";
        X = X + "just";
        X = X + " ";
        X = X + "business";
        X = X + ".";

        System.out.println(X);
//Объявите недостающие переменные и закоментарьте те, которые нигде не используются.
        //String s = "15";
       int s = 5;
        //int z = 18;
        int d = 18;
        int q = a + d;
        String f = " better then ";

        System.out.println(s + f + q);
        //Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.
        for (int i = 0; i <=16 ; i++) {
            System.out.println("Слава Роботам! Убить всех человеков!");
        }

        }
    }








