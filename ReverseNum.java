import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        /*System.out.println("Enter value for a integer:");
        int a =sc.nextInt();
        
        int rev = 0;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        System.out.println("Reverse Number is "+rev);*/

        //Using string
        /*System.out.println("Enter value for a string:");
        String s =sc.next();
        StringBuffer sb =new StringBuffer(s);
        StringBuffer rev = sb.reverse();

        System.out.println("Reverse string is "+rev);*/

        //using charAT
        System.out.println("Enter value for a string:");
        String s =sc.next();
        int l=s.length();
        String rev = "";
        for(int i=l-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("Reverse string is "+rev);
        sc.close();
    }
}
