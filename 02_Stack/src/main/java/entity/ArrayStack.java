package entity;

import java.util.Arrays;

/**
 * @author: yangteng
 * @date: 2020/8/7 14:03
 * @description: 基于数组实现的顺序栈
 * @version: 1.0
 */
public class ArrayStack {
    /**
     * 数组
     */
    private String[] elements;

    /**
     * 栈内元素个数
     */
    private int count;

    /***
     * 栈的大小
     */
    private int length;

    /**
     * 利用构造函数初始化栈
     */
    public ArrayStack(int length) {
        this.length = length;
        this.count = 0;
        this.elements = new String[length];
    }

    /**
     * 模拟入栈
     * @return
     */
    public boolean push(String element) {
        // 判断栈是否满了
        if( count >= length) {
            System.out.println("入栈失败，栈内已满");
            return false;
        }

        // 模拟从栈顶插入，下标由小到大
        elements[count] = element;
        // 每次入栈，下标+1
        ++count;
        System.out.println("入栈成功");
        return true;
    }

    /**
     * 模拟出栈
     * @return
     */
    public boolean pop() {
        // 判断栈内无元素
        if (count == 0) {
            System.out.println("出栈失败，栈内已空");
            return false;
        }

        // 模拟从栈顶出栈，下标从大到小
        String element = elements[count-1];
        elements[count-1] = null;
        // 每次出栈，下标-1
        --count;

        System.out.println("出栈成功"+element);
        return true;
    }




    public String[] getElement() {
        return elements;
    }

    public void setElement(String[] element) {
        this.elements = element;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}