package extraQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.files.Files;
public class Palindrome {
	public static void main(String[] args) {
		String filePath = "C:/Users/dheer/Desktop/capgemini/question1.txt";
		String reqString = "o";
		try {
			String content = Files.readString(Path.of(filePath));
			String cleanedContent = content.replaceAll("[^a-zA-Z0-9\\s]","").toLowerCase();
			
			String[] words = cleanedContent.split("\\s+");
			int count=0;
			for (String word:words) {
				if(isPalindrome(word) && word.contains(reqString)) {
					count++;
					System.out.println(word);
				}
			}
			System.out.println("total number of such words are : "+count);
		}
		catch(IOException e)
		{
			System.out.println("Error reading file : "+e.getMessage());
		}
	}
	public static boolean isPalindrome(String text) {
		if(text==null || text.length()<=1) return false;
		int left = 0;
		int right = text.length()-1;
		while(left<right) {
			if(text.charAt(left)!=text.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
		
	}
}
