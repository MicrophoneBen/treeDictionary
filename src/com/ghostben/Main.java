package com.ghostben;

/**
 * @program: Main
 * @description: 测试字典树，字典树类
 * @author: ben.zhang.b.q
 * @create: 2018-11-05 11:32
 **/
public class Main {

    public static void main(String[] args) {

        TreeDictionary dt = new TreeDictionary();

        dt.add("interest");
        dt.add("interesting");
        dt.add("interested");
        dt.add("inside");
        dt.add("insert");
        dt.add("apple");
        dt.add("inter");
        dt.add("interesting");

        dt.print();

        boolean isFind = dt.find("inside");
        System.out.println("find inside : " + isFind);

        int count = dt.count("inter");
        System.out.println("count prefix inter : " + count);
    }
}
