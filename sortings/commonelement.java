import java.util.ArrayList;
import java.util.Arrays;

public class commonelement {

    // public static void print(int[] a , int [] b){
    //     for(int ele: a){
    //          System.out.print(ele+" ");
    //     }
    //     System.out.println();

    // }
    public static void main(String[] args) {
        

        int [] a = { 1, 4 ,2 , 7, 6};
        int [] b = {2, 4, 7, 6};

        int i =0,j=0;

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        while(i<a.length && j<b.length){

            if(a[i]==b[j]){
                
                ans.add(a[i]);
                i++;
                j++;
            }

            else if (a[i]<b[j]) {
                i++;
            }

            else{j++;}
        }

       System.out.println(ans);
    }
    
}
