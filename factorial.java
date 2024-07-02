public class factorial {
    public static void main(String[]args){
        int num=5;// Example: Calculate the factorial of 5
        int fact=1;// Initialize factorial to 1
        int i;
        for(i=1;i<=num;i++){// Loop from 1 to the given number (5 in this example)
           // Multiply the current factorial by the loop variable i
            fact= fact*i;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
            
        }
        System.out.println(fact);// Print the final factorial value
    }
    
}


