import java.util.Scanner;

/**
 * Created by dllo on 18/4/26.
 */
public class Test1 {
    public static void main(String[] args) {
        /**
         * swich case 语句
         *  语法格式:
         *  switch (要判断的变量){
         *      case 参数1:
         *      执行语句
         *      break;
         *      case 参数2:
         *      执行语句
         *      break;
         *      ...
         *      default:
         *      执行的语句
         *      break;
         *  }
         */

        /**
         * 输入一个数字 判断该数字所代表的星期
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("是星期一");
                break;
            case 2:
                System.out.println("是星期二");
                break;
            case 3:
                System.out.println("是星期三");
                break;
            case 4:
                System.out.println("是星期四");
                break;
            case 5:
                System.out.println("是星期五");
                break;
            case 6:
                System.out.println("是星期六");
                break;
            case 7:
                System.out.println("是星期日");
                break;
            default:
                System.out.println("sorry");
                break;
        }
        /**
         * break 代表跳出关键字  只有遇见break就会停止该代码块
         */
        /**
         * 用户输入m 则打印男性
         * 输入f 则打印女性
         * 输入其他则随意发挥
         */
        String sex = scanner.nextLine();
        switch (sex) {
            case "f":
                System.out.println("是女生");
                break;
            case "m":
                System.out.println("是男生");
                break;
            default:
                System.out.println("sorry");
                break;
        }


         char s = 'f';
        switch (s) {
            case 'f':
                System.out.println("是女生");
                break;
            case 'm':
                System.out.println("是男生");
                break;
            default:
                System.out.println("sorry");
                break;
        }

            /**
             * switch 限制条件
             * 只能判断 数字 byte short int 字符串 字符 (包装类 枚举类)
             * 不能够对某一范围进行判断  判断的具体内容
             */


    }
}
