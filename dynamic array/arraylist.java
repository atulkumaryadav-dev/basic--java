import java.util.*;


public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7); // use to add element in the array
        arr.add(28);
        arr.add(14);
        arr.add(56);

        System.out.println("the second index element is : " + arr.get(2));

        arr.set(3, 50);

        // use to update the element of array....

        System.out.print(arr + " ");
System.out.println();
        

        Collections.reverse(arr);
        System.out.print(arr+" ");

    }
}