import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        TwoNumbers test =new  TwoNumbers();
        test.numbersSum();
    }
    public void numbersSum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type two numbers");
        try {
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();

            int sum = 0;
            sum = number1 + number2;
            System.out.println(sum);
        }
        catch(InputMismatchException e){
            System.out.println("Please enter numbers");
        }
    }
}
