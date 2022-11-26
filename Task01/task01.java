// 1. Вычислить n-ое треугольное число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Task01;

import java.math.BigInteger;
import java.util.Scanner;

public class task01 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print ("Введите число n: ");
        int n = in.nextInt();
        in.close ();
        int sum = 0;
        int multiplication_smallnums = 1;                     
        BigInteger multiplication_bignums = BigInteger.ONE; 
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            multiplication_smallnums = multiplication_smallnums * i;                             
            multiplication_bignums = multiplication_bignums.multiply(BigInteger.valueOf(i)); 
        }
        System.out.printf ("Сумма чисел от 1 до n = %d \n", sum);
        System.out.printf ("Произведение чисел от 1 до n (малые значения -> n < 13) = %d \n", multiplication_smallnums);
        System.out.printf ("Произведение чисел от 1 до n (большие значения) = %d \n", multiplication_bignums);
    }
}
