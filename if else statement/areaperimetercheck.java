import java.util.Scanner;

public class areaperimetercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth : ");
        int breadth = sc.nextInt();

        int area=(length*breadth);
        int perimeter =2*(length+breadth);

        if(area>perimeter){
            System.out.println("area is greater than perimeter");
        }

        else if (perimeter>area) {
             System.out.println("perimeter is greater");
        }

        else if (area==perimeter) {
            System.out.println("both are equal");
            
        }
    }
    
}
