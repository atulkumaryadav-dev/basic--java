import java.util.Scanner;

public class displaylist {
    // class inherit kr rha ..............
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node a = new Node(sc.nextInt());

        Node b = new Node(20);

        Node c = new Node(30);

        Node d = new Node(40);

        Node e = new Node(50);

        // connect karenge nodes ko...

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayrecursively(a);
    }

    public static  void displayrecursively(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayrecursively(head.next);
        System.out.print(head.val+" ");  // revers eprint hoga....recursion.

        
    }

    // public static void display(Node head) {

    //     // System.out.println(head.val);     //loop use krenge print ke liye....

    //     // System.out.println(head.next.val);
    //     // System.out.println(head.next.next.val);

    //     Node temp = head; //initialization....
        
    //     while (temp!=null) {//condition.......

    //         System.out.print(temp.val+" ");
    //         temp=temp.next;//increament.......
    //     }
    //     System.out.println();

    // }

}
