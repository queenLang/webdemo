import java.util.Random;

/**
 * Created by dllo on 18/4/28.
 */
public class Lian {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] arr = new int[20];
//        int j = 0;
//        int n = 0;
//        System.out.println("原数组");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(50 - 10 + 1) + 10;
//            System.out.print(arr[i] + " ");
//        }
//        for (int i1 = 0; i1 < 20; i1++) {
//            if (arr[i1] >= 20 && arr[i1] <= 30) {
//                j++;
//
//            }
//
//        }
//        int[] arr1 = new int[j];
//        for (int i3 = 0; i3 < 20; i3++) {
//            if (arr[i3] >= 20 && arr[i3] <= 30) {
//                arr1[n] = arr[i3];
//                n++;
//            }
//        }
//        System.out.println();
//        System.out.println("新数组元素");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//

//现在有如下一个数组：int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
// 要求将以上数组中的0项去掉，将不为0的值存入一个新的数组，
// 生成新的数组为:int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5};


        int oldArr[] = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
        int n = 0;
        System.out.println("原数组元素");
        for (int i = 0; i < oldArr.length; i++) {
            System.out.print(oldArr[i]+" ");
            if (oldArr[i] != 0) {
                n++;
            }
        }
        int newArr[] = new int[n];
        n = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                newArr[n] = oldArr[i];
                n++;
            }
        }
        System.out.println();
        System.out.println("新数组元素");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}