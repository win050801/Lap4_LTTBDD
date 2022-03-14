package com.example.thang;

public class Language {
    private int id;
    private String name;
    private String ten;

    public Language(int id, String name,String ten) {
        this.id = id;
        this.name = name;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
