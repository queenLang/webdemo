package con.collection;

import con.queen.BlackPerson;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}0
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
         * 泛型 T
         * 不确定具体的类型
         */
        int a = 123;
        Num<Integer> num = new Num<>();
        num.setT(a);
        System.out.println(num.getT());

        String b = "wwwww";
        Num<String> num1 = new Num<>();
        num1.setT(b);
        System.out.println(num1.getT());

        BlackPerson blackPerson = new BlackPerson();
        blackPerson.setName("布鲁斯");

        Num<BlackPerson> num2 = new Num<>();
        num2.setT(blackPerson);
        System.out.println(num2.getT().getName());
    }
}