import java.util.Scanner;
public class Palindromechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if(input.equals(reversed)){
            System.out.println("the string is a palindrome");
        }else{
            System.out.println("the string is not a palindrome");
        }
        sc.close();

     }

}