// 2. Вывести все простые числа от 1 до 1000

package Task02;

public class task02 {
    public static void main(String[] args) {
        
        System.out.print("Все простые числа от 1 до 1000 ->\n");
        
        for (int i = 2; i <= 1000; i++) {          
            boolean correspondence = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    correspondence = false;
                    break;
                }
            }
            if (correspondence) {

                System.out.print(i + ", ");
            }
        }
    }
}