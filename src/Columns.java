public class Columns {
    public static void main(String[] args) {
Columns columns = new Columns();
int[][] mas1 =new  int[2][3];
        mas1[0][0] = 1;
        mas1[0][1] = 2;
        mas1[0][2] = 3;
        mas1[1][0] = 4;
        mas1[1][1] = 5;
        mas1[1][2] = 6;

        columns.change(mas1,2,3);
    }
    public void change (int[][]arr, int a, int b){

        for(int j=0;j<b;j++) {
            System.out.println( "Column #" + j);

            for (int i = 0; i < a; i++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
