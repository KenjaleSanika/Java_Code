import java.util.Scanner;
public class Else_If_Clause {
    public static void main(String[]args){
    int age;
    System.out.println("Enter your age");
    Scanner sc= new Scanner(System.in);
    age = sc.nextInt();
    if(age>56){
        System.out.println("You are Experienced!!");
    }
    else if(age>46){
        System.out.println("You are semi-Experienced!!");
    }
    else if(age>56){
        System.out.println("You are semi-semi-Experienced!!");
    }
    else{
        System.out.println("You are not experienced!!");
    }
    sc.close();   
    }
    
}
