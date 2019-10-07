import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divide {
    public static void main(String[] args) {
        int[]arr = {0,1,2,3,4,5,6,78,9};

    int[][] array = {{1,2},{3,4},{5,6},{7,8},{9,10}};
      //  divide(arr,2);
       divide3(array,3);
    }
    public static void divide(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (i % x == 0) {
                System.out.println(arr[i] + "индекс кратный x ");
            }
        }

    }
    public static void divede2(int[] arr, int x){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % x == 0) {
                list.add(arr[i]);
            }
        }
        Integer[] array = new Integer[list.size()];
        array=list.toArray(array);
        System.out.println(Arrays.toString(array));
    }
    public static void divide3 (int[][] arr, int x){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (((i * j)-1) % x == 0) {
                    list.add(arr[i][j]);
                }
            }
        }
        Integer[] array = new Integer[list.size()];
        array=list.toArray(array);
        System.out.println(Arrays.toString(array));
    }
    }

