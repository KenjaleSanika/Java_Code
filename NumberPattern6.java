public class NumberPattern6 {
    public static void main(String[]args){
      for(int i=1;i<=5;i++)
      
      {
        int no=i;
        for(int j=1;j<=i;j++)
        {
            System.out.print(no+" ");
            no=no+5-j;
        }

        System.out.println();

    }  

    }
    
}


/*Now, let's consider the example when i=3:

First loop (for (int i = 1; i <= 5; i++)):

i is initially set to 1, and it will iterate as long as i is less than or equal to 5.
Inside the first loop (for (int j = 1; j <= i; j++)):

This loop is responsible for printing numbers based on the value of i.
When i=3, it will print three numbers. The variable no is initially set to the current value of i (which is 3).
In the first iteration, it prints 3 because no is 3.
In the second iteration, it prints 3 + 5 - 2 = 6 because no is updated to no + 5 - j.
In the third iteration, it prints 6 + 5 - 3 = 8.
Output for i=3:

The output for i=3 will be 3 6 8.
Next iteration of the outer loop (i is incremented):

The outer loop will increment i to 4, and the process will be repeated until i reaches 5 */