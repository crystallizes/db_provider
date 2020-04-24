package com.ccm.db_provider.entity;

import java.io.Serializable;

public class txone implements Serializable {
    private static final long serialVersionUID = 6102526449700267066L;
    private int id;
    private int age;
    private String name;

    public txone(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
