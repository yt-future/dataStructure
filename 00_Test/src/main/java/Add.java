import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: yangteng
 * //https://blog.csdn.net/xiao_chainiao/article/details/81362892
 * @date: 2020/8/26 8:50
 * @description:
 * @version: 1.0
 */
public class Add {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> addList = new ArrayList<>();
        addList.add(5);
        addList.add(6);


        System.out.println(list1.addAll(addList));
        System.out.println(list1.size());
        list1.stream().map((r) -> {
            System.out.println(r);
            return r;
        }).collect(Collectors.toList());

    }
}