package con.queen;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Main {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str);
        System.out.println(a + 1);
        /**
         * 包装类
         * 包装类是类  不是基本数据类型  只是把基本数据类型封装到一个类中
         * 包装类为我们提供了很多种方法
         */
          //字符转数字
          Integer integer = new Integer("456");
            System.out.println(integer+1);
        //转为float
        System.out.println(integer.floatValue());
        // 数字转字符
        System.out.println(integer.toString()+1);


        System.out.println(integer.toBinaryString(127));
        System.out.println(integer.toOctalString(127));
        //
        Integer integer1 =Integer.valueOf("1314");
        System.out.println(integer1);

        /**
         * 所有包装类
         *装箱
         * 将基本数据类型转化成包装类这一过程叫做自动装箱
         * 实际上是调用了valueOf方法进行转化
         *  Integer i =4;
         *  Integer i  = Integer.valueOf(4);
         *
         * 拆箱
         * 包装类类型的值转换成基本数据类型的过程叫做自动拆箱
         * 实际上是调用了XXX.Value()方法进行转化
         * Integer i =4;
         * Int j = i;
         * Int j = Integer.valueOf()i;
         */

        /**
         * equals ()是判断某个对象是否相同
         * == 判读两个对象的内存地址是否相同
         */


    }
}
