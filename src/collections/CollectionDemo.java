package collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        //ArrayList
        var a1 = new ArrayList();
        a1.add("Zaara");
        a1.add("Roohi");
        a1.add("Soham");
        System.out.println("Array List elements :" );
        System.out.println("\t" + a1);

        ArrayList <String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Sanket");
        list.add("Swapnil");
        list.add("Ravi");
        Iterator itr = list.iterator();
        System.out.println("Array List elements = ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        //LinkedList
        List L1 = new LinkedList();
        L1.add("Zaara");
        L1.add("Roohi");
        L1.add("Soham");
        System.out.println("Linked List elements : ");
        System.out.println("\t" + L1);

        LinkedList<String> L2 = new LinkedList<String>();
        L2.add("Science");
        L2.add("Mathematics");
        L2.add("Computer Science");
        L2.add("Science");
        L2.add(1,"Environment science");
        L2.addLast("Sankrit");
        L2.addFirst("English");
        L2.remove(3);
        Iterator String = L2.iterator();
        System.out.println("Linked List elements : ");
        while (String.hasNext()){
            System.out.println(String.next());
        }
        LinkedList<Integer> L3 = new LinkedList<Integer>();
        L3.add(6);
        L3.add(23);
        L3.add(14);
        System.out.println("Linked List L3 : ");
        Iterator Integer = L3.listIterator();
        while (Integer.hasNext()){
            System.out.println(Integer.next());
        }


        //HashSet
        Set S1 = new HashSet();
        S1.add("Zaara");
        S1.add("Roohi");
        S1.add("Soham");
        S1.add("Zaara");
        System.out.println("Set elements : ");
        System.out.println("\t" + S1);
        S1.remove("Zaara");
        System.out.println("\t" + S1);

        //Hasmap
        Map M1 = new HashMap();
        M1.put("Zaara", "9");
        M1.put("Roohi", "6");
        M1.put("Soham", "3");
        M1.put("Abhishek", "5");
        System.out.println("Hashmap elements : ");
        System.out.println("\t"+ M1);

        //LinkedHash Set
        LinkedHashSet<String> S2 = new LinkedHashSet<String>();
        S2.addAll(S1);
        S2.add("Shahu");
        S2.add("Bhosale");
        System.out.println("HashSet Elements S2 : ");
        System.out.println("\t" + S2);

        //TreeSet
        TreeSet<String> T1 = new TreeSet<String>();
        T1.add("Rahul");
        T1.add("Sagar");
        T1.addAll(S2);
        System.out.println("TreeSet elements T1 ; ");
        System.out.println("\t" + T1);

    }
}
