




public class TestMyLinkedList {
    public static void main(String[] args) {
         
        LinkedList1 l1  =  new LinkedList1();
        LinkedList1 l2  =  new LinkedList1();
        LinkedList1 s  =  new LinkedList1();

        l1.insertAtBack(2);
        l1.insertAtBack(7);
        l1.insertAtBack(12);

        l2.insertAtBack(13);
        l2.insertAtBack(94);
        l2.insertAtBack(42);
        
        System.out.println("Elements of linkedlist 1 are: "+l1);
        System.out.println("Elements of linkedlist 2 are: "+l2);
  

        
        
        System.out.println(l1.isSorted(l2));
        
       
        
        // concatinate two linkedlists
        
        System.out.println("Concatineted linkedlist is: "+l1.concantenate(l2));
        
        // Merging two linkedlists
      
        System.out.print("Two merged linkedlists are: ");  
        l1.merge(l2);
    }
}
