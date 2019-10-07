import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows would you like to have?");
        int n = scan.nextInt();
        System.out.println("How many columns would you like to have?");
        int m = scan.nextInt();
        int[][] Array1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Array1[i][j] = (int) (Math.random() * 20);
                System.out.println(Array1[i][j]);

            }
        }
        int[][] massiv={{1,3,7},{2,7,9,7}};

        for (int f = 0; f < Array1.length; f++) {
            for (int g = 0; g < Array1[f].length; g++) {
                System.out.print(Array1[f][g] + " ");
            }
            System.out.println();
        }
// f кол во строк
     //   g кол во столб
    }
}