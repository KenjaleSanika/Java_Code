public class SumOfArray {
    public static void main(String[]args){
        int a[]={1,2,3,4,5};//n=5 length is:n-1=4
       int sum=0;
        for(int i=0;i<=a.length-1;i++)//i=0,0<=4 i=1,1<=4 i=2,2<=4  i=3,3<=4  i=4,4<=4
        {
            sum=sum+a[i];//sum=0+1=1,sum=1+2=3, sum=3+3=6 sum=6+4=10  sum=10+5=15
            
        }
        System.out.println("Sum of Array elements:"+sum);
        

    }
    
}
