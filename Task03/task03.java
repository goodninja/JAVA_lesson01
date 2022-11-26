// 3. Реализовать простой калькулятор

package Task03;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число -> ");
        float a = iScanner.nextFloat();
        System.out.printf("Задайте операцию с числами -> ");
        String operation = iScanner.next();
        System.out.printf("Введите второе число -> ");
        float b = iScanner.nextFloat();

        if (operation.contains("+")) {
            System.out.printf("%.2f + %.2f = %.2f", a, b, a + b);
            System.out.println();
        }
        else if (operation.contains("-")) {
            System.out.printf("%.2f - %.2f = %.2f", a, b, a - b);
            System.out.println();
        }
        else if (operation.contains("*")) {
            System.out.printf("%.2f * %.2f = %.2f", a, b, a * b);
            System.out.println();
        }
        else if (operation.contains("/")) {
            System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
            System.out.println();
        }
        else if (operation.contains(":")) {
            System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
            System.out.println();
        }
        iScanner.close();
    }
}