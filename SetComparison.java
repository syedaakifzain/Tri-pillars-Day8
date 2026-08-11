package Dayy8;
import java.util.*;
public class SetComparison {
    public static void main(String[] args) {
        HashSet<Integer> hashset=
                new HashSet<>(Arrays.asList(30,10,50,20,40));
        LinkedHashSet<Integer> linkedhashset=
                new LinkedHashSet<>(Arrays.asList(30,10,50,20,40));
        TreeSet<Integer> treeset=
                new TreeSet<>(Arrays.asList(30,10,50,20,40));
        System.out.println("Unordered :"+hashset);
        System.out.println("Ordered :"+linkedhashset);
        System.out.println("Sorted Set :"+treeset);
    }
}