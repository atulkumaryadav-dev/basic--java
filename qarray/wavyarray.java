public class wavyarray {

    public static void swap(int [] array, int i,int j  ){
     
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }    
    public static void main(String[] args) {
        
        int [] array = { 1, 4 , 8, 12, 14, 16};
        //output=4 1 12 8  16 14....

        for(int i =0;i<array.length-1;i+=2){
            if(array[i+1]>array[i]){
                swap(array, i,i+1);
            }
        }

        for(int ele:array){
            System.out.print(ele+" ");
        }
    }
    
}
