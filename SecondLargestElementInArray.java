public class SecondLargestElementInArray {
    public static void main(String[]args){
        int a[]={6,8,2,4,3,1,5,7,100,130};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for( int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])//6<8
                {
                    temp=a[i];//temp=6
                    a[i]=a[j];//a[i]=8
                    a[j]=temp;//a[j]=6
                }

               
            }
        }

        System.out.println("Sencond largest element in array is "+a[1]);
    }
    
}

/* in this program we first arrange the given array in descending order by swapping and then print a a[1 ] element */
//{8,6,2,4.....}