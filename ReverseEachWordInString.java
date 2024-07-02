
public class ReverseEachWordInString {
    public static void main(String[]args){
        String str="Welcome To Java";
        String[] words=str.split(" ");
        String reverseString=" ";

        for(String w:words)
        {
            String reverseword=" ";

            for(int i=w.length()-1;i>=0;i--)
            {
                reverseword=reverseword+w.charAt(i);
            }
            reverseString=reverseString+reverseword+" ";
           
            
        }


        System.out.println(reverseString);
    }
    
}

/*Example:
Let's take the string "Welcome To Java" as an example.

String str = "Welcome To Java"; - Initialize a string variable str with the value "Welcome To Java".

String[] words = str.split(" "); - Split the string str into an array of words using the space as a delimiter. This results in the array words containing {"Welcome", "To", "Java"}.

String reverseString = " "; - Initialize a string variable reverseString with a space.

for (String w : words) { - Start a for-each loop to iterate over each word in the array words.

a. String reverseword = " "; - Initialize a string variable reverseword with a space for each word.

b. for (int i = w.length() - 1; i >= 0; i--) { - Start a loop to iterate over each character in the current word in reverse order.

reverseword = reverseword + w.charAt(i); - Append each character to the reverseword string in reverse order.
c. reverseString = reverseString + reverseword + " "; - Append the reversed word followed by a space to the reverseString.

System.out.println(reverseString); - Print the final reverseString.

Let's go through the example string "Welcome To Java" step by step:

First iteration (word "Welcome"):

reversed word: "emocleW"
reverseString: " emocleW "
Second iteration (word "To"):

reversed word: "oT"
reverseString: " emocleW oT "
Third iteration (word "Java"):

reversed word: "avaJ"
reverseString: " emocleW oT avaJ " */

