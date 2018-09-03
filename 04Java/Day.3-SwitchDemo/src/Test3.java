/**
 * Created by dllo on 18/4/27.
 */
public class Test3 {
    public static void main(String[] args) {

        /**
         *
         * 循环嵌套
         * for (循环变量初始化;循环条件;自增/自减){
         *     执行语句1
         *
         *     for (循环变量初始化;循环条件;自增/自减){
         *     执行语句2
         *
         * }
         */
//        for (int i = 0; i < 7; i++) {
//
//            for (int i1 = 0; i1 < 7; i1++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //外层控制行数  内层控制列数
//
//        for (int i = 0; i < 5; i++) {
//            for (int i1 = 0; i1 < i + 1; i1++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int i1 = 0; i1 < 5 - i; i1++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 3 - i; i1++) {
                System.out.print("  ");
            }

            for (int i2 = 0; i2 < 2 * i + 1; i2++) {
                System.out.print("*");
            }
            System.out.println();
        }



        }
    }
