public class ArrayEvenOdd {
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6};
        System.out.println("For printing even no.......");
        for(int i=0;i<a.length;i++)
        {
           if(a[i]%2==0)
           {
              System.out.println(a[i]);
           }

        }


        System.out.println("For printing odd no.........");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
        }   }

    }

    
}