public class searchindscendingarr {
    public static void main(String[] args) {
        

        int [] arr= {5, 4,3 ,2,1};
        int target=1;
        int n = arr.length;

        int i=0,j=n-1;

        while(i<=j){
           int  mid =(i+j)/2;

            if(arr[mid]==target){
                System.out.println("target at index : "+mid);
              break;
            }

            else if (arr[mid]>target) {

                i=mid+1;                
            }

            else{
                j=mid-1;
            }
        }

       
    }
    
}
