import java.util.Scanner;
public class PalindromNoByTakingInputFromUser{ 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int rem,sum=0,temp;
        //int num=151;
        temp=num;
        while(num!=0){//151>0,15>0,1>0,0 not greater than 0 so stop at that moment
            rem=num%10;//151%10=1, 15%10=5,1%10=1
            sum=(sum*10)+rem;//(0*10)+1=1,(1*10)+5=15,(15*10)+1=151
            num=num/10;//151/10=15,15/10=1,1/10=0

        }
        if(temp==sum){
            System.out.println("It is a palindrom number");
        }
        else{
            System.out.println("It is a not palindrom number");
        }
        sc.close();
    
    }

}

