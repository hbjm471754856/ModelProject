package com.cr.provider.sort;

import java.util.List;

public class Model {
    private String name;
    private Integer id;
    private Integer pid;

    private Model parent;
    private List<Model> children;

    public Model(String name, Integer id, Integer pid) {
        this.name = name;
        this.id = id;
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Model getParent() {
        return parent;
    }

    public void setParent(Model parent) {
        this.parent = parent;
    }

    public List<Model> getChildren() {
        return children;
    }

    public void setChildren(List<Model> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pid=" + pid +
                ", parent=" + parent +
                ", children=" + children +
                '}';
    }
}
