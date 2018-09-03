import java.util.Random;
import java.util.Scanner;

/**
 * Created by dllo on 18/4/27.
 */
public class Test1 {
    public static void main(String[] args) {
        /**
         * for循环
         * 语法:
         * for (循环变量初始化;循环条件;自增/自减){
         *     代码块
         * }
         */
//        for(int i = 1;i<101; i++){
//            System.out.println(i);
//        }
//
//
//        int i = 1;
//        while(i <101){
//            System.out.println(i);
//            i++;
//        }
        /** 用户输入一个小值  一个大值
         * 随机生成20个范围在小值~大值之间的整数
         * 计算 这些值中的奇数和  以及偶数的和
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个小值");
//        int mix = scanner.nextInt();
//        System.out.println("请输入一个大值");
//        int max = scanner.nextInt();
//        int a = 0;
//        int b = 0;
//        Random random = new Random();
//        for (int i = mix; i < max; i++) {
//            int num = random.nextInt(max - mix + 1) - mix;
//            if (num % 2 == 0) {
//                a += num;
//            } else if (num % 2 != 0) {
//                b += num;
//            }
//        }
//        System.out.println("奇数和为" + b);
//        System.out.println("偶数和为" + a);

        Scanner scanner = new Scanner(System.in);

        System.out.println("输入工资");
        int salary = scanner.nextInt();
        int num2 = salary - 3500;
        double sum2 = 0;
        if (num2 <= 0){

        }else if (num2 <=1500 ){
            sum2 = num2 * 0.03 -0;

        }else if (num2 <=4500){
            sum2 = num2 * 0.1 - 105;

        }else if (num2 <=9000){
            sum2 = num2 * 0.2 - 555;

        }else if (num2 <=350000){
            sum2 = num2 * 0.25 -1005;

        }else if (num2 <=55000){
            sum2 = num2 * 0.3 - 2755;

        }else if (num2 <=80000){
            sum2 = num2 * 0.35 -5505;

        }else {
            sum2 = num2 * 0.45 - 13505;

        }

        System.out.println("应缴纳的个人所得税"+sum2);





    }
}
