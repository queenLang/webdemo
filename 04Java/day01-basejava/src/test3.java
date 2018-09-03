import java.util.Scanner;

/**
 * Created by dllo on 18/4/24.
 */
public class test3 {
    public static void main(String[] args) {

        /**
         *  用户输入4个数值 a b c d  1 2 3 4 不要输入0
         *  计算并打印出
         *  ab + cd
         *  ba * dc
         *  ac / bd(要有小数)
         *  db % ac
         *  a++ + b++ + c-- + d--
         *  a++ + ++b + --c + --d
         *
         *  a的平方 + b的立方 + c的四次方 + d的五次方
         *  ab的平方 + cd的平方
         *
         *
         *  189块钱 如何利用最少的100元 50元 20元 10元 5元 1元 组成
         *  (取余)
         *
         */
        System.out.println("请输入数字a");
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt() ;
        System.out.println("请输入数字b");
        int b = scanner.nextInt() ;
        System.out.println("请输入数字c");
        int c = scanner.nextInt() ;
        System.out.println("请输入数字d");
        int d = scanner.nextInt();
        int num1 = a * 10 + b;
        int num2 = c * 10 + d;
        System.out.println("ab+cd=");
        System.out.println(num1 + num2);
        int num3 = b * 10 + a;
        int num4 = d * 10 + c;
        System.out.println("ba*dc=");
        System.out.println(num3 * num4);
        int num5 = a * 10 + c ;
        float num6 = b * 10 + d ;
        float value;
        value = num5 / num6;
        System.out.println("ac/bd="+value);
        int num7 = d * 10 + b ;
        int value1;
        value1 = num7 % num5 ;
        System.out.println("db%ac="+value1);
        System.out.println("a++ + b++ + c-- + d--="+((a++)+(b++)+(c--)+(d--)));










    }
}
