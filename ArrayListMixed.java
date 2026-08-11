package Dayy8;

import java.util.ArrayList;

public class ArrayListMixed {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(45);
        list.add(63.3);
        list.add("java");
        list.add('A');
        list.add(true);
        System.out.println(list);
    }
}
