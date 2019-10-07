import java.util.ArrayList;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        int[] myArray ={1,2,3,4,5,6};
        divide(myArray,2);
    }
    public static Integer[] divide(int[]arr, int x){
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           if(arr[i]%x==0){
               list.add(arr[i]);
           }
       }
      Integer[] result = new Integer[list.size()];
       result=list.toArray(result);
       int sum=0;
       for(int i=0;i<result.length;i++){
           sum=sum+result[i];
       }
        System.out.println(sum);
       return result;
    }
}
