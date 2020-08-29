import java.util.Arrays;

/**
 * @author: yangteng
 * @date: 2020/8/10 13:20
 * @description:
 * @version: 1.0
 */
public class Run {

    public static void main(String[] args) {
        int[] arr = new int[]{6,5,9,8,6,7,4};
        int[] sort = BubbleSort.sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}