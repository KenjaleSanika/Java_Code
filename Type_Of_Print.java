public class Type_Of_Print {
    public static void main(String[]args){
        int a = 45;
        System.out.println(a);//println:The println print the print the space after te word which we have to print in this statement 
        String str = "hello";
        System.out.print(str);//print: The print can't put the space after the word which we have to print in this statement
        int b= 50;
        float c = 5.4234f;
       // System.out.printf("The value of a is %d and the value of b id %f",b,c);//print the corresponds value assigned above        
        //System.out.format("The value of a is %d and the value of b id %f",b,c);//print the corresponds value assigned above same as printf   
        //System.out.printf("The value of a is %d and the value of b id %8.2f",b,c);//when we write the 8.2f then in o/p there are eight no of space before o/p no   
        System.out.printf("The value ofa is %d and the value of b id %.2f",b,c);// when we write the .2f then in o/p there will be a only two no after the point
    }
    
}
