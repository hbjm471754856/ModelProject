package com.cr.provider.sort;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {

    public static void main(String[] args) {
        String jsonStr = "[{\"name\": \"0-0\",\"id\": 10,\"pid\": 0},{\"name\": \"1-0\",\"id\": 20,\"pid\": 10},{\"name\": \"1-1\",\"id\": 21,\"pid\": 10},{\"name\": \"2-0\",\"id\": 30,\"pid\": 20},{\"name\": \"2-1\",\"id\": 31,\"pid\": 20}]";
        System.out.println(new Test().parseTree(JSON.parseArray(jsonStr), 0));
    }

    public JSONArray parseTree(JSONArray menuList, int parentId) {
        JSONArray childMenu = new JSONArray();
        for (Object object : menuList) {
            //获取当前节点对象
            JSONObject jsonMenu = JSONObject.parseObject(object.toString());
            //获取ID和PID
            int id = jsonMenu.getInteger("id");
            int pid = jsonMenu.getInteger("pid");
            //如果上层节点ID与当前节点PID一致，说明为上层节点的子节点
            if (parentId == pid) {
                //递归判断当前节点是否存在子节点，如果存在，直接进入子节点
                JSONArray childNode = parseTree(menuList, id);
                //如果不存在子节点，将子节点数据存入当前节点中
                jsonMenu.put("childNode", childNode);
                //并将当前节点设置为子节点
                childMenu.add(jsonMenu);
            }
        }
        return childMenu;
    }
}

