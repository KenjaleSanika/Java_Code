public class RemovewhiteSpacesInString {
    public static void main(String[]args){
        String str= "java is best lang";
        System.out.println("before removing white spaces: "+str );

        str=str.replaceAll("[\\s]","");// (\\s to remove the white space in string)m98765432

        System.out.println("after removing white spaces: "+str);
        
    }
    
}
