package com.olegmng;

import java.io.Serial;
import java.io.Serializable;

public class SerializablePerson implements Serializable {
    @Serial
    private static long serialVersionUID = 1L;
    private final String name;
    private int age;

    public SerializablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public SerializablePerson(String name) {
        this(name, 20);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "SerializablePerson{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
