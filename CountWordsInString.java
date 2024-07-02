public class CountWordsInString {
    public static void main(String[]args){
        String s="welcome to java";

        int count=1;//assume the their is must one word in present in string

        for(int i=0;i<s.length()-1;i++)
        {
            if( s.charAt(i)==' '&&  s.charAt(i+1)!=' ')//whenever the space is detect then entry into a loop and count increases
            {
                count++;

            }

        }
        System.out.println("Number of words in a string: "+count);
    }
    
}

/*Let's go through the example string "welcome to java" step by step:

i=0: 'w' - not a space, so no change to count.
i=1: 'e' - not a space.
i=2: 'l' - not a space.
i=3: 'c' - not a space.
i=4: 'o' - not a space.
i=5: 'm' - not a space.
i=6: 'e' - not a space.
i=7: ' ' - space detected, and the next character ('t') is not a space, so we increment count to 2.
i=8: 't' - not a space.
i=9: 'o' - not a space.
i=10: ' ' - space detected, and the next character ('j') is not a space, so we increment count to 3.
i=11: 'j' - not a space.
i=12: 'a' - not a space.
i=13: 'v' - not a space.
i=14: 'a' - not a space. */
