package com.kabilan;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        // Syntax for array list
        ArrayList<Integer> list = new ArrayList<>(10) ;
        list.add(34);
        list.add(434);
        list.add(545);
        list.add(65);
        list.add(768);

        System.out.println(list);
        System.out.println(list.contains(545));
        list.remove(2);
        System.out.println(list);
    }
}
