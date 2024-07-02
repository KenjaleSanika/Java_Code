public class SwapTwoNosWithoutThirdVariable {
    public static void main(String[]args){
        int n1= 10;
        int n2=30;
        System.out.println("Before swapping  "+n1+" ,"+n2);

        n1=n1+n2;//n1=10+30=40
        n2=n1-n2;//n2=40-30=10
        n1=n1-n2;//n1=40-10=30
        System.out.println("After swapping  "+n1+" ,"+n2);

           

    }
    
}
