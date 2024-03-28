import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(5);
        x.add(7);
        x.add(1);
        x.add(10);
        x.add(0);

        Collections.sort(x);

        System.out.println(x);

        List<Integer> y = new LinkedList<>();
        // vector : same as arrayList , only diff is that it is synchronized, thread safe
        // slow performance
        List<Integer> z = new Vector<>();
        // stack : DS Last in first out
        // 1 -> 2 -> 4
        // stack : Thread safe
        List<Integer> a = new Stack<>();

        // Doesn't have any order of elements
        // hashtable
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(512);
        s1.add(113);
        s1.add(354);
        s1.add(9);
        s1.add(76);

        for(Integer x5 : s1){
            System.out.print(x5 + " ");
        }
        System.out.println();

        // Insertion Order
        // Hashtable + Double Linked List
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(2);
        s2.add(5);
        s2.add(1);
        s2.add(3);
        s2.add(9);
        s2.add(7);

        for(Integer x5 : s2){
            System.out.print(x5 + " ");
        }
        System.out.println();

        // sorted order
        // Red black tree
        Set<Integer> s3 = new TreeSet<>();
        s3.add(10);
        s3.add(512);
        s3.add(113);
        s3.add(354);
        s3.add(9);
        s3.add(76);


        for(Integer x5 : s3){
            System.out.print(x5 + " ");
        }
        System.out.println();



    // HashSet : array of LinkedLists

        // Country => population
        // request -> please give me the population of 'X' country
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India" , 501);
        hm.put("China" , 505);
        hm.put("US" , 500);
        hm.put("XYZ" , 201);
        hm.put("ABC" , 3010);

        System.out.println(hm.get("China"));

        // Comparable vs comparator
        List<Student> st1 = new ArrayList<>();
        st1.add(new Student("Mohit", 1 , 1990, "abc"));
        st1.add(new Student("Ayush", 5, 2025, "abc"));
        st1.add(new Student("Rohit", 2 , 2040, "abc"));

        Collections.sort(st1);

        for(Student s : st1){
            System.out.println(s.name);
        }
    }
}
// Natural ordering
// 1 2 3 4

// Collection Framework
// Comparable / comparator