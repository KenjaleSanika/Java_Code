import java.util.Scanner;
public class UserEnterNoIntegerOrNot {
    public static void main(String[]args){
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();

    }
    
}
