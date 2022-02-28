package JavaRashTwoLesson;

import javax.imageio.spi.RegisterableService;
import java.util.ArrayList;
import java.util.Scanner;

public class GettingToKnowClassesWritingYourOwnClassesConstructors {


    public static void main(String[] args) {
        System.out.println("Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int)");
        //Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setName("Первый");
        cat.setStrenght(50);
        cat.setWeight(60);
        System.out.println("Реализовать метод boolean fight(Cat anotherCat)");
        //Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса, возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
        //Должно выполняться условие:
        //если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
        Cat cat1 = new Cat();
        cat1.setName("Второй");
        cat1.setStrenght(30);
        cat1.setAge(6);
        cat1.setWeight(50);
        cat.fight(cat1);

        //Создать class Dog. У собаки должна быть кличка String name и возраст int age.
        //Создайте геттеры и сеттеры для всех переменных класса Dog.
        Dog dog = new Dog();
        //4. Создать три объекта типа Cat
        //
        //В методе main создать три объекта типа Cat и заполнить их данными.
        // Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
        Cat cat2 = new Cat();
        cat2.setWeight(50);
        cat2.setAge(6);
        cat2.setStrenght(3);
        Cat cat3 = new Cat();
        cat3.setWeight(60);
        cat3.setAge(7);
        cat3.setStrenght(2);

        Cat cat4 = new Cat();
        cat4.setWeight(80);
        cat2.setAge(9);
        cat2.setStrenght(2);
        //5. Провести три боя попарно между котами
        //
        //Создать три кота используя класс Cat.
        //Провести три боя попарно между котами.
        //Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
        //Результат каждого боя вывести на экран.
        System.out.println("Провести три боя попарно между котами");
        System.out.println("Результат битвы между первым и вторым котом");
        cat2.fight(cat3);
        System.out.println("Результат битвы между вторым и третьим котом");
        cat3.fight(cat4);
        //Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
        //- Имя
        //- Имя, возраст
        //- Имя, возраст, пол
        Friend friend = new Friend("");// поместил что бы не переписывать с конструктором


        //Создать класс Cat (кот) с пятью инициализаторами:
        //- Имя
        //- Имя, вес, возраст
        //- Имя, возраст (вес стандартный)
        //- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
        //- вес, цвет, адрес (чужой домашний кот)
        System.out.println("Создать класс Cat (кот) с пятью инициализаторами: Проверка значения");
        Cat cat10 = new Cat();
        cat10.initialize("sdg", 10);
        System.out.println(cat10.weight);
        //Создать класс Dog (собака) с тремя инициализаторами:
        //- Имя
        //- Имя, рост
        //- Имя, рост, цвет
        System.out.println("Создать класс Dog (собака) с тремя инициализаторами:Проверка значений");
        Dog dog1 = new Dog();
        dog1.initialize(" dfdd");
        System.out.println(dog1.name);
//Создать класс (Circle) круг, с тремя инициализаторами:
//- centerX, centerY, radius
//- centerX, centerY, radius, width
//- centerX, centerY, radius, width, color
        System.out.println("Создать класс (Circle) круг, с тремя инициализаторами: проверка значений");
        Circle circle = new Circle();
        circle.initialize(10, 20, 10);
        System.out.println(circle.centerX);
        //Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
        // Создать для него как можно больше методов initialize(…)
        System.out.println("Создать класс прямоугольник (Rectangle): проверка значений");
        Rectangle rectangle = new Rectangle();
        rectangle.initialize(10, 20);
        System.out.println(rectangle.getLeft());

//Создать класс Friend (друг) с тремя конструкторами:
//- Имя
//- Имя, возраст
//- Имя, возраст, пол
        Friend friend1 = new Friend("er", 10);
        //Создать класс Cats (кот) с пятью конструкторами:
        //- Имя,
        //- Имя, вес, возраст
        //- Имя, возраст (вес стандартный)
        //- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
        //- вес, цвет, адрес ( чужой домашний кот)
        //
        //Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
        // То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
        Cats cats = new Cats("");
        //Создать класс Dogs (собака) с тремя конструкторами:
        //- Имя
        //- Имя, рост
        //- Имя, рост, цвет
        Dogs dogs = new Dogs("", 5);
        //Создать класс (Circle) круг, с тремя конструкторами:
        //- centerX, centerY, radius
        //- centerX, centerY, radius, width
        //- centerX, centerY, radius, width, color
        Circles circles = new Circles(10, 20, 30);
        //Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
        // Создать для него как можно больше конструкторов:
        Restangles restangles = new Restangles(10, 20);
        //По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
        //Подумай, что должен возвращать метод toString в классах Cat и Dog? он возвращет стринговое описание этих обьектов
        //В методе main создай по два объекта каждого класса и выведи их на экран.
        //Объекты класса Duck уже созданы и выводятся на экран.
        System.out.println("По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака");
        System.out.println("В методе main создай по два объекта каждого класса и выведи их на экран");
        System.out.println("Объекты класса Duck уже созданы и выводятся на экран");
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Duck duck = new Duck("", 10);
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println(cat5.toString());
        System.out.println(cat6.toString());
        System.out.println(duck.getAge());
        //. Внутри класса Main создай public static классы Man и Woman.
        //2. У классов должны быть поля: name(String), age(int), address(String).
        //3. Создай конструкторы, в которые передаются все возможные параметры.
        //4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
        //5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
        System.out.println("Внутри класса Main создай public static классы Man и Woman");
        System.out.println(" Объекты выведи на экран в таком формате [name + \" \" + age + \" \" + address");
        Man man = new Man("ds", 10, "desrf");
        Man man2 = new Man("ds", 20, "jj");
        Woman woman = new Woman("fff", 10, "dsfg");
        Woman woman1 = new Woman("dsf", 30, "dsfds");
        System.out.println(man.adress + " " + man.name + " " + man.age);
        System.out.println(man2.adress + " " + man2.name + " " + man2.age);
        System.out.println(woman.adress + " " + woman.name + " " + woman.age);
        System.out.println(woman1.adress + " " + woman1.name + " " + woman1.age);
        // //Вывести на экран текущую дату в аналогичном виде «21 06 2015».
        System.out.println("Вывести на экран текущую дату в аналогичном виде «21 06 2015»");
        System.out.println("21 06 2015");
        //Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
        //Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
        // Вывести на экран полученную сумму.
        System.out.println("Программа вводит два числа с клавиатуры и выводит их сумму на экран");
        System.out.println("Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма»");
        System.out.println("Вывести на экран полученную сумму");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int s = scanner.nextInt();
        System.out.println("Введите второе число");
        int v = scanner.nextInt();
        System.out.println("Введите сумма");
        String a = scanner.next();
        while (a.equals("сумма")) {

            System.out.println(v + s);
            break;

        }
        //Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
        System.out.println("Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран");
        System.out.println("Введите первое число");
        int vv = scanner.nextInt();
        System.out.println("Введите второе число");
        int vf = scanner.nextInt();
        System.out.println("Введите третье число");
        int vg = scanner.nextInt();
        System.out.println("Введите четвертое  число");
        int vs = scanner.nextInt();
        System.out.println("Введите пятое число");
        int vk = scanner.nextInt();
        if (vv < vf & vv < vg & vv < vs & vv < vk) {
            System.out.println("Ваш результат" + vv);
        }
        if (vs < vf & vs < vg & vs < vv & vs < vk) {
            System.out.println("Ваш результат" + vs);
        }
        if (vf < vv & vf < vg & vf < vs & vf < vk) {
            System.out.println("Ваш результат" + vf);
        }
        if (vg < vf & vg < vv & vg < vs & vg < vk) {
            System.out.println("Ваш результат" + vg);
        }
        if (vk < vf & vk < vg & vk < vs & vk < vv) {
            System.out.println("Ваш результат" + vk);
        }
        //1. вводит с консоли число N > 0
        //2. потом вводит N чисел с консоли
        //3. выводит на экран максимальное из введенных N чисел.
        System.out.println("вводит с консоли число N > 0");
        System.out.println("потом вводит N чисел с консоли");
        System.out.println("выводит на экран максимальное из введенных N чисел.");

        System.out.println("Введите число");
        int maximum = scanner.nextInt();
        if (maximum > 0) {

                int currentInputNumber = scanner.nextInt();
                if (maximum > currentInputNumber) {
                    System.out.println("Максимальное из введенных чисел: "+maximum);
                } else {
                    System.out.println("Максимальное из введенных чисел: "+currentInputNumber);

            }
        }
    }




    public static class Man {
        public String name;
        public int age;
        public String adress;

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String adress) {
            this.name = name;
            this.age = age;
            this.adress = adress;
        }
    }

    public static class Woman {
        String name;
        int age;
        String adress;

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String adress) {
            this.name = name;
            this.age = age;
            this.adress = adress;
        }
        // Создай public static классы Doga, Cata.
        //Добавь по три поля в каждый класс, на твой выбор.
        //    Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.


        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cata catTom = new Cata("dhdh", 10, 20);
        Doga dogFox = new Doga("Hsss", 10, 20);





        public static class Mouse {
            String name;
            int height;
            int tail;

            public Mouse(String name, int height, int tail) {
                this.name = name;
                this.height = height;
                this.tail = tail;
            }
        }

        public static class Doga {
            String name;
            int height;
            int tail;

            public Doga(String name, int height, int tail) {
                this.name = name;
                this.height = height;
                this.tail = tail;
            }
        }

        public static class Cata {
            String name;
            int height;
            int tail;

            public Cata(String name, int height, int tail) {
                this.name = name;
                this.height = height;
                this.tail = tail;
            }


        }

    }


}


