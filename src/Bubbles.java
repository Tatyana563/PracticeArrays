import java.util.Arrays;

public class Bubbles {
    public static void main(String[] args) {
        int[]myArray ={96,5,6,2,1,3,4,28};
        Bubbles bubbles = new Bubbles();
        bubbles.sortBubbles(myArray);
        bubbles.SortInsert(myArray);
    }
    public void sortBubbles(int[]arr){
        int temp;
        boolean isSorted=false;
        while(isSorted==false){
          isSorted=true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
               isSorted=false;
               temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void SortInsert(int[]arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int min_i=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    min_i=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            min=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
