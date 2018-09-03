import java.util.Scanner;

/**
 * Created by dllo on 18/4/25.
 */
public class Main {
    public static void main(String[] args) {
        /**
         *
         *
         * 分支语句
         * 逻辑判断  无论语句多么复杂 结果只有两种
         * true false
         * 最基本的分支结构
         * 语法;
         * if(判断调节){
         *     执行操作;
         * }
         * 当判断条件为true 才执行
         * 小括号里面为条件语句
         */
//        boolean flag = true ;
//        if (flag){
//            System.out.println("hahaha");
//        }
        /**
         *
         * =是赋值符合
         * ==是判断左右两边是否相等
         * <
         * >
         * <=
         * >=
         * !=不等于
         * && 与
         */
        /**
         * 用户输入一个年份 判断该年是否为闰年
         * 闰年判断条件 可以被4整除 但是不能被100整除 可以被400整除
         * 用户输入一个数字  判断是否为奇数
         */


        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 =num1%2;
        if (num2==0) {
            System.out.println("为偶数");
        }else{
            System.out.println("为奇数");
        }
            /**
             * 分支语句的第二种形式
             * 语法;
             * if (条件表达式){
             *     条件为true的时候执行
             * }else{
             *     条件为false的时候执行
             * }
             *
             */
            //判断字符串是否相等 不使用==符合
        //使用equals判断
        String name= "张三";
        if (name.equals("张三")){
            System.out.println("恭喜");
        }else {
            System.out.println("错了");
        }
        /**
         * 分支语句第三种形式
         * 语法:
         * if(条件1){\
         *
         * }else  if(条件2){
         *
         * }else  if(条件3){
         *
         * }....
         * else if(条件4){
         *
         * }else{
         *
         * }
         */
        int core = 2 ;
        if (core==1){
            System.out.println("out");
        }else if (core==2){
            System.out.println("h");
        }else if (core==4){
            System.out.println("q");
        }else if (core==8){
            System.out.println("w");
        }else {
            System.out.println("1");
        }

        System.out.println("请输入年份");
        Scanner scanner2 =new Scanner(System.in);

        /**
         * && 与 若&&左右两边都为true 则结果为true
         * || 或  若 ||左右两边只要有一个为true 则结果为true都为false 结果为false
         * ! 非  若判断条件为true
         */






























    }
}
