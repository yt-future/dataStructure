package utils;

import entity.Node;

/**
 * @author: yangteng
 * @date: 2020/8/6 15:38
 * @description:
 * @version: 1.0
 */
public class NodeUtils {

    /**
     * 创建一个单链表
     */
    public static Node createLink() {
        Node head = new Node(1);
        for (int i = 2; i < 10; i++) {
            //创建临时结点，引用首结点
            Node temp = head;
            //创建新节点
            Node node = new Node(i);
            //循环将temp指向最后一个结点
            while(true) {
                if(temp.next == null) {
                    break;
                }
                temp = temp.next;
            }
            //再将该结点接在最后一个结点后面
            temp.next = node;
        }
        return head;
    }



}