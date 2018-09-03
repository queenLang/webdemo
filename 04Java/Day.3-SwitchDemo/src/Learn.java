/**
 * Created by dllo on 18/4/27.
 */
public class Learn {
    public static void main(String[] args) {

//        double hight = 100;
//        double sum =  100;
//        for (int i = 0; i < 10; i++) {
//
//            hight /= 2;
//            sum += hight * 2 ;
//        }
//        System.out.println("第10次的高度是"+ hight);
//        System.out.println("经过的高度是"+ (sum-hight));

        //猴子吃桃
//        int sum =  1;
//        for (int i = 0; i < 9; i++) {
//            sum = (sum + 1)* 2;
//
//        }
//        System.out.println(sum);
        //一个数如果恰好等于它的因子之和,这个数就成为”完数”.例如 6 = 1 + 2 + 3,找出1000以内的所有完数.
        //28  4 7  2 12  1  28
        // 有1,2,3,4四个数字,问这4个数字能组成多少个互不相同且无数字重复的三位数?都是多少?
//        int count = 0;
//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j < 5; j++) {
//                for (int k = 1; k < 5; k++) {
//                    if (i != j && j != k && i != k) {
//                        int sum = i * 100 + j * 10 + k;
//                        count++;
//                        System.out.println("数字有" + sum);
//                    }
//                }
//            }
//        }
//        System.out.println("一共有" + count + "个数字");
        // 一个数如果恰好等于它的因子之和,这个数就成为”完数”.
        // 例如 6 = 1 + 2 + 3,找出1000以内的所有完数.

        for (int i = 1; i <= 1000; i++) {
            // 定义一个变量存放因子之和
            int a = 0;
            for (int j = 1; j < i; j++) {
                // i%j==0代表j是i的因子i
                if (i % j ==  && i % j == ) {
                    a += j;
                }
            }
            // 如果因子之和与i值相等 输出结果
            if (a == i) {
                System.out.println("完数有" + i);
            }
        }
        }
    }

