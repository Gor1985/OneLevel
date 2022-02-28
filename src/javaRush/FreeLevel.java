package javaRush;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FreeLevel {
    public static void main(String[] args) {
        //Вывести на экран дату своего рождения в виде: MAY 1 2012
        System.out.println(" SEPT 17 1988");

        //Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850
        System.out.println((400 + (25 + 25) + 400));

        //Создать 10 зергов, 5 протосов и 12 терран.Дать им всем уникальные имена.
        Zerg zerg = new Zerg("Зергий");
        Zerg zer1 = new Zerg("Зергуан");
        Zerg zerg2 = new Zerg("Зерчилло");
        Zerg zerg3 = new Zerg("Зартулло");
        Zerg zerg4 = new Zerg("Михмумаддин");
        Zerg zerg5 = new Zerg("Миррдин");
        Zerg zerg6 = new Zerg("Исмаил");
        Zerg zerg7 = new Zerg("Ишамаэль");
        Zerg zerg8 = new Zerg("Анальгин");
        Zerg zerg9 = new Zerg("Полтава");

        Protosy protosy = new Protosy("Протос1");
        Protosy protosy1 = new Protosy("Протос2");
        Protosy protosy2 = new Protosy("Протос3");
        Protosy protosy3 = new Protosy("Протос4");
        Protosy protosy4 = new Protosy("Протос5");

        Terran terran = new Terran("Терран1");
        Terran terran1 = new Terran("Терран2");
        Terran terran2 = new Terran("Терран3");
        Terran terran3 = new Terran("Терран4");
        Terran terran4 = new Terran("Терран5");
        Terran terran5 = new Terran("Терран6");
        Terran terran6 = new Terran("Терран7");
        Terran terran7 = new Terran("Терран8");
        Terran terran8 = new Terran("Терран9");
        Terran terran9 = new Terran("Терран10");
        Terran terran10 = new Terran("Терран11");
        Terran terran11 = new Terran("Терран12");
        //Вывести на экран произведение чисел от 1 до 10.
        //Подсказка: будет три миллиона с хвостиком

        int a = 1;
        for (int i = 1; i <= 10; i++) {
            a = a * i;
        }
//Вывести на экран сумму чисел от 1 до 10 построчно:
        System.out.println(a);
        int b = 0;
        for (int j = 0; j <= 10; j++) {
            b = b + j;
            System.out.println(b);
        }
        //Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
        //Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.

        String d = "Мама";
        String j = "Мыла";
        String c = "Раму";
        System.out.println(d + j + c);
        System.out.println(d + c + j);
        System.out.println(j + d + c);
        System.out.println(j + c + d);
        System.out.println(c + d + j);
        System.out.println(c + j + d);
//Выведи на экран таблицу умножения 10 на 10 в следующем виде:1 2 3 …
//2 4 6 …
//3 6 9 …
//…

        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }




        //Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
        //Каждый объект при создании выводит на экран определенный цвет.
        Colors red = new Colors("Red");
        System.out.println(red.getColor());
        Colors orange = new Colors("Orange");
        System.out.println(orange.getColor());
        Colors yellow = new Colors("Yellow");
        System.out.println(yellow.getColor());
        Colors green = new Colors("Green");
        System.out.println(green.getColor());
        Colors blue = new Colors("blue");
        System.out.println(blue.getColor());
        Colors blueBlue = new Colors("BlueBlue");
        System.out.println(blueBlue.getColor());
        Colors violet = new Colors("Violet");
        System.out.println(violet.getColor());

        //Про экранирование символов в Java читайте в дополнительном материале к лекции.
        // Вывести на экран следующий текст - две строки:
        //It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        //It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
       String st="It's Windows path: ";
       String mt=" C:\\Program Files\\Java\\jdk1.7.0\\ bin ";
       String gr="It's Java string: \\\"C:\\Program Files\\Java\\jdk1.7.0\\bin\\";
       // String gg="Windows path: "C:\Program Files\Java\jdk1.7.0 \ bin";
        System.out.println(st+mt);
        System.out.println(gr);

        //Выведи на экран 日本語
        String bb="日本語";
        System.out.println(bb);
        //Вывести на экран надпись «Жить хорошо, а хорошо жить еще лучше»
        System.out.println("Жить хорошо, а хорошо жить еще лучше");
        //Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
        for (int i = 0; i <10 ; i++) {
            System.out.println("Я не хочу изучать Java, я хочу большую зарплату");
        }
        // Ввести с клавиатуры число и имя, вывести на экран строку:«имя» захватит мир через «число» лет. Му-ха-ха!
       Zahvat zahvat=new Zahvat("", 0);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите имя и число");
        String m= scanner.next();
        zahvat.setName(m);
        int z=scanner.nextInt();
        zahvat.setAge(z);
        System.out.println(zahvat.getName()+" захватит мир через " +zahvat.getAge() +" лет. Му-ха-ха!");

        //Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
  Zahvat zahvat1=new Zahvat("", 0, 0);
        System.out.println("Введите имя, число и еще одно число");
        String v=scanner.next();
        zahvat.setName(v);
        int s= scanner.nextInt();
        zahvat1.setAge(s);
        int w=scanner.nextInt();
        zahvat1.setNumber(w);
        System.out.println(zahvat1.getName()+"получает "+zahvat1.getAge()+" через "+zahvat1.getNumber()+" лет");
        //вести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
   Zahvat zahvat2=new Zahvat();
        System.out.println("Введите имя и количество денег");

        String f=scanner.next();
        zahvat2.setName(f);
       int t=scanner.nextInt();
        zahvat2.setMany(t);
        System.out.println(zahvat2.getName()+ " зарабатывает $"+ zahvat2.getMany()+",000 Ха-ха-ха!");
        //Ввести с клавиатуры два имени и вывести надпись:
        //name1 проспонсировал name2, и она стала известной певицей.
        Zahvat zahvat3=new Zahvat();
        System.out.println("Введите имена");
        String nn=scanner.next();
        zahvat3.setName(nn);
        String aa=scanner.next();
        zahvat3.setName2(aa);
        System.out.println(zahvat3.getName()+" проспонсировал "+zahvat3.getName2()+", и она стала известной певицей");
//Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!
        Zahvat zahvat4=new Zahvat();
        System.out.println("Введите имена трио");
        String zz=scanner.next();
        zahvat4.setName(zz);
        String cc=scanner.next();
        zahvat4.setName2(cc);
        String rr=scanner.next();
        zahvat4.setName3(rr);
        System.out.println(zahvat4.getName()+"+"+zahvat4.getName2()+"+"+zahvat4.getName3()+" = Чистая любовь, да-да!");
        }

    }






