package com.Method;

public class Con_Human3 {
    private String name;
    private String School;
    private Integer id;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Con_Human3(String name, String school, Integer id, float height) {
        this.name = name;
        School = school;
        this.id = id;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Con_Human3{" +
                "name='" + name + '\'' +
                ", School='" + School + '\'' +
                ", id=" + id +
                ", height=" + height +
                '}';
    }
}


