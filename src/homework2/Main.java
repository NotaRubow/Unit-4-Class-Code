package homework2;

//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("racecar");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");

    }

    public static void vowelCounter(String str) {
        int numA, numE, numI, numO, numU;
        numA = numE = numI = numO = numU = 0;
        char current;
        for (int i = 0; i < str.length(); i++) {
            current = str.toLowerCase().charAt(i);
            switch (current){
                case 'a': numA++;
                    break;
                case 'e': numE++;
                    break;
                case 'i': numI++;
                    break;
                case 'o': numO++;
                    break;
                case 'u': numU++;
                    break;
            }
        }
        System.out.printf("Number of a's: %d\nNumber of e's: %d\nNumber of i's: %d\nNumber of o's: %d\nNumber of u's: %d", numA, numE, numI, numO, numU);
        System.out.println();
    }


    public static void palindromeChecker(String str) { 
        String ori = str;
        String reversed="";
        String  original= ori.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char single = original.charAt(i);
            if ((single < 48) || (single > 90 && single < 97) || (single > 122)) {
                System.out.println("Error: Invalid character detected in " + str);
                return; 
            }
        }
            
        for (int i=0; i<original.length(); i++){
 
            String single = original.substring(i,i+1);
            reversed = single + reversed;
        }
        if (original.equals(reversed))
        {
            System.out.println(str + " is a palindrome");
        }
        else 
        {
            System.out.println(str + " is not a palindrome");
        }
            
    }
        
        
}
