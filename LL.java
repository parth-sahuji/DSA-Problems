public class LL {
    static Node head;
    
    private int size ; 

    LL() {
        this.size = 0 ;
    }

    class Node {
        String data ;
        Node next ;

        Node(String data ){
            this.data = data ;
            this.next = null ; 
            size++;
        }
    } 



    public void addFirst(String data ) {
        Node newNode = new Node(data);
        if(head==null) 
        {
            head  = newNode;
            return ; 
        }
        newNode.next = head ;
        head = newNode;  
        size++;
    }
    

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head==null) 
        {
            head  = newNode;
            return ; 
        }
        Node currNode = head ; 
        while(currNode.next != null) {
            currNode = currNode.next ; 
        }
        currNode.next = newNode ; 
        size++;
    }


    public void deleteFirst() {

        if(head == null ) {
            System.out.println("THe list is empty  . . .  ");
            return ; 
        }
        head = head.next ;
        size--;
    }


    public void deleteLast() {
        if(head == null ) {
            System.out.println("The list is empty  . . .  ");
            return ; 
        }

        size--;

        if ( head == null ) {
            head = null ; 
        }
        Node currNode = head ;
        Node lastNode = head.next; 
        while(lastNode.next != null) {
            lastNode = lastNode.next ; 
            currNode = currNode.next ; 
        } 
        currNode.next = null ; 

    }

    public void printList() {
        Node currNode = head ; 
        if(head == null ){
            System.out.println("List is EMPTY");
        }
        while(currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next ; 
        }
        System.out.println("NULL");
    }
    public int getSize() {
        return size ; 
    }


    public void reverseIterate()  {

        if(head == null  || head.next == null ) {
            return ; 
        }

        Node prevNode = head ;
        Node currNode = head.next ; 

        while(currNode != 0 ) {
            Node nexnode = currNode.next;
            currNode.next = prevNode ; 


            prevNode = currNode;
            currNode = nexnode ; 
        }
        head.next = null ; 
        head = prevNode ; 
    }



    public static void main(String[] args) {
    
        System.out.println("HAR HAR MAHADEV . . . ");

        LL list =  new LL();
        list.addFirst("ka ilaka hai .... ");
        list.addFirst("apun");
        list.addLast("NIKAL ");
        list.addFirst("ye");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addLast("Hati");
        System.out.println(list.getSize());
        list.addFirst("RADHE RADHE ");
        list.printList();

        list.addLast("HARI OM ");
        list.printList();

        list.reverseIterate();
        list.printList();
    } 
}
