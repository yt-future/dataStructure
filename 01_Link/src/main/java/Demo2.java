import entity.Node;
import utils.NodeUtils;

/**
 * @author: yangteng
 * @date: 2020/8/6 15:33
 * @description:
 * @version: 1.0
 */
public class Demo2 {
    /**
     * 常见操作3 ：给定一个链表，判断链表中是否有环。
     *
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
     *
     */
    public static void main(String[] args) {

    }
    
    public boolean sortNode(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow.equals(fast)) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}