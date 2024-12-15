package org.example.suleyman.model;

public class Subject {
    private int id;
    private String sname;
    private String category;

    public Subject(int id, String sname, String category) {
        this.id = id;
        this.sname = sname;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
