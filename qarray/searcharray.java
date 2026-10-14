public class searcharray {
    public static void main(String[] args) {
        int [] array = {1, 6 , 7 , 8, 9, 10};
        int target = 9;
        int n = array.length;
        boolean flag = false;

        for(int i=0;i<n;i++){
            if(array[i]==target){
                {System.out.println("target exist at index : "+i);}
                flag = true;
                break;

            }

        }
        if(flag==false)
         {System.out.println("target does not exist");}

    }
    
}
