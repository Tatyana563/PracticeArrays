import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class JoinArrays {
    public static void main(String[] args) {
        int[] mas1 = {1,2,3};
        int[]mas2 = {4,5,6};
        String [] mas3 = {"apple","lemon","cherry"};
        String[] mas4 = {"watermelon","melon"};
        JoinArrays join = new JoinArrays();
        join.joinArr(mas1,mas2);
        join.conc(mas3,mas4);
    }
    public void joinArr(int[]arr1, int[]arr2){
       int[] result;
       result=ArrayUtils.addAll(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
    public void conc(String []A, String[]B){

        int aLenght=A.length;
        int bLength=B.length;
        String[] result = new String[aLenght+bLength];
        System.arraycopy(A,0,result,0,aLenght);
        System.arraycopy(B,0,result,aLenght,bLength);
        System.out.println(Arrays.toString(result));
    }

}