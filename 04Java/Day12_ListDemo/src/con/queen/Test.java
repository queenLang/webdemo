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
public class Test {
    public static void main(String[] args) {
        /**
         *
         * 多态
         *
         * 1 继承
         * 2.复写
         * 3.父类引用指向子类对象
         */

        Person black = new BlackPerson();
        Person yellow = new YellowPerson();
        Person white = new WhitePerson();
        black.speak();
        white.speak();
        yellow.speak();
        //强制类型转换
        BlackPerson blackPerson = (BlackPerson) black;
        blackPerson.speak();

    }
}
