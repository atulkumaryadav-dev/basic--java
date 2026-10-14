import java.util.ArrayList;
import java.util.Arrays;

public class unionoftwoarray {
    public static void main(String[] args) {
        

        int [] a = {1, 2 , 3 ,4 ,5};
        int [] b = {1 , 2 , 3 , 6 ,7};

        int i =0,j=0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(i<a.length && j<b.length){


            if(a.length==1){
                for(j=0;j<b.length;j++){
                    if(a[0]!=b[j]){
                        ans.add(a[0]);

                    }
                }
            }

            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }

            else if (a[i]<b[j]) {
                ans.add(a[i]);
                i++;
              
                
            }

            else{ans.add(b[j]);
                j++;
            }
        }

         // Remaining elements of a
        while (i < a.length) {
            ans.add(a[i]);
            i++;
        }

        // Remaining elements of b
        while (j < b.length) {
            ans.add(b[j]);
            j++;
        }

      System.out.println(ans);
    }
    
}
