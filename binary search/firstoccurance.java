public class firstoccurance {
    public static void main(String[] args) {
        
        int[] arr = {1, 1,2,2,2 ,3,4,5,5,5,5,6,7,8,9};
        int n = arr.length;
        int i =0,j=n-1,idx=-1;
        int target=5;

        while(i<j){
            int mid = (i+j)/2;

            if(target>arr[mid]){
                i=mid+1;
            }

            else if (target<arr[mid]) {
                j = mid-1;
            }

            else{
                idx=mid;
                j=mid-1;
               
            }
        }

        System.out.println("first occurance is at index : "+idx);
    }
    
}
