public class StarPattern9 {
    public static void main(String[]args){
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)//j-- means decrement the value
            {
                System.out.print(" ");

            }
               for(int k=1;k<(i*2);k++)//or we cwn also erite k<=(i*2-1) condition
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
