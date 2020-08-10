import entity.Node;
import utils.NodeUtils;

/**
 * @author: yangteng
 * @date: 2020/8/5 13:31
 * @description:
 * @version: 1.0
 */
public class Demo1 {

    public static void main(String[] args) {
        Node reverse = reverse(NodeUtils.createLink());
        System.out.println(reverse);
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

}