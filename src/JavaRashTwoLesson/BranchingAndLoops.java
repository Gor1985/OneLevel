package JavaRashTwoLesson;

import javaRush.Cat;

import java.util.ArrayList;
import java.util.Scanner;

public class BranchingAndLoops {
    public static void main(String[] args) {

//Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
// private String name равное переданному параметру String name.
        class Cat<count> {
            private String name;
            private static int catsCount = 0;
            private static int catsCounts = 0;
            private String fullName;
            private static int count = 0;


            public static void setCount(int count) {
                Cat.count = count;
            }


            public void setName(String name) {
                this.name = name;
            }


            //Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1.
            // За количество котов отвечает переменная catsCount.

            public static void addNewCat() {
                Cat cat = new Cat();
                catsCount++;
            }

            //Реализовать метод setCatsCount так, чтобы с его помощью можно было
            // устанавливать значение переменной catsCounts равное переданному параметру.
            public static void setCatsCounts(int catsCounts) {
                Cat.catsCounts = catsCounts;
            }

            //Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String fullName
            // равное значению локальной переменной String fullName.
            public void setName(String firstName, String lastName) {
                String fullName = firstName + lastName;
                this.fullName = fullName;

            }
            //Написать код, который бы подсчитывал количество созданных котов (count) и на экран выдавалось правильно их количество.
        }
        Cat cat1 = new Cat();
        Cat.count++;
        Cat cat2 = new Cat();
        Cat.count++;
        System.out.println("Cats count is " + Cat.count);


        //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Минимальное число: " + a);
        } else {
            System.out.println("Минимальное число: " + b);
        }

        //Ввести с клавиатуры четыре числа, и вывести максимальное из них.

        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int g = scanner.nextInt();
        if (c > d & c > e & c > g) {
            System.out.println("Максимальное число: " + c);
        } else if (d > c & d > e & d > g) {
            System.out.println("Максимальное число: " + d);
        } else if (e > c & e > d & e > g) {
            System.out.println("Максимальное число: " + e);
        } else if (g > c & g > d & g > e) {
            System.out.println("Максимальное число: " + g);
        }
        //Задача 3. Сортировка трех чисел
        //
        //Ввести с клавиатуры три числа, и вывести их в порядке убывания.
        System.out.println("Введите первое число");
        int aa = scanner.nextInt();
        System.out.println("Введите второе число");
        int bb = scanner.nextInt();
        System.out.println("Введите третье число");
        int cc = scanner.nextInt();
        if (aa > bb & aa > cc && bb > cc) {
            System.out.println("Три числа в порядке убывания: " + aa + " " + bb + " " + cc);
        } else if (bb > aa & bb > cc && aa > cc) {
            System.out.println("Три числа в порядке убывания: " + bb + " " + aa + " " + cc);
        } else {
            System.out.println("Три числа в порядке убывания: " + cc + " " + bb + " " + aa);
        }

        //Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
        //Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
        System.out.println("Ведите первое имя");
        String ss = scanner.next();
        System.out.println("Ведите второе имя");
        String qq = scanner.next();
        if (ss.equals(qq)) {
            System.out.println("Имена идентичны");
        } else if (ss.length() == qq.length()) {
            System.out.println("Длины имен равны");
        } else {
            System.out.println("Имена разные");
        }
        //Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
        System.out.println("Введите ваше имя");
        String ee = scanner.next();
        System.out.println("Введите ваш возраст");
        int rr = scanner.nextInt();
        if (rr < 18) {
            System.out.println(ee + " Подрасти еще");
        } else {
            System.out.println(ee + " Взрослая");
        }
        //Задача 6. И 18-ти достаточно

