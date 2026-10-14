import java.util.Scanner;

public class printnegativeelemnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] array=new int[n];

        //input of element.......

        System.out.print("Enter array elemnet : ");
        for(int i =0;i<n;i++){
            array[i]=sc.nextInt();
        }

        //output of .......

        for(int i =0;i<n;i++){

            if(array[i]<0){System.out.print(array[i]+" ");}
        }


    }
    
}
