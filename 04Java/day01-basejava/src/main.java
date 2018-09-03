/**
 * Created by dllo on 18/4/24.
 */
public class main {
    public static void main(String[] args) {
        /**
         *
         * idea 会将没有使用的变量变成灰色
         */
        int x=10;
        int y=20;
        System.out.println("x的原值是"+x);
        System.out.println("y的原值是"+y);
        //定义一个中间变量
        int temp = 0;
        temp = x;
        x = y;
        y =temp;
        /**
         * 30= 10 + 20
         * 20= 30 - 10
         * 10= 30 - 20
         */

        //优化方式
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println("变化后x的值"+x);
        System.out.println("变化后y的值"+y);

        /**
         * 标识符命名规范
         * 1 可以由数字 字母 下划线 美元符号$ 组成 但不能以数字开头
         * 2 不可以重复命名
         * 3 见名知意 (不允许使用拼音 都用英文)
         * 4 不能使用系统保留关键字
         * 5 驼峰规则 第一单词都小写 其余单词的首字母都大写
         * eg. getMaxValue
         */
        int getMax = 10;
    }
}
