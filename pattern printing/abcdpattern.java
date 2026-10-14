import java.util.Scanner;

public class abcdpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows=sc.nextInt();

    //      System.out.println("Enter column : ");
    //  int column=sc.nextInt();


        for(int i =0;i<rows;i++){
            for(int j = 65;j<rows+65;j++){
                System.out.print((char)j+" ");

            }
            System.out.println();
           
        }
      
    }
    
}
