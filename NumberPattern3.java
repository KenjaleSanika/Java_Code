public class NumberPattern3 {
    public static void main(String[]args){
        int count=0;

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count=count+1;//1,1+1=2,2+1=3 so on...........
                System.out.print(count+" ");//" " it is for space in between number
            }

            System.out.println();

        }
    }
}    
        
    
