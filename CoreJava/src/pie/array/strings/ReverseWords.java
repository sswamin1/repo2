package pie.array.strings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Please enter a String : ");
	  String word = s.nextLine();
	  String reversedWord = reverseWordFun(word);
	  System.out.println("Reversed Word is: "+reversedWord);
	}

	private static String reverseWordFun(String word) {
		if(word==null || (word.length()==0))
			return "Empty String";
		
		StringBuilder sb = new StringBuilder();
		String[] arrString = word.split(" ");
		for(int i=arrString.length-1;i>=0;i--)
		{
			
			if(!arrString[i].equals(""))
				sb.append(arrString[i]).append(" ");
		}
		
		return sb.substring(0,sb.length()-1);
	}
	
	
	
}
