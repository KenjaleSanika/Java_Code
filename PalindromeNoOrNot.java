//panlindrome no is a no that is same after reverse
//for example 151,171,545 etc

public class PalindromeNoOrNot {
    public static void main(String[]args){
        int rem=0,sum=0,temp;
        int num=151;
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
    }
    
}
