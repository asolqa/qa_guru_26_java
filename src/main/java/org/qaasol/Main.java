package org.qaasol;

public class Main {
    public static void main(String[] args) {
        byte a = 127;
        byte b = 1;
        // byte c = a + b; недопустимо для byte
        // int допустим
        int c1 = a + b;
        System.out.println("Bytes:");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();

        // Пример переполнения
        byte x = (byte) (127 + 10);
        System.out.println("Overflow example (127 + 10):");
        System.out.println(toBits(x));
        System.out.println(x);
        System.out.println();

        short c = -32767;
        short d = -10;
        // short e = c + d; недопустимо
        // int допустим
        int e1 = c + d;
        System.out.println("Shorts:");
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
        System.out.println();

        // Логические операторы
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("Bools and logic:");
        System.out.println(!bool1);
        System.out.println((a > b) && bool2);
        System.out.println(!(bool1 && bool2));

        if (bool1 || bool2) {
            System.out.println(b++);
            System.out.println(b);
        } else {
            System.out.println(b--);
            System.out.println(b);
        }
        System.out.println();

        // Пример вычислений комбинаций int и double
        int i = 20;
        double dob = 0.025;
        System.out.println("Int and double mix:");
        System.out.println((int)(i + dob));
        System.out.println(i - dob);
        System.out.println(i * dob);
        System.out.println(i / dob);
        System.out.println(i % dob);
        System.out.println();

        // Пример переполнения для int
        try {
            Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    // Двоичное представление разрядов в байте со Stackoverflow
    private static String toBits(byte a) {
        return String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0');
    }
}