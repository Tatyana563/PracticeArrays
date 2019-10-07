import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManipulationArrays {
    public static void main(String[] args) {
        String[] myarray = {"rose","tulip","violet","camomile"};
     Integer [] myArray2 = {1,2,3,4,5,6};
     int[]myarray3 = {25,26,27};
     // arrayCopy(myArray2,myarray3);
        deleteEl(myarray,1);
       // addEl(myarray,0,"apple");
//deleteElement(myArray2,0);

    }
    public static void deleteEl(String[]arr, int index){
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list= Arrays.asList(arr);
        list2.addAll(list);
        list2.remove(index);
        System.out.println(list2);
       // String[] strings = list2.stream().toArray(String[]::new); OK
        String[] string =list2.toArray(new String[0]); //OK
        System.out.println(Arrays.toString(string));

    }
public static void addEl(String[]arr, int position, String element){
            List<String> list = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            list=Arrays.asList(arr);
            list2.addAll(list);
            list2.add(position,element);
            String [] result=new String[list2.size()];
            result=list2.toArray(result);
            System.out.println(list2);
            System.out.println(Arrays.toString(result));
        }
public static void arrayCopy(int[]arr1, int[]arr2){
int result[]= new int[arr1.length+arr2.length];
System.arraycopy(arr1,0,result,0,arr1.length);
System.arraycopy(arr2,0,result,arr1.length,arr2.length);
    System.out.println(Arrays.toString(result));
}

    public static  <T> T[] deleteElement(T[] arr, int element){
        List<T> tempList = Arrays.asList(arr);
        List<T> tempList2 = new ArrayList<>(tempList);
        System.out.println(tempList2);
        tempList2.remove(element);
        System.out.println(tempList2);
//        T[] result = new <T>  [tempList2.size()];//new never for generics
        T[] result=Arrays.copyOf(arr,arr.length-1);//remove the last one; if more add empty cells
        result = tempList2.toArray(result);
       System.out.println(Arrays.toString(result));
        return result;
    }
    public static  <T> T[] unionArrays(T[] ...arr){
        if(arr.length==0){
            return null;
        }
        List<T> tempList =new ArrayList<>();
        Arrays.stream(arr).forEach(w->{
            for(T temp: w){
                tempList.add(temp);
            }
        });

        T[] result=Arrays.copyOf(arr[0],tempList.size());
        result = tempList.toArray(result);
        System.out.println(Arrays.toString(result));
        return result;
    }
}



