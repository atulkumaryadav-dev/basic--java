import java.util.Scanner;

public class getelementofll {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        Node a = new Node(10);

        Node b = new Node(20);

        Node c = new Node(30);

        Node d = new Node(400);

        Node e = new Node(50);

        // connect karenge nodes ko...

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println();
        get(a,2);
        
    }

    public static  void  get(Node head , int idx){

        Node temp = head;

        for(int i =0;i<=idx;i++){
            temp = temp.next;
        }
       System.out.println(temp.val);

    }
    
}
