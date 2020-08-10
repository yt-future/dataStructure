import entity.Node;
import utils.NodeUtils;

/**
 * @author: yangteng
 * @date: 2020/8/6 15:33
 * @description:
 * @version: 1.0
 */
public class Demo4 {
    /**
     * 常见操作4 ：删除链表的倒数第N个节点
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     */
    public static void main(String[] args) {
        Node node = removeNode(NodeUtils.createLink(),1);
        System.out.println(node);
    }

    /**
     * @param head
     * @param n : 倒数第n个
     * @return
     */
    public static Node removeNode(Node head,int n) {
        Node step = new Node(0);
        step.next = head;

        Node before = step;
        Node after = step;

        for (int i = 0; i < n+1; i++) {
            before = before.next;
        }

        while (before != null) {
            before = before.next;
            after = after.next;
        }
        Node a = after.next;

        // 将 cur 后面要删除的元素断链
        after.next = after.next.next;

        return step.next;
    }
}