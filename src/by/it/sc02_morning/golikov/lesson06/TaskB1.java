package by.it.sc02_morning.golikov.lesson06;
/*
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно тоже учитываться в сумме.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
*/

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;

// с помощью цикла do While
//
//        do {
//            num = sc.nextInt();
//            sum = sum + num;
//        } while (num != -1);
//        System.out.println(sum);

        for (num = 0; num != -1; ) {
            num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println(sum);
    }
}

