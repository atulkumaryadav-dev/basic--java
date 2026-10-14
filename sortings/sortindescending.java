public class sortindescending {

    public static void print(int [] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        
        int[] arr= {1, 2,3,4 ,5};
        int n = arr.length;

        for(int j =0;j<n-1;j++){
            
        for(int i =0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        }

        print(arr);
    }
    
}
