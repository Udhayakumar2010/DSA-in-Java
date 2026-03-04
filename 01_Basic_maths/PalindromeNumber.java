import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int palindrome = num;
        int reverse = 0;
        int rem = 0;

        while(num>0){
            rem = num%10;
            reverse = reverse*10 +rem;
            num = num/10;
        }
        if(palindrome == reverse){
            System.out.println("The number is a palindrome");
        } 
        else {
            System.out.println("The number is not a Palindrome");
        }
        sc.close();
 }
}
