import java.util.Scanner;

public class missingelement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    //     int [] array = new int[4];

    //     System.out.print("Enter array elements : ");
    //   for(int i =0;i<array.length;i++){
    //     array[i]=sc.nextInt();
    //   }

    int [] array = { 1, 3 , 4 ,5 };

        int n = array.length + 1;
        int z = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("the missing number will be : "+(z - sum));

    }

}
