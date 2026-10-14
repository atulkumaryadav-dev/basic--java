import java.util.Scanner;

public class magnitudesmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number : ");
        int n = sc.nextInt();

//Math.abs(n) gives absolute value of n.........
        if(Math.abs(n)<69){
            System.out.println("magnitude is smaller the 69");     
        }

        else{System.out.println("magnitude is  greater then 69");}
    }
    
}
