import java.util.Scanner;
public class Armstrong_number{

// An Armstrong number (also called Narcissistic number) means:
     //Sum of each digit raised to the power of total digits = original number
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int originalnum = findArmstrong(num);
        if(originalnum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }

    }
  public static int findArmstrong(int num){
           int rem =0;
           int sum = 0;

           while(num>0){
            rem = num%10;//Extracting the last digit

            sum = sum +(rem*rem*rem);
            num = num/10;//removing the last digit
 
           }
        return sum;
    }
}