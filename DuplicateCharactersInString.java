
public class DuplicateCharactersInString {
    public static void main(String[]args){
        String name="Automation";
        int count=0;
        char[]ch=name.toCharArray();//This line converts the string name into a character array ch  The toCharArray() method of the String class converts each character of the string into a separate element in a char array. So, after this line, ch will be an array containing the characters of the string "Automation".
       // Original String: Automation
        //Characters in char array: A u t o m a t i o n 
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            
            {
                if(ch[i]==ch[j])
                {
                    System.out.println("duplicate characters in string are :" +ch[i]);
                    count++;
                }
               
            }
        }
        /*  if(count==0){
            System.out.println("duplicate element not found");
        }*/
        System.out.println("duplicate character count :" +count);
    }
    
}
