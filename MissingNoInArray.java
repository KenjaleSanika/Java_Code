public class MissingNoInArray {
   public static void main(String[]args){
    //array should not have a duplicates
    //array no need to be in a sorted order
    //values should be in range

    int a[]={1,2,4,5};

    int Actualsum1=0;

    for(int i=0;i<a.length;i++)
    {
        Actualsum1=Actualsum1+a[i];

    }

    System.out.println("sum of elements in array:"+Actualsum1);

    int Expectedsum2=0;

    for(int i=1;i<=5;i++)
    {
        Expectedsum2=Expectedsum2+i;
    }

    System.out.println("sum of elements in array:"+Expectedsum2);

    
    System.out.println("find the missing element in array:"+(Expectedsum2-Actualsum1));

   }    
}


