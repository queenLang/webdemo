import java.util.Random;
import java.util.Scanner;

/**
 * Created by dllo on 18/4/26.
 */
public class Test1 {
    public static void main(String[] args) {
        /**
         * 循环语句
         *
         * while循环
         * 语法格式
         * while (条件){
         *     执行代码
         * }
         * 当条件为true时执行{}里面的内容
         * 为false跳出循环
         * 注意
         * 必须要有条件为false的情况 否则就变成死循环
         */
        //输出1~100
//        int a =0;
//        while (a <100 ) {
//            a++;
//            if (a % 2 == 0) {
//                System.out.println(a);
//            }
//        }

        //利用循环随机生成20个10~到50之间的数字
//        int a = 0;
//        Random random = new Random();
//        while (a<20){
//            a++;
//            //生成某一范围内的随机整数公式
//            //random.nextInt(最大值-最小值+1)+最小值
//            int num = random.nextInt(50-10+1)+10;
//            System.out.println(num);
//        }
//        //敲七游戏
//          //1~100之间不能打印含有7的数字或者7的倍数
//
//        int b =0;
//        while (b<100){
//            b++;
//            if (b % 7!= 0&& b % 10 != 7 && b / 10 !=7){
//                System.out.println(b);
//            }
//        }
        //用户输入一个年份 判断输入的年份 至2018年之间有哪些年是闰年
        //打印出来并计算那些年是闰年
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入年份");
//        int year = scanner.nextInt();
//         int a = 0;
//        while (year<2019){
//           year++;
//            if( year % 4 ==0 && year % 100 !=0 ||year % 400 ==0){
//                a++;
//                System.out.println(year);
//            }
//
//        }
//        System.out.println("共有"+a+"个");


        //生成30个10~100随机数  打印最大值最小值  平均值
        int max = 0;
        int mix = 100 ;
        double sum = 0;
        int b =0;
        Random randome = new Random();
        while (b<30){
            int num = randome.nextInt(100-10+1)+10;
//            sum = sum + num;
//            b ++;
//            if (num>max) {
//                max = num;
//            }
//            if (num<mix){
//                mix = num;
//            }

            System.out.print(num+" ");
            max = max > num ? max :num;
            mix = mix < num ? mix : num;
            sum += num;
            b++;
        }

        System.out.println("最大值为"+max);
        System.out.println("最小值为"+mix);
        System.out.println("平均值"+sum/30);


    }
}
