public class reversearray {
    public static void main(String[] args) {
        
        int [] array = { 1, 2 ,3 ,4 ,5};

//two pointer technique........
        int i =1,j=array.length-2;
        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }

        for(int elemenet:array){
            System.out.print(elemenet+" ");
        }
    }
    
}
