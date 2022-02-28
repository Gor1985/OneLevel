package fibonachi;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonachiCikle {
    static int pop(int a){
        return a*pop(a);
    }
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int pp;
        System.out.println(a);
        System.out.println(b);

       // for (int i = 0; i < pop(10); i++) { c использованием памяти
        for (int i = 0; i < 10; i++){// сокращаем использование памяти и цикл работает
            pp = a + b;
            System.out.println(pp);
            a = b;
            b = pp;
        }
    }
}

