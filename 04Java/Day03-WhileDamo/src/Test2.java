import java.util.Random;

/**
 * Created by dllo on 18/4/26.
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         *
         * 找出100~1000之间的水仙花数
         * 水仙花数 abc = a^3 + b^3 + c^3
         */

        int a = 0;
        int b = 0;
        int c = 0;
        int num2 = 100;
        while (num2<1000){

            a = num2 / 100;
            b = num2 % 100/10;
            c = num2 % 100%10;
            if (num2 == a * a * a + b * b * b + c * c * c ){
                System.out.println(num2);
        }

            num2++;
        }

    }
}
