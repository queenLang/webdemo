import java.util.Scanner;

/**
 * Created by dllo on 18/4/26.
 */
public class Test2 {
    public static void main(String[] args) {
        //输入年份和月份  输出该月的天数
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        int year = scanner.nextInt();
        System.out.println("输入月份");
        int month = scanner.nextInt();
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                String day = isLeapYear ? "29天" : "28天";
                System.out.println(day);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            default:
                System.out.println("输入有问题");
                break;


    }
    //输入年份 月份  日期 判断该日期是这一年的第多少天
}
}
