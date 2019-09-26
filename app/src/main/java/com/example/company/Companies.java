package com.example.company;

public class Companies {
    private String name;
    private String add;
    private int code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Companies(String name, String add, int code) {
        this.name = name;
        this.add = add;
        this.code = code;

    }
}
