package by.it.sc02_morning.safronov.lesson06;

/*
Введите положительное число n с клавиатуры (допускаются числа от 0 до 62).

Выведите все степени двойки от 0-й до n-й.

Ограничение:
1) Операции умножения и возведения в степень в этой задаче запрещаются.
2) Двоичное представление числа должно формироваться до вывода в консоль.

Вывод сделайте в формате
двоичное число = десятичное число.
ВАЖНО! Разрядность двоичного числа должна быть равна n

Пример.

Ввод:
16
Ожидаемый вывод:
00000000000000001 = 1
00000000000000010 = 2
00000000000000100 = 4
00000000000001000 = 8
00000000000010000 = 16
00000000000100000 = 32
00000000001000000 = 64
00000000010000000 = 128
00000000100000000 = 256
00000001000000000 = 512
00000010000000000 = 1024
00000100000000000 = 2048
00001000000000000 = 4096
00010000000000000 = 8192
00100000000000000 = 16384
01000000000000000 = 32768
10000000000000000 = 65536

Ввод:
6

Вывод:
0000001 = 1
0000010 = 2
0000100 = 4
0001000 = 8
0010000 = 16
0100000 = 32
1000000 = 64

*/

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //требуемое число повторений, возведений в степень
        int i;                //фиктическое число прогонов
        long n=1;              //исходная 2

        for(i=0;i<=k;i++){
        String z="";
        for (int j=0;j<=(k-Long.toBinaryString(n).length());j++){
            z=z+"0";
        }
String bin=Long.toBinaryString(n);
            bin=z+bin;
            System.out.println(bin+" = "+n);
//            System.out.println(Integer.toBinaryString((int)n)+"="+n) ;
            n=n<<1;
        }
    }
}
