//In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
//The first two numbers of fibonacci series are 0 and 1.

public class FibonacciSeriesFor {
    public static void main(String[] args) {
        int i,a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int c;
    
        for(i=2;i<10;i++)//1//2//3//4//5// or for(i=2;i<10;++i)
        {
            c=a+b;//1//2//3//5
            System.out.println(c);
            a=b;//1//1//2//3
            b=c;//1//2//3//5
        }
    }
    
}
