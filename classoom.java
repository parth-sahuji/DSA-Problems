// package Priority Queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class classoom {
    public static void main(String[] args) {
        System.out.println("HARIOM");

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }



        // big numbers will ge higher priority

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(3);
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);

        while(!pq1.isEmpty()) {
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }
}
