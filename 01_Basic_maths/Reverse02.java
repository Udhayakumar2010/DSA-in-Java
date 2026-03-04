import java.util.Scanner;
public class Reverse02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        String reverse = "";

        
   for(int i = String.valueOf(num).length()-1; i>=0; i--){
    reverse = reverse + String.valueOf(num).charAt(i);
   }
   System.out.println("Reversed number: " + reverse);
}
}
