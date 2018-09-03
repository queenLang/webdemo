import java.util.Random;

/**
 * Created by dllo on 18/4/28.
 */
public class Test2 {
    public static void main(String[] args) {
//        int[] arr1 = {1, 5, 8, 2, 45, 45, 45, 45, 45, 4, 8511, 54, 758};
        //找出数组中的最大值  最小值 平均值
//        double sum = 0;
//        int max = arr1[0];
//        int mix = arr1[0];
//        for (int i = 0; i < arr1.length; i++) {
//            max = max > arr1[i] ? max : arr1[i];
//            mix = mix < arr1[i] ? mix : arr1[i];
//            sum += arr1[i];
//
//        }
//
//        System.out.println("最大值为" + max);
//        System.out.println("最小值为" + mix);
//        System.out.println("平均值" + sum / arr1.length);

        /**
         * 定义数组第三种方式
         * 类型 [] 数组名 = new 类型 [数组长度]
         */
//        int[] arr2 = new int[10];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = i +1;
//            System.out.println(arr2[i]+"");
//        }

      // 生成一个长度为20的随机数组 随机范围20~50
        //取出最大值最小值以及最大值得下标和最小值的下标
        int mixIndeo = 0;
        int maxIndeo = 0;
        //定义两个变量来存放最大值得下标和最小值的下标
        int[] arr3 = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr3[i] = random.nextInt(50 - 20 + 1) + 20;

            System.out.print( arr3[i]+" ");
        }
        for (int i = 0; i < arr3.length; i++) {

            //只要最大值得下标 就能知道最大值为多少
            maxIndeo = arr3[maxIndeo] > arr3[i] ? maxIndeo : i;
            mixIndeo = arr3[mixIndeo] < arr3[i] ? mixIndeo : i;
        }
        System.out.println();
        System.out.println("最大值为" + arr3[maxIndeo]+" "+ maxIndeo);
        System.out.println("最小值为" + arr3[mixIndeo]+ " "+ mixIndeo);
    }
}
