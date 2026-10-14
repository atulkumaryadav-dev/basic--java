import java.util.Arrays;
public class sortedarraybuiltin {

    public static void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    public static void main(String[] args) {
        
        int[] arr = { 2 , 1 , 90 , 67};
        print(arr);
       
        Arrays.sort(arr);
        print(arr);

    }
    
}
