package Dayy8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayList1{
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        //1.add()->adds at the last
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println("Array List :"+l1);
        //2.get(index)->Access element
        System.out.println("Element at index :"+l1.get(2));
        //3.set(index,value)
        l1.set(3,60);
        System.out.println(l1);
        //4.sepcific index
        l1.add(3,70);
        System.out.println(l1);
        //5.remove(index)->remove element
        l1.remove(4);
        System.out.println(l1);
        //6.size()
        System.out.println("Size :"+l1.size());
        //7.contains()->search an element
        System.out.println(l1.contains(20));
        //8.indexOf()->returns the index
        System.out.println(l1.indexOf(70));
        //9.sort the list
        Collections.sort(l1);
        System.out.println("Asc :"+l1);
        //10.Descending Order
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Desc: " + l1);
        //11.clear()
        l1.clear();
        System.out.println(l1);



    }
}