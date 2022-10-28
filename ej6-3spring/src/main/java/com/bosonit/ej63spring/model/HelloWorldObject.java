package com.bosonit.ej63spring.model;

public class HelloWorldObject {
    private int id;
    private String content;

    public HelloWorldObject(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "helloWorldObject{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
