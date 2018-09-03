/**
 * Created by dllo on 18/4/27.
 */
public class Test4 {
    public static void main(String[] args) {
        /**
         * do while
         *
         * 语法格式
         * do{
         *
         * }while (条件)
         *
         * while是先判断条件 在执行代码块里的内容
         * do  while 是先执行代码块里的内容  在判断条件
         * 无论条件是否满足  都会执行一次代码块
         */

        //do while 打印100~1

        int a = 100;
        do{
            System.out.println(a);
            a--;
        }while (a>0);
    }
}
