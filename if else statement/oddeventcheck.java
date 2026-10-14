import java.util.Scanner;

public class oddeventcheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the positive no : ");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("even");
        }
        else{System.out.println(x +" is "+"odd number");}

    }
}