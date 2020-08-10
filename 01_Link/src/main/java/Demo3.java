import entity.Node;
import utils.NodeUtils;

/**
 * @author: yangteng
 * @date: 2020/8/6 15:33
 * @description:
 * @version: 1.0
 */
public class Demo3 {
    /**
     * 常见操作3 ：两个有序链表合并
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * 示例：
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    public static void main(String[] args) {
        Node node = new Demo3().sortNode(NodeUtils.createLink(),NodeUtils.createLink());
        System.out.println(node);
    }
    
    public Node sortNode(Node l1 , Node l2) {
        Node prehead = new Node(-1);

        Node prev = prehead;
        while (l1 != null && l2 != null) {
            //判断大小排序
            if (l1.data <= l2.data) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            System.out.println(prev);
            prev = prev.next;
            System.out.println(prev);
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}