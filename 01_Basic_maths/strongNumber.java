import java.util.Scanner;
public class strongNumber {
  public static int factorial(int num){
    int fact = 1;
    for(int i = 1 ; i<=num; i++){
        fact = fact * i;
    }
    return fact;
  }


 public static void main(String []args){
   Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
    int Strong = num;
    int sum = 0;
    while(num>0){
        int rem = num%10;
        int fact = factorial(rem);
        sum = sum + fact;
        num = num /10;
    }
    if(sum == Strong){
        System.out.println(Strong + " is a strong number");
    } else {
        System.out.println(Strong + " is not a strong number");
    }
 }
}

