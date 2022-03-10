package ru.scary_little_green_man.introduction;

public class Main {
    public static void main(String[] args) {
        //Переменные
        System.out.println("Ы!");
        int a1 = 20; //обычное объявдение переменных
        float b1;
        b1 = 2.5f;
        final int aFinal = 25; //final

        //динамическая инициализация
        float radius = 2.0f, height = 5.4f;
        float volume = 3.14f * radius * height;
        System.out.println("объем цилиндра равен " + volume);

        //инициализация в одну строку
        int x, y, z; //так делать не труъ!
        x = y = z = 11;
        float d = 2.5f, e = 5.7f;

        //арифметические операции
        int a = 10;
        int b = 20;
        int c = (a + b + 9) * 3;
        System.out.println("c= " + c);

        System.out.println("a= " + a);
        a++;
        System.out.println("a++ = " + a);
        a--;
        System.out.println("a-- = " + a);
        a += 10; //увеличить значние на 10
        System.out.println("a+=10 = " + a);
        a *= 2; //умножить значение на 2
        System.out.println("a*= = " + a);
        a /= 4; //разделить значение на 4
        System.out.println("a/=4 = " + a);
        b = a + 11;
        System.out.println("bNew = " + b);

        a = 128;
        System.out.println("a= " + a);
        b = a / 2;
        System.out.println("b= a/2 " + b);

        //условный оператор if
        if (5 < 10) {
            System.out.println("5 таки меньше 10");
        } else {
            System.out.println("you newer see that");
        }

        a = 2;
        b = 3;
        c = 0;
        if (a < b) {
            System.out.println("a меньше b");
        }
        if (a == b) {
            System.out.println("you newer see that");
        }

        c = a - b;
        if (c > 0) {
            System.out.println("c не отрицательно");
        } else {
            System.out.println("c отрицательно");
        }

        c = b - a;
        if (c > 0) {
            System.out.println("c не отрицательно");
        } else {
            System.out.println("c отрицательно");
        }

/*        сложные условия:
        if (условие1 && условие2) {        }
        if (условие1 || условие2) {        }
        if ((условие1 && условие2) || условие3) {        }*/

        //методы
        System.out.println("draw a cat!");
        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                "        .''        ,      ``..'(/-<\n" +
                "       /   _      {      )         \\\n" +
                "      ;   _ `.     `.   <         a(\n" +
                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                "    `. `-' /-._)))      `-._)))\n" +
                "      `...'         ");

        drawCat();
        drawCat();
    }

        public static void drawCat(){
            System.out.println("draw a cat from method!");
            System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                    "        .''        ,      ``..'(/-<\n" +
                    "       /   _      {      )         \\\n" +
                    "      ;   _ `.     `.   <         a(\n" +
                    "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                    "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                    "    `. `-' /-._)))      `-._)))\n" +
                    "      `...'         ");
        }

    }

