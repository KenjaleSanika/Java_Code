public class RemoveJunkOrSpecialCharactersinString {
    public static void main(String[]args){
        String s="@#!$*^%#!#$%^&^l lating string 123456";

        String s1="%@#& sanika *%!#@$ss  &**&7 music";
        s=s.replaceAll("[^a-zA-Z0-9]","");//^ (char operator)require in starting it is the part of syntax chr operator is use to other this all replace with empty cotetion

        s1=s1.replaceAll("[^a-zA-Z0-9]","");
       
        System.out.println(s);

        System.out.println(s1);

    }
    
}
