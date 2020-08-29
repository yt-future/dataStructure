import java.time.temporal.Temporal;

/**
 * @author: yangteng
 * @date: 2020/8/10 11:34
 * @description: 冒泡排序
 * 1.空间复杂度为 O(1)，是一个原地排序算法。
 * 2.是稳定的排序算法
 * 3.时间复杂度 最好O(n) 最坏O(n^2) 平均
 * @version: 1.0
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        int length = arr.length;
        //数组为空
        if(length <= 1) {
            return null;
        }

        for(int i = 0;i < length; i++) {
            for (int j = i; j < length ; j++) {
               if(arr[i] > arr[j]) {
                   /*int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;*/
                   arr[i] ^= arr[j];
                   arr[j] ^= arr[i];
                   arr[i] ^= arr[j];
               }
            }
        }
        return arr;
    }
}