import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertNumber {
    public static void main(String[] args) {
        int[] myArray ={1,2,3,4,5};
        invert(myArray);
    }
    public static void invert(int[]arr){
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<arr.length/2;i++){
           int temp=0;
           temp = arr[i];
           arr[i]=arr[arr.length-1-i];
           arr[arr.length-1-i]=temp;

           }
        for(Integer t:arr){
            list.add(t);
       }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