        // Ввести с клавиатуры имя и возраст.
        //Если возраст больше 20 вывести надпись «И 18-ти достаточно»
        System.out.println("Введите имя ");
        String ff = scanner.next();
        System.out.println("Введите возраст ");
        int mm = scanner.nextInt();
        if (mm > 20) {
            System.out.println(ff + ",  18-ти достаточно");
        } else {
            System.out.println(ff + ",  18-ти недостаточно");
        }
        //1. 10 чисел
        //
        //Вывести на экран числа от 1 до 10, используя цикл while.
        System.out.println("Вывести на экран числа от 1 до 10, используя цикл while.");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }

        //10 чисел наоборот
        //
        //
        System.out.println("Вывести на экран числа от 10 до 1, используя цикл while");
        int dd = 11;
        while (dd >= 2) {
            dd--;
            System.out.println(dd);
        }
        //Ввести с клавиатуры строку и число N.
        // Вывести на экран строку N раз, используя цикл while.
        System.out.println("Ввести с клавиатуры строку и число N.\n" + " Вывести на экран строку N раз,используя цикл while.");
        System.out.println("Введите строку");
        String gg = scanner.next();
        System.out.println("Введите число");
        int zz = scanner.nextInt();
        int nn = 0;
        while (nn <= (zz - 1)) {
            nn++;
            System.out.println(gg);
        }
        //Вывести на экран квадрат из 10х10 букв S используя цикл while.
        //Буквы в каждой строке не разделять.
        System.out.println("Вывести на экран квадрат из 10х10 букв S используя цикл while");
        String S;
        int jj = 10;
        while (jj-- != 0) {
            System.out.println("SSSSSSSSSS");

        }
        //Вывести на экран таблицу умножения 10х10 используя цикл while.
        //Числа разделить пробелом.
        System.out.println("Вывести на экран таблицу умножения 10х10 используя цикл while.");
        int mmm = 1, n = 1;
        while (mmm <= 10) {
            System.out.print(mmm + " ");
            while (n <= 9) {
                n++;
                System.out.print(mmm * n + " ");
            }
            mmm++;
            n = 1;
            System.out.println("");
        }

        //Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
        //Через пробел либо с новой строки.
        System.out.println("Используя цикл for вывести на экран чётные числа от 1 до 100 включительно");
        for (int j = 0; j < 102; j = j + 2) {
            System.out.print(j);
            System.out.print(" ");
        }
        //Ввести с клавиатуры два числа m и n.
        //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        //
        //Пример: m=2, n=4
        System.out.println(" \n Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок");
        System.out.println("Введите первое число");
        int nnn = scanner.nextInt();
        System.out.println(" Введите второе чи сло");
        int zzz = scanner.nextInt();
        for (nnn = 0; nnn < 10; nnn++) {
            System.out.print(8 + " ");
            for (zzz = 0; zzz < 10; zzz++) {
                System.out.print(8 + " ");
            }
            System.out.println(" ");
        }

//Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
//
//Пример:8
//88
//888
        System.out.println("\nИспользуя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10");

        for (int ggg = 1; ggg <= 10; ggg++) {
            for (int sss = 0; sss < ggg; sss++) {
                System.out.print("8");
            }
            System.out.println();
        }
        //Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
        System.out.println("Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.");
        System.out.println(" Введите имя");
        String ooo = scanner.next();
        for (int j = 0; j < 10; j++) {
            System.out.println(ooo + " любит меня");

        }
        //Используя цикл вывести на экран сто раз надпись:
        //«Я никогда не буду работать за копейки. Амиго»
        System.out.println("Используя цикл вывести на экран сто раз надпись Я никогда не буду работать за копейки. Амиго");
        for (int j = 0; j < 100; j++) {
            System.out.println("Я никогда не буду работать за копейки. Амиго ");
        }
        // Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.
        System.out.println("Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое");
        System.out.println(" Введите первое число");
        int mmmm = scanner.nextInt();
        System.out.println(" Введите второе число");
        int mmmmm = scanner.nextInt();
        System.out.println(" Введите третье число");
        int mmmmmm = scanner.nextInt();
        if (mmmm > mmmmm && mmmm < mmmmmm) {
            System.out.println("Cреднее число " + mmmm);
        }
        if (mmmmm > mmmm && mmmmm < mmmmmm) {
            System.out.println("Cреднее число " + mmmmm);
        }
        if (mmmmmm > mmmm && mmmmmm < mmmmm) {
            System.out.println("Cреднее число " + mmmmmm);
        }
        //Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
        // -1 должно учитываться в сумме.
        System.out.println("Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу");
        System.out.println(" Введите первое число");
        int iii = scanner.nextInt();
        System.out.println(" Введите второе число");
        int vvv = scanner.nextInt();
        if (iii == -1 || vvv == -1) {
            int nnnn = iii + vvv;
            System.out.println("Сумма равна " + nnnn);

        } else {
            int nnnn = iii + vvv;
            System.out.println("Сумма равна " + nnnn);
        }
//Ввести с клавиатуры строку name.
//Ввести с клавиатуры дату рождения (три числа): y, m, d.
//Вывести на экран текст:
//«Меня зовут name
//Я родился d.m.y»
        System.out.println("Вывести на экран текст: Я родился d.m.y");
        System.out.println("Введите ваше имя ");
        String name = scanner.next();
        System.out.println("Введите день вашего рождения ");
        int t = scanner.nextInt();
        System.out.println("Введите месяц вашего рождения ");
        int jjj = scanner.nextInt();
        System.out.println("Введите год вашего рождения ");
        int lll = scanner.nextInt();
        if (t <= 31 && jjj <= 12 && lll <=2023) {
            System.out.println("Меня зовут: " + name + ". Я родился: " + t + "." + jjj + "." + lll);
    //    } else {
        //    System.out.println("Формат не соответствует");
        }
    }
}



