import java.util.Scanner;
public class ArmstrongNumberByTakingInputFromUser {
    public static void main(String[]args){
        int n,temp,arm=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        n= sc.nextInt();
        temp=n;

        while(n>0){
            rev=n%10;
            arm=(rev*rev*rev)+arm;
            n=n/10;
        }

        if(temp==arm){
            System.out.println("It is an Armstrong Number");

        }

        else{
            System.out.println("It is an a  Not Armstrong Number");
        }

        sc.close();


        
    }
    
}
