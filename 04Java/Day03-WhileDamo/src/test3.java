import java.util.Scanner;

/**
 * Created by dllo on 18/4/27.
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生年份");
        int year =scanner.nextInt();
        System.out.println("请输入您的出生月份");
        int month =scanner.nextInt();
        System.out.println("请输入您的出生日份");
        int date =scanner.nextInt();
        int day = 0;
        int leapyear = 0;
        int i = 0;
        switch(month){
            case 1: day+=31 ;
            case 2: leapyear=year%4==0&&year%100!=0||year%400==0?29:28;
                day+=leapyear ;
            case 3: day+=31 ;
            case 4: day+=30 ;
            case 5: day+=31 ;
            case 6: day+=30 ;
            case 7: day+=31 ;
            case 8: day+=31 ;
            case 9: day+=30 ;
            case 10: day+=30 ;
            case 11: day+=30 ;
            case 12: day+=31 ;
                i=year;int o =0;
                while(i<2018) {
                    i++;
                    if(year%4==0&&year%100!=0||year%400==0) {
                        o++;
                    }
                }
                System.out.print("您一共活了");
                System.out.println("出生月份到年底"+day);
                System.out.println("减去出生日期"+date);
                System.out.println("闰年天数"+o);
                System.out.println("出生到2018年期间年份和"+(2017*365-year*365));
                System.out.println("2018年天数146");
                int m1 =day -date;
                int m2 =o+2017*365-year*365+146;

                System.out.println(m1+m2);

        }
    }

}


