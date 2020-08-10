package entity;

import java.util.Arrays;

/**
 * @author: yangteng
 * @date: 2020/8/8 10:22
 * @description: 创建基于数组的队列
 * @version: 1.0
 */
public class ArrayQueue {

    /**
     * 数组
     */
    private String[] elements;

    /**
     * 队头下标
     */
    private int head;

    /**
     * 队尾下标
     */
    private int tail;

    /**
     * 队列容量
     */
    private int length;

    /**
     *  初始化队列
     */
    public ArrayQueue(int length) {
        this.head = 0;
        this.tail = 0;
        this.length = length;
        this.elements = new String[length];
    }

    /**
     * 入队
     * @param item
     * @return
     */
    public void enqueue(String item) {
        //队列已满
        if(tail == length) {
            System.out.println(item+"入队失败");
            return;
        }
        //队列未满
        elements[tail] = item;
        ++tail;
        System.out.println(item+"入队成功");
    };

    /**
     * 入队-优化
     * @param item
     * @return
     */
    public void enqueueOptimised(String item) {
        //队列已满
        if(tail == length) {
            //队头指针为0，表示数组没有空元素
            if(head == 0) {
                System.out.println(item+"入队失败");
                return;
            }
            int n = head;
            for (int i = 0; i < n ; i++) {
                if(head<length) {
                    elements[i] = elements[head];
                    elements[head] = null;
                    ++head;
                    continue;
                }
                break;
            }
            //更新指针
            tail -= head;
            head = 0;

        }

        //队列未满
        elements[tail] = item;
        ++tail;
        System.out.println(item+"入队-better-成功");
    };

    /**
     *  出队
     */
    public void dequeue() {
        //队列已空
        if(tail == 0 || head == tail) {
            System.out.println("队列已空，出队失败");
            return;
        }
        //队列未空
        String item = elements[head];
        elements[head] = null;
        ++head;
        System.out.println(item+"出队成功");
    };

    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "elements=" + Arrays.toString(elements) +
                ", head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}