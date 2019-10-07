public class TernOperator {
    public static void main(String[] args) {
        tern(25);
    }
    public static void tern(int b) {
        int a = 0;
        if (b > 30) {
            a = 1;
        } else {
            if (b == 45) {
                a = 2;
            } else {
                a = 5;
            }
        }
        System.out.println(a);

    }
}
