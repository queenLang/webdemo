import java.util.Scanner;

/**
 * Created by dllo on 18/4/25.
 */
public class Lianxi {
    public static void main(String[] args) {
        /**
         *
         * 输入四个数 按照从小到大的顺序排序
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数字");
        int c = scanner.nextInt();
        System.out.println("请输入第四个数字");
        int d = scanner.nextInt();
        int tap = 0 ;

        if (a > b){
            tap = a;
            a = b;
            b = tap;
        }
        if (b > c){
            tap = b;
            b = c;
            c = tap;
        }
        if (c > d){
            tap = c;
            c = d;
            d = tap;
        }


        if (a > b){
            tap = a;
            a = b;
            b = tap;
        }
        if (b > c){
            tap = b;
            b = c;
            c = tap;
        }

        if (a > b){
            tap = a;
            a = b;
            b = tap;
        }

        System.out.println(a + ""+b+""+c+""+d);





    }
}
