package entity;

import java.io.Serializable;

/**
 * @author: yangteng
 * @date: 2020/8/29 8:58
 * @description:
 * @version: 1.0
 */
public class Person implements Serializable {
    private Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}