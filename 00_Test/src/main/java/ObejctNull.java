import entity.Person;


/**
 * @author: yangteng
 * @date: 2020/8/29 9:00
 * @description:
 * @version: 1.0
 */
public class ObejctNull {
    public static void main(String[] args) {
        Person p = new Person(1L,"哈哈");

        //Object

        System.out.println(p.toString());
    }
}