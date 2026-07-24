import java.util.*;

public class Ccollections {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(10);
        l1.add(10);

        System.out.println("Original Array: " + l1);

        System.out.println("Size: " + l1.size());

        System.out.println("Elements: " + l1.get(3));

        System.out.println("present: " + l1.contains(10));

        l1.remove(Integer.valueOf(10));
        System.out.println("after remove: " + l1);

        l1.set(2,70);
        System.out.println("After set value: " + l1);

        Collections.reverse(l1);
        System.out.println("Reversed: " + l1);

        Collections.shuffle(l1);
        System.out.println("After shuffling: " + l1);

        System.out.println("Minimum: " + Collections.min(l1));
        System.out.println("Maximum: " + Collections.max(l1));

        Collections.sort(l1);
        int pos = Collections.binarySearch(l1, 10);
        System.out.println("Elements position: " + pos);

        l1.add(100);
        l1.add(100);
        l1.add(100);

        System.out.println("frequency: " + Collections.frequency(l1, 10));

        List <Integer> l2 = Collections.emptyList();

        List<Integer> l3 =  Collections.singletonList(72);

        List<Integer> l4 = new ArrayList<>();
        Collections.fill(l4,0);
        Collections.replaceAll(l4, 0, 12);

        System.out.println("List l4: " + l4);

        List<Integer> l5 = new ArrayList<>();
        l5.add(1);
        l5.add(2);
        l5.add(3);

        List<Integer> l6 = new ArrayList<>();
        l6.add(4);
        l6.add(5);
        l6.add(6);

        System.out.println(Collections.disjoint(l5, l6));

        List<String> l7 = Collections.nCopies(5, "hi ");

        Iterator<String> it = l7.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        l7.forEach(i -> System.out.println(i + " "));


        


        /*
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new LinkedList<>();
        List<Integer> l4 = new Vector<>();
        List<Integer> l5 = new Stack<>();

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new TreeSet<>();
        Set<Integer> s3 = new TreeSet<>(Collections.reverseOrder());
        Set<Integer> s4 = new LinkedHashSet<>();

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        Deque<Integer> d1 = new LinkedList<>();

        PriorityQueue<Integer> p1 = new PriorityQueue<>();

        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new TreeMap<>();
        Map<Integer, Integer> m3 = new TreeMap<>(Collections.reverseOrder());
        Map<Integer, Integer> m4 = new LinkedHashMap<>(); */

        /* INSERTION
        for (int i = 1; i <= 5; i++) {
            l1.add(i);
            l2.add(i);
            l3.add(i);
            l4.add(i);
            l5.add(i);

            s1.add(i);
            s2.add(i);
            s3.add(i);
            s4.add(i);

            q1.offer(i);
            q2.offer(i);

            d1.offerLast(i);

            p1.offer(i);

            m1.put(i, i * 10);
            m2.put(i, i * 10);
            m3.put(i, i * 10);
            m4.put(i, i * 10);
        } */

        /* PRINT
        System.out.println("ArrayList l1       : " + l1);
        System.out.println("ArrayList l2       : " + l2);
        System.out.println("LinkedList l3      : " + l3);
        System.out.println("Vector l4          : " + l4);
        System.out.println("Stack l5           : " + l5);

        System.out.println();

        System.out.println("HashSet s1         : " + s1);
        System.out.println("TreeSet s2         : " + s2);
        System.out.println("TreeSet Reverse s3 : " + s3);
        System.out.println("LinkedHashSet s4   : " + s4);

        System.out.println();

        System.out.println("Queue LinkedList q1: " + q1);
        System.out.println("Queue ArrayDeque q2: " + q2);
        System.out.println("Deque d1           : " + d1);
        System.out.println("PriorityQueue p1   : " + p1);

        System.out.println();

        System.out.println("HashMap m1         : " + m1);
        System.out.println("TreeMap m2         : " + m2);
        System.out.println("TreeMap Reverse m3 : " + m3);
        System.out.println("LinkedHashMap m4   : " + m4);

        */
    }
}