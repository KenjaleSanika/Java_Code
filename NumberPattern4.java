public class NumberPattern4 {
    public static void main(String[]args){
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=i;j++)
           {
              System.out.print(j+" ");
           }

           for(int k=i-1;k>=1;k--)
           {
            System.out.print(k+" ");
           }

           System.out.println();

        }

    }

    
}

/*Now, let's consider the example when i=3:

First loop (for (int i = 1; i <= 5; i++)):

i is initially set to 1, and it will iterate as long as i is less than or equal to 5.
Inside the first loop (for (int j = 1; j <= i; j++)):

This loop is responsible for printing increasing numbers.
When i=3, it will print 1 2 3 because j starts from 1 and goes up to the current value of i.
Inside the second loop (for (int k = i - 1; k >= 1; k--)):

This loop is responsible for printing decreasing numbers.
When i=3, it will print 2 1 because k starts from the previous value of i (i-1) and goes down to 1.
Output for i=3:

The first loop prints 1 2 3.
The second loop prints 2 1.
The combination of both loops gives the output for i=3 as 1 2 3 2 1.
Next iteration of the outer loop (i is incremented):

The outer loop will increment i to 4, and the process will be repeated until i reaches 5. */
