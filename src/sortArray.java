import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] myArray = {5,6,1,9,3};
        sortArray sort = new sortArray();
        sort.Sorting(myArray);
        sort.sortArray(myArray);
    }
    public void Sorting(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              int  min=arr[i];
              int pos=i;
              if(arr[j]<min){
                  min=arr[j];
                  pos=j;
              }
              arr[pos]=arr[i];
              arr[i]=min;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public int findMin(int[]arr, int pos){

int minPosition = pos;
for(int i=pos;i<arr.length;i++){
    if(arr[minPosition]<arr[pos]){
minPosition=i;
    }
}
return minPosition;
    }


    public void changePosition(int[]arr, int pos1, int pos2){

            int temp=arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=temp;

    }


    public void sortArray(int[]mas){
        for(int i=0;i<mas.length;i++){
            changePosition(mas,i,findMin(mas,i));
        }
        System.out.println(Arrays.toString(mas));
    }

}
