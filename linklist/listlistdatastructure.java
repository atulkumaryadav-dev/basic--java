class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class linkedlist{

    Node head;
    Node tail;

    void addattail(int val){

        Node temp= new Node(val);
        tail.next=temp;
        tail=temp;
    }
}
public class listlistdatastructure {   
    public static void main(String[] args) {

        linkedlist l1 = new linkedlist();
        l1.addattail(10);
        


        
        
    }
    
}
