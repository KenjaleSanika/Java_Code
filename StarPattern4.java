public class StarPattern4 {
    public static void main(String[]args){
        for(int i=1;i<=5;i++)//(rows) for printing the 5 rows
        {

            for(int j=i;j<=5;j++)//(space) so at first rows print a 4 space
            {
                System.out.print( " ");
            }
            for(int k=1;k<=i;k++)//columns 
            {
                System.out.print("*");
            }
            System.out.println();
            
        }

        
    }
    
}
