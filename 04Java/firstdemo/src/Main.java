/**
 * Created by dllo on 18/4/23.
 */
public class Main {
    public static void main(String[] args) {
        //这是一个单行注释
        /** "v". sout
         *
         *
         * psvm  主函数程序入口
         * 没写完的代码用;结尾
         * 多行注释
         * 复制cmd+c  粘贴 cmd+v
         * 复制一整行 cmd+d  删除一整行 cmd+x
         * cmd+1 显示左侧工区间
         * cmd+shift+上/下 上下移动代码
         * cmd+,弹出设置菜单
         * cmd+q 关闭应用程序
         * shift+f6 更改文件名
         *
         */
        System.out.println("hello java");
        System.out.println("我是输出语句");
        //----------我是华丽的分割线---
        /**
         *基本数据类型
         * 规范 格式要求;
         * 类型 变量名=值;
         *
         * 整型  byte  short  int long 从小到大
         * 浮点型  float double
         * 字符型  char
         * 布尔型  boolean
         *
         *
         *
         * 整型  整数
         * 四个整数区别  长度不同  一般都使用int
         */
        //将1赋值给一个整型变量a
        byte num=1;
        short num2=1;
        int num3=1;
        long num4=1;

        /**
         * 浮点型  小数
         * float 小数后加f
         * flout与double 区别 精度不同 后者精度高
         */
        float a=3.1415926f;

        /**
         * 字符 要用单引号包裹
         */

        char chr = 'a';
        /**
         *
         * 布尔型
         */
        boolean flag1 = true;
        boolean flag2 = false;

        int x =10;
        int y =20;
        System.out.println("x的原值是"+x);
        System.out.println("y的原值是"+y);
        int z = 10;
        int c = 20;
            y=z;
            x=c;


        System.out.println("x的现值是"+x);
        System.out.println("y的现值是"+y);




    }
}
