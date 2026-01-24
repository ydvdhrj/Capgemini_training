package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Example {

	/**
	 * RegexMasterClass
	 * * A complete demonstration of Java Regular Expressions (Regex).
	 * This class covers Character Classes, Negation, and Quantifiers.
	 * * # concepts
	 * * 1. \d, \D : Digits and Non-Digits
	 * 2. \w, \W : Word characters and Non-Word characters
	 * 3. \s, \S : Whitespace and Non-Whitespace
	 * 4. [...]  : Custom Sets (Ranges, Unions)
	 * 5. ?      : The "0 or 1" Quantifier (Optionality)
	 */

	    public static void main(String[] args) {
	        System.out.println("=== 1. DIGITS (\\d and \\D) ===");
	        // SCENARIO: You are processing a dirty phone number entry.
	        // \d = "Any number 0-9"
	        // \D = "Any character that is NOT a number"
	        
	        String dirtyPhone = "Phone: (123) 456-7890 (Work)";
	        
	        // Use \D to find everything that isn't a number and delete it.
	        // We use replaceAll() here because it's the most common use case for \D.
	        String cleanPhone = dirtyPhone.replaceAll("\\D", ""); 
	        
	        System.out.println("Original: " + dirtyPhone);
	        System.out.println("Regex \\D result: " + cleanPhone); // Output: 1234567890
	        
	        // Use \d to check if the result is purely numeric now.
	        // matches() returns true only if the WHOLE string matches the pattern.
	        // \\d+ means "one or more digits".
	        boolean isNumeric = cleanPhone.matches("\\d+");
	        System.out.println("Is numeric (\\d+)? " + isNumeric);


	        System.out.println("\n=== 2. WORD CHARACTERS (\\w and \\W) ===");
	        // SCENARIO: Validating a Username.
	        // \w = [a-zA-Z0-9_] (Letters, numbers, and underscore)
	        // \W = Anything else (symbols, spaces, emoji)

	        String validUser = "Pro_Gamer_123";
	        String invalidUser = "Pro Gamer!@#"; // Contains space and symbols

	        // We check if the string contains ONLY word characters from start to finish.
	        System.out.println("Checking '" + validUser + "' with \\w+: " + validUser.matches("\\w+"));
	        System.out.println("Checking '" + invalidUser + "' with \\w+: " + invalidUser.matches("\\w+"));

	        // We can use \W to find the "illegal" characters in the bad username.
	        // This replaces any non-word char with a "*"
	        System.out.println("Censoring bad chars in '" + invalidUser + "': " + invalidUser.replaceAll("\\W", "*"));


	        System.out.println("\n=== 3. WHITESPACE (\\s and \\S) ===");
	        // SCENARIO: Fixing user input with weird spacing.
	        // \s = [ \t\n\x0B\f\r] (Space, tab, newline, etc.)
	        // \S = Any visible character

	        String messyInput = "Java    is\t\tcool";
	        
	        // Replace ONE OR MORE (+) whitespace characters with a single space.
	        String cleanSentence = messyInput.replaceAll("\\s+", " ");
	        
	        System.out.println("Messy: '" + messyInput + "'");
	        System.out.println("Cleaned with \\s+: '" + cleanSentence + "'");


	        System.out.println("\n=== 4. CUSTOM CLASSES ([...]) ===");
	        // SCENARIO: Finding specific ranges or letters.
	        
	        String text = "Score: 100, Rank: A, Level: 5";

	        // [a-z]   : Matches any lowercase letter
	        // [A-Z]   : Matches any uppercase letter
	        // [0-9]   : Matches any digit (same as \d)
	        // [aeiou] : Matches only vowels (Custom set)
	        // [^0-9]  : (Negation) Matches anything that is NOT a digit
	        
	        System.out.println("Original: " + text);
	        
	        // Let's remove everything that is NOT a digit ([^0-9]) to keep only scores
	        System.out.println("Only Digits (using [^0-9]): " + text.replaceAll("[^0-9]", ""));
	        
	        // Let's hide all vowels
	        System.out.println("No Vowels (using [aeiou]): " + text.replaceAll("[aeiou]", "*"));
	        
	        // Let's find only Uppercase letters
	        printMatches("[A-Z]", text); // Should print S, R, A, L


	        System.out.println("\n=== 5. QUANTIFIER: OPTIONAL (?) ===");
	        // SCENARIO: Handling spelling variations (American vs British English).
	        // ? means "The character before this is optional (0 or 1 time)"
	        
	        String american = "color";
	        String british = "colour";
	        String wrong = "colouur"; // Too many 'u's

	        // Pattern: colou?r
	        // This means: c-o-l-o-(maybe u)-r
	        String pattern = "colou?r";

	        System.out.println("Does 'color' match 'colou?r'? " + american.matches(pattern));
	        System.out.println("Does 'colour' match 'colou?r'? " + british.matches(pattern));
	        System.out.println("Does 'colouur' match 'colou?r'? " + wrong.matches(pattern));
	    }

	    /**
	     * Helper method to find and print matches using the Pattern/Matcher API.
	     * This is the "Under the hood" way Java handles regex.
	     */
	    private static void printMatches(String regex, String text) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);

	        System.out.print("Finding matches for regex '" + regex + "': ");
	        
	        // .find() advances the cursor to the next match
	        while (matcher.find()) {
	            System.out.print("['" + matcher.group() + "'] ");
	        }
	        System.out.println();
	    }
	}

