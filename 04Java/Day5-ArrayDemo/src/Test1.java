/**
 * Created by dllo on 18/4/28.
 */
public class Test1 {
    public static void main(String[] args) {
        /**
         * 数组 :相同类型的数据的组合
         * 定义数组
         * 类型 []数组名 = {元素1,元素2,元素3,....}
         *
         */
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        /**
         *
         * array1[下标]下标就是该元素的位置 其实位置是0
         * array1.length 数组的长度  也就是数组中元素的个数
         */
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        double [] array2 = {1.2,2.2,3.2,4.5};
        char[] array3 = {'a','b','c','d'};
        boolean [] array4 = {true,false,true,false};
        String[] array5 = {"张三","李四","5️"};
        int [] arr = {12, 43, 'A'};

        //改变数组里面的内容
        //eg; array [0] = 23333;

        array1 [0] = 23333;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

