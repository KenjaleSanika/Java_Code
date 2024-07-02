

public class Operators {
    public static void main(String[]args){
    //Arithmetic Operator(+)
        int a =4;
        int b = 6+a;
        System.out.println(b);
    
    //Assignment Operator(+=)
        int c = 9;
        c+= 3;
        System.out.println(c);
    //Arithmetic Operator(=*)
        int d = 9;
        d*= 3;
        System.out.println(d);
    //Comparison Operator
        System.out.println(6==8);
        System.out.println(6==6);
        System.out.println(64>6);
        System.out.println(64<6);
    //Logical Operator(&&(And)) 
       System.out.println(64>5&&64>6);
       System.out.println(64>5&&64>98);
       System.out.println(64>98&64>66);   
    //Logical Operator(||(OR))
       System.out.println(64>5||64>98); 
    //Bitwise Operator
        System.out.println(2&3);      
    //Returns Decimal Value    
        double g = 4.8%1.1; 
        System.out.println(g);   

    }
    
}
