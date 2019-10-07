import java.util.Arrays;

public class ReverseFloat {
    public static void main(String[] args) {
        ReverseFloat reverseFloat1 = new ReverseFloat();
     //   reverseFloat1.reverse(1.23);
        reverseFloat1.sunDigit("1.23");
    }


   public double reverse(double number){
        double result=0;
       String str = Double.toString(number);
       char []ch = str.toCharArray();
       String temp="";
      for(int i=ch.length-1;i>=0;i--){
          temp=temp+String.valueOf(ch[i]);

      }
      result=Double.parseDouble(temp);
       System.out.println(temp);
       System.out.println(result);


       return 0;
   }
   public void sunDigit(String number){
        char []ch= number.toCharArray();
       int sum=0;
        for(char temp:ch){

            if(Character.isDigit(temp)){
                sum=sum+Character.getNumericValue(temp);

            }

        }
       System.out.println(sum);
   }
}
