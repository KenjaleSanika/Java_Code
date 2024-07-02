import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of first subject");
        int a = sc.nextInt();
        System.out.println("Enter Marks of second subject");
        int b = sc.nextInt();
        System.out.println("Enter Marks of third subject");
        int c = sc.nextInt();
        System.out.println("Enter Marks of fourth subject");
        int d = sc.nextInt();
        System.out.println("Enter Marks of fifth subject");
        int e = sc.nextInt();
        int total_Marks = a+b+c+d+e;
        float percentage=total_Marks*100/500;
        System.out.println("Your Marks is ="+total_Marks);
        System.out.println("Your percentage is ="+percentage);
        sc.close();





    }

    
}
