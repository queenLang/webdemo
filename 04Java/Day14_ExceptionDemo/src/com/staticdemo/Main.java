package com.staticdemo;

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
        /**
         *
         * static 静态
         * 使用场景
         * 1.修饰成员变量
         * 2.修饰方法
         * 3.静态代码块{}
         * 4.修饰类(内部类)
         *
         *
         */

        //静态的成员变量
        // 直属于类 不属于单个对象
        //多个对象共享数据

//        System.out.println(Person.name);
//
//        Person person = new Person();
//        person.name = "李四";
//        System.out.println(person.name);

        /**
         * 静态方法
         * 格式:类名.方法名()
         * 直属于类  共享
         */
        /**
         *
         * 静态代码块中 若想使用外部边变量  那么该变量必须也是静态的
         * 静态代码块中可以定义普通的局部变量
         *
         *
         * 总结:只要是静态代码块中使用外部的东西  这个东西必须也是静态的
         */

//        Person.speak();
        new Traffic();
        /**
         * 静态代码块执行顺序 优先于成员变量初始化 优先于构造方法初始化
         */
    }
}
