import java.util.Scanner;

/**
 * Created by dllo on 18/4/25.
 */
public class Test1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入出生年份");
//        int year = scanner.nextInt();
//        if (year >1990){
//            int age =2018- year;
//            if (age>18){
//                System.out.println("您已成年");
//            }else{
//                System.out.println("qq");
//            }
//        }else {
//            System.out.println("请输入正确");
//        }
//
//        /**
//         * 三木运算符 简化if ..else
//         * 语法格式;
//         * 判断条件? true的情况: false的情况
//         */
//        String result = 5>0? "5确实大于0":"你傻";
//        System.out.println(result);

//        /**输入三个数字 打印出最大值  最小值1
//         *
//         */
//      //方式1
//        int max ;
//        Scanner scanner1 =new Scanner(System.in);
//        System.out.println("请输入数字a");
//        int a  = scanner1.nextInt();
//        System.out.println("请输入数字b");
//        int b = scanner1.nextInt();
//        System.out.println("请输入数字c");
//        int c  = scanner1.nextInt();
//        if (a>b ){
//            max = a ;
//           }else{
//              max = b;
//        }
//        if (max>c ){
//            System.out.println("最大值是"+max);
//        }else{
//            System.out.println("最大值是"+c );
//        }
//
//
////方式2
//        max = a>b ?a:b;
//        max = max> c ? max : c ;
//        System.out.println("最大值"+ max);


//输入3个数 判断能否组成三角形
        /**
         * 两边之和大于第三边  两边之差小于第三边
         * 直角三角形
         * a^2+b^2= c^2
         */

        int max;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner1.nextInt();
        System.out.println("请输入第二个数字");
        int b = scanner1.nextInt();
        System.out.println("请输入第三个数字");
        int c = scanner1.nextInt();
        max = a>b ?a:b;
        max = max> c ? max : c ;
        int min = a <b ?a :b ;
        min = min <c ?min:c;
//        if (a+ b+ c > max + max){
//            System.out.println("能组成三角形");
//        }else {
//            System.out.println("不能组成三角形");
//        }

        String isTriangle =a+ b+ c -max>max?"是三角形":"不是三角形";
        System.out.println(isTriangle);
        String isRightriangle =min *min +(a+b+c-min-max)*(a+b+c-min-max)==max*max?"是直角三角形":"不是直角三角形";
        System.out.println(isRightriangle);

    }
}
