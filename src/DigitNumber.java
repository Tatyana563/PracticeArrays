public class DigitNumber {
    public static void main(String[] args) {
        digitSum(123);
    }
    public static void digitSum(int x){
        int sum = 0;
        int k;
        while(x!=0) {

             k = x % 10;
            sum = sum + k;
            x /= 10;

        }
        System.out.println("Sum of digits of the number is "+sum);
    }
}
