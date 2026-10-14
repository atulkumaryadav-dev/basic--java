import java.util.Scanner;

public class volumeofsphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius : ");
        int r =sc.nextInt();
        double volumeofsphere=4/3*3.14*r*r*r;
        System.out.println(volumeofsphere);
    }
    
}
