public class twodarray{
    public static void main(String[] args) {
        // int [][] array = new int [3][3];

         int [][] array ={{1, 2, 3},{5, 7, 9},{0, 9 ,1}};

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}