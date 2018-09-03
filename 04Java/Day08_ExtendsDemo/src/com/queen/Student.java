package com.queen;

/**
 * Created by dllo on 18/5/4.
 */
public class Student extends Person {

    //全局定量
    public static final double NUM = 3.1415926;



    private int num;
    // 方法重载 (在同一个类)
    // 方法名相同 参数列表不同
    //参数个数不同||顺序不同||类型不同
    public void studyChinese(){
        System.out.println("唧唧复唧唧");

    }
    public void studyMath(int a,int b){
        System.out.println(a+b );
    }
    //public void song(){
     //   System.out.println("我会唱歌");
   // }



    //复写(重写)子类中定义父亲的同名方法


    @Override
    public void speak() {
        super.speak();
        System.out.println("我会唱歌");
    }

    /**
     *
     * this 代表本类的东西
     * super 代表父类的东西
     * super (参数...)父类的构造方法
     * super.方法名 父类的方法
     * @param name
     * @param sex
     * @param age
     */

    public Student(String name, String sex, int age) {
        super(name, sex, age);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
