public class segregatezeroandone {
    public static void main(String[] args) {
        int [] array = { 0, 1 , 0, 1, 0, 1, 0};
        int numberofzeroes = 0;
        int numberofone=0;

        for(int ele:array){
            if(ele==0){numberofzeroes++;}
            else{numberofone++;}
        }

        for(int i =0;i<numberofone+numberofzeroes;i++){
            if(i<numberofzeroes){
                System.out.print("0"+" ");
            }
            else{System.out.print("1"+" ");}
        }
    }
    
}
