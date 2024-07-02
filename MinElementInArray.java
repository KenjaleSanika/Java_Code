public class MinElementInArray {
    public static void main(String[]args){
        int a[]={60,30,40,50,10,70};
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }



        }
        System.out.println("maximum element is array is: "+min);
    }
    
}
