import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author: yangteng
 * @date: 2020/8/11 13:30
 * @description: 插入排序
 * @version: 1.0
 */
public class insertionSort {

    public static void main(String[] args) {
    /*    List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            integers.add(i);
        }
        List<String> copy = new ArrayList<>();

        integers.parallelStream().forEach(i -> copy.add(i.toString()));

        System.out.println(copy);*/


        CopyOnWriteArrayList<Integer> integers2 = new CopyOnWriteArrayList();

        for (int i = 0; i < 20 ; i++) {
            integers2.add(i);
        }

        
        List<String> copy2 = new ArrayList<>();

        integers2.parallelStream().forEach(i -> copy2.add(i.toString()));

        System.out.println(copy2);
    }

   /* public static int[] sort(int[] arr) {

    }*/
}