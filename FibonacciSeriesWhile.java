public class FibonacciSeriesWhile {
    public static void main(String[] args) {
        int i=2,a=0,b=1;
        //System.out.println(a+" "+b);
        System.out.println(a);
        System.out.println(b);
        int c;
        while(i<10){
            c=a+b;
            //System.out.println(" "+c);
            System.out.println(c);
            a=b;
            b=c;
            i++;
           
        }
    }
}
