import java.util.Scanner;
public class Armstring_number02 {

    public static int findArmstrong(int num,int digits){
        int rem =0;
        int sum =0;
        while(num>0){
            rem = num%10;
            sum = sum + (int)(Math.pow(rem,digits));
            num = num/10;
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int digits = String.valueOf(num).length();
        int originalnum = findArmstrong(num, digits);
        
        if(originalnum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }

    }

}
