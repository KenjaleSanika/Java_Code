public class ReverseNumber {
    public static void main(String[]args){
        int num=123;
        int rev,sum=0;
        while(num!=0)
        {

            rev=num%10;//3
            sum=(sum*10)+rev;//3
            num=num/10;//12
        }
        System.out.println("Reverse Number is:"+sum);

}
    
}
