import entity.ArrayStack;

/**
 * @author: yangteng
 * @date: 2020/8/7 14:24
 * @description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {

    }

    public static void test0() {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push("a");
        arrayStack.push("b");
        arrayStack.push("c");
        arrayStack.push("d");
        arrayStack.push("e");
        arrayStack.push("f");
        System.out.println(arrayStack.toString());
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        System.out.println(arrayStack.toString());
    }
}