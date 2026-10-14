public class twosum {
    public static void main(String[] args) {
        
        int [] array = {1, 3 , 7 , 0};
        int n = array.length;

        int target = 10;
        boolean flag= false;
       

        for(int  i =0;i<n;i++){
            for( int j=i+1;j<n;j++){
              if(array[i]+array[j]==target) {
                System.out.println("the required index are : "+i+","+j);
                flag = true;
              }
            }
        }            
    }
    
}
