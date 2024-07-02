public class CountCharacterOccuranceInWholeString {
    
        public static void main(String[] args) {
            String s = "Java Programming Java oops";
            int totalcount = s.length();
            int totalcount_afterRemove = s.replace("a", "").length();
            int count = totalcount-totalcount_afterRemove;
            System.out.println("Number of occurrences of 'a' is: " + count);
           // System.out.println(totalcount);
        }
    }
    

        
    
