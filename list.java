import java.util.*;
public class list {
    static Node head;
    public static void main(String[] args) {
        System.out.println("JAI SIYA RAM \n\nJAI SIYA RAM");


        LinkedList<String> list  = new LinkedList<String>() ; 

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("Chaman");
        System.out.println(list);

        System.out.println(list.size() );


        for(int i = 0 ; i< list.size() ; i++)
        {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("NULL");


        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());
    }
}


