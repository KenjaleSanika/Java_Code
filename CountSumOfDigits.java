public class CountSumOfDigits {
    public static void main(String[]args){
        int num=1234;
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10;//extract last digit from num(% operator gives remainder as a output)
            num=num/10;//removes the last digit from the number(/ operator gives us a quotitent mean division keylvr je vrti raht te)
        }

        System.out.println("count the sum of digits: "+sum);//+ is a cancatention operator
    }
    
}
