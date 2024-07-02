public class FibonacciSeriesDoWhile {
    public static void main(String[] args) {
        int i=2,a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        do{
            c=a+b;
            System.out.println(c);
            i++;
            a=b;
            b=c;
        }
            while(i<10);

           
            
              
    }

} 
    

