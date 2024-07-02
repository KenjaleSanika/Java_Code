public class Practice_Set2Q2 {
    public static void main(String[]args){
        char grade = 'B';
    //Encrypting thr grade    
        grade = (char)(grade + 8);//cast in char
        System.out.println(grade);

    //Decrypting the grade
        grade = (char)(grade - 8);//cast in char
        System.out.println(grade); 

    }
    
}
