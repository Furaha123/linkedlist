

public class LinkedList1 {

    class Node {
        int data;
        Node next;

        public Node() {
            next = null;
        }

        public Node(int num) {
            data = num;
            next = null;
        }

    }
    Node head;
    Node tail;
    int size;

    public LinkedList1() {
        head = null;
        tail = null;
        size = 0;

    }

    public LinkedList1(int num) {
        Node node = new Node(num);
        head = node;
        tail = node;
        size = 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;

    }

    public void insertAtFront(int num) {
        Node node = new Node(num);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;

    }

    public  void insertAtBack(int num){
        Node  node  =  new Node(num);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }


  
//    public   String toString(){ 
//        String S =  new String("");
//        if (!isEmpty()) {
//            Node current = head;
//            S += "[";
//            while (current != null) {
//                S += ","+current.data;
//                current = current.next;
//            }
//            S += "]";
//        }
//        return  S;
//    }
	
    public LinkedList1 concantenate(LinkedList1  L1) {
     if(L1.head == null){
        return null;
     }
     else{
        Node node =L1.head;
        while (node !=null) {
            insertAtBack(node.data);
            node =  node.next;
        }
     }
       return this;
    }

    public  boolean isSorted(LinkedList1 l){
         boolean output = true;
        Node current = l.head;
        while (current.next != null) {
            if (current.data > current.next.data) {
               output =false;
            }
            current = current.next;
        }
        return output;
    }
  


     public   LinkedList1  merge(LinkedList1 l){ 

     if(!(isSorted(l) && isSorted(this))){
        return null;
     }
     else{
        this.concantenate(l);
        System.out.println(this.toString());
        Node current = this.head, index = null;  
        int temp;    
            while(current != null) {  
                index = current.next;  
                while(index != null) {  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }      
        }  

     return this;
    }

    
}
