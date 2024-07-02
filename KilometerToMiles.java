import java.util.Scanner;
public class KilometerToMiles {
    public static void main(String[]args){
        double km, miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers");
        km=sc.nextDouble();
        sc.close();
        miles=(km*0.621371);
        System.out.printf("%f kilometers = %f Miles",km,miles);


    }
}
