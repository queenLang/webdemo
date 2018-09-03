import java.util.Scanner;

/**
 * Created by dllo on 18/4/26.
 */
public class L1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        int year = scanner.nextInt();
        System.out.println("输入月份");
        int month = scanner.nextInt();
        System.out.println("输入日期");
        int date = scanner.nextInt();
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        switch (month - 1) {
//            case 1:
//                date = date;
//                break;
//            case 2:
//                date += 31;
//                break;
//            case 3:
//                date += 31+28;
//                break;
//            case 4:
//                date += 31+28+31;
//                break;
//            case 5:
//                date += 31+28+31+30;
//                break;
//            case 6:
//                date += 31+28+31+30+31;
//                break;
//            case 7:
//                date += 31+28+31+30+31+30;
//                break;
//            case 8:
//                date += 31+28+31+30+31+30+31;
//                break;
//            case 9:
//                date += 31+28+31+30+31+30+31+31;
//                break;
//            case 10:
//                date += 31+28+31+30+31+30+31+31+30;
//                break;
//            case 11:
//                date += 31+28+31+30+31+30+31+31+30+31;
//                break;
//            case 12:
//                date += 31+28+31+30+31+30+31+31+30+31+30;
//                break;

            case 11:
                date += 30;
            case 10:
                date += 31;
            case 9:
                date += 30;
            case 8:
                date += 31;
            case 7:
                date += 31;
            case 6:
                date += 30;
            case 5:
                date += 31;
            case 4:
                date += 30;
            case 3:
                date += 31;
            case 2:
                date += isLeapYear ? 29 : 28;
            case 1:
                date += 31;
            case 0 :
                date = date;
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        // date = isLeapYear && month > 2 ? ++date : date;
        System.out.println("是该年的第" + date + "天");

    }
}



