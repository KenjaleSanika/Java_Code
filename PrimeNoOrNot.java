//prime no means divisible by only 1 and itself

public class PrimeNoOrNot {
    public static void main(String[]args){
        int number =7;
        int temp=0;
        for(int i=2;i<=number/2;i++){//2<=7/2 3.5 i,e 3

            if(number%i==0){ //7%2 is equal to zero no then break the loop
                temp=temp+1;
                break;
            }
        }
        if(temp==0){
            System.out.println("This is prime number");
        }
        else{
            System.out.println("This is not  prime number");
        }

    }
    
}
