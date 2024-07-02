public class fibonacciSeriesRecursion {
    static int a=0,b=1,c;// Declare static variables a, b, and c
     void fibonaccis(int i){ // Recursive method to generate and print Fibonacci series
        if(i>=1){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            fibonaccis(i-1);//Recursive call to generate the next number in the series 
        }
     }
    public static void main(String[] args) {
       System.out.print(a+" "+b);
       fibonacciSeriesRecursion obj= new fibonacciSeriesRecursion();// Create an object of the fibonacciSeriesRecursion class

       obj.fibonaccis(10);// Call the fibonaccis method with the argument 10
       


    
   }
}

    

