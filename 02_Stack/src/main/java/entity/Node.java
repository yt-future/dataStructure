package entity;

/**
 * @author: yangteng
 * @date: 2020/8/3 20:21
 * @description:
 * @version: 1.0
 */
public class Node {
    public int data;
    public Node next;
    public Node pre;

    public Node() {};
    public Node(int data) {this.data = data; };

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                ", pre=" + pre +
                '}';
    }
}