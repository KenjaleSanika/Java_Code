public class ReverseString {
    public static void main (String[]args){
        String name="sanika";
        int lang=name.length();//6
        String reverse="";
        for(int i=lang-1;i>=0;i--){//lang means lenght-1 so, 5,4 so on
            
            reverse= reverse+name.charAt(i);//empty+charAt(5)(so at 5 no which character are presnt)
    
        }
          System.out.println(reverse);//a,k so on
    }

    
    
    
}



