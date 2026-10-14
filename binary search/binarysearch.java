public class binarysearch{
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3 ,4 ,5 ,6 ,7 ,8 };
        int n = arr.length;
        int target = 5;

        int i =0,j=n-1;
          

        while(i<=j){
           int  mid = (i+j)/2;

           if(target>arr[mid]){
            i=mid+1;
           }

           else if(target<arr[mid]){
            j = mid-1;

           }
           else{System.out.println("mil gya at index : "+mid);
            break;
           }
        }


    }
}