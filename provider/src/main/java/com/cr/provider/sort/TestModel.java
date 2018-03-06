package com.cr.provider.sort;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestModel {

    public static void main(String[] args) {
        String str = "[\n" +
                " {\n" +
                " name : '0-0',\n" +
                " id: 10,\n" +
                " pid : 0\n" +
                " },\n" +
                " {\n" +
                " name : '1-0',\n" +
                " id: 20,\n" +
                " pid : 10\n" +
                " },\n" +
                " {\n" +
                " name : '1-1',\n" +
                " id: 21,\n" +
                " pid : 10\n" +
                " },\n" +
                " {\n" +
                " name : '2-0',\n" +
                " id: 30,\n" +
                " pid : 20\n" +
                " },\n" +
                " {\n" +
                " name : '2-1',\n" +
                " id:31,\n" +
                " pid : 20\n" +
                " }\n" +
                "]";
        List<Model> list = new ArrayList<>();
        list.add(new Model("0-0", 10, 0));
        list.add(new Model("1-0", 20, 10));
        list.add(new Model("1-1", 21, 10));
        list.add(new Model("2-0", 30, 20));
        list.add(new Model("2-1", 31, 20));
        Map<Integer, Model> map = new HashMap();
        for (Model m : list) {
            map.put(m.getId(), m);
        }

        sortTree(map);

        System.out.println(JSON.toJSONString(map));
    }

    public static void sortTree(Map<Integer, Model> map) {

        boolean flag = false;
        List<Integer> removeIds = new ArrayList<>();

        for (Integer id : map.keySet()) {
            Model m = map.get(id);
            Integer pid = m.getPid();
            if (map.containsKey(pid)) {
                Model parent = map.get(pid);
                List<Model> children = parent.getChildren();
                if (children == null) {
                    children = new ArrayList<>();
                    children.add(m);
                    parent.setChildren(children);
                } else {
                    children.add(m);
                }
                removeIds.add(id);

                if (!flag) {
                    flag = true;
                }
            }
        }

        for (Integer id : removeIds) {
            map.remove(id);
        }

        if (flag) {
            sortTree(map);
        }

    }

    public static void hasModel() {

    }

}
