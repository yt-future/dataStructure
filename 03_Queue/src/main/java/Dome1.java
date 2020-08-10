import entity.ArrayQueue;

/**
 * @author: yangteng
 * @date: 2020/8/8 10:21
 * @description:
 * @version: 1.0
 */
public class Dome1 {
    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(10);
        //入队
        arrayQueue.enqueue("a");
        arrayQueue.enqueue("b");
        arrayQueue.enqueue("c");
        arrayQueue.enqueue("d");
        arrayQueue.enqueue("e");
        arrayQueue.enqueue("f");
        arrayQueue.enqueue("g");
        arrayQueue.enqueue("h");
        arrayQueue.enqueue("i");
        arrayQueue.enqueue("j");
        System.out.println(arrayQueue.toString());
        //出队
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        System.out.println(arrayQueue.toString());
        //优化入队
        arrayQueue.enqueueOptimised("k");
        arrayQueue.enqueueOptimised("l");
        arrayQueue.enqueueOptimised("m");
        arrayQueue.enqueueOptimised("n");

        System.out.println(arrayQueue.toString());
    }
}