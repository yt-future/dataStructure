import entity.Node;
import utils.NodeUtils;

/**
 * @author: yangteng
 * @date: 2020/8/6 15:33
 * @description:
 * @version: 1.0
 */
public class Demo5 {
    /**
     * 常见操作5 ：求链表的中间节点
     * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
     * 如果有两个中间结点，则返回第二个中间结点。
     */
    public static void main(String[] args) {
        Node node = new Demo5().middleNode(NodeUtils.createLink());
        System.out.println(node);
    }
    
    public Node middleNode(Node head) {
        int n = 0;
        Node cur = head;
        while (cur != null) {
            ++n;
            cur = cur.next;
        }
        int k = 0;
        cur = head;
        while (k < n / 2) {
            ++k;
            cur = cur.next;
        }
        return cur;
    }
}