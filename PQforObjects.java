// package Priority Queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQforObjects {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name,int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // pq.add(3);
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        // while(!pq.isEmpty()) {
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }



        // // big numbers will ge higher priority

        // PriorityQueue<Integer> pq1 = new PriorityQueue<Comparator.reverseOrder()> ;

        // pq1.add(3);
        // pq1.add(4);
        // pq1.add(1);
        // pq1.add(7);

        // while(!pq1.isEmpty()) {
        //     System.out.println(pq1.peek());
        //     pq1.remove();
        // }



        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " --> " + pq.peek().rank);
            pq.remove();
        }

        PriorityQueue<Student> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(new Student("A", 4));
        pq1.add(new Student("B", 5));
        pq1.add(new Student("C", 2));
        pq1.add(new Student("D", 12));

        while(!pq1.isEmpty()) {
            System.out.println(pq.peek().name + " --> " + pq1.peek().rank);
            pq1.remove();
        }
    }
}
