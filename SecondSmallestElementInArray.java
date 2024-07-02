public class SecondSmallestElementInArray {
    public static void main(String[]args){
        int a[]={6,8,2,4,3,1,0,5,7,100,130};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for( int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

               
            }
        }

        System.out.println("Sencond smallest element in array is "+a[1]);
    }

    
}
/* in this program we first arrange the given array in ascending order by swapping and then print a a[1 ] element */
//{0,1,2....}