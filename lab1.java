import java.io.PrintStream;
import java.util.Scanner;
public class lab1 {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Считывание 5 натуральных чисел из консоли
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int countHole = 0; // инициализация счетчика подходящих отверстий
        if (X<=A) {
            countHole+=1; // если (X<=A), то countHole++ . Если же нет, до далее условия проверятся не будут, счетчик выведет 0.
            if (X<=B) {
                countHole+=1; // если (X<=B), то countHole++ . Если же нет, до далее условия проверятся не будут, счетчик выведет 1.
                if (X<=C) {
                    countHole+=1; // если (X<=C), то countHole++ . Если же нет, до далее условия проверятся не будут, счетчик выведет 2.
                    if (X<=D) {
                        countHole+=1; // если (X<=D), то countHole++ . Если же нет, до далее условия проверятся не будут, счетчик выведет 3.
                    }
                }
            }
        }
        out.print(countHole); // вывод результата(количества отверстий, через которые прошел шар)
    }
}
