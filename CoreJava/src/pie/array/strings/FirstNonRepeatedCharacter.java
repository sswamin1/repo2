package pie.array.strings;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {

	
	
	public static void main(String[] args) {
		firstNonRepeatedChar(args[0]);
	}

	private static void firstNonRepeatedChar(String str) {
		Character c;
		Object seenOnce = new Object();
		Object seenTwice = new Object();
		HashMap charHash = new HashMap(); 
		
		int length = str.length();
		for(int i=0;i<length;i++)
		{
			c = new Character(str.charAt(i));
			Object o = charHash.get(c);
			if(o==null)
				charHash.put(c, seenOnce);
			else
				charHash.put(c, seenTwice);
		}
		
		for(int i=0;i<length;i++)
		{
			c = new Character(str.charAt(i));
			if(charHash.get(c) == seenOnce)
				System.out.println("FirstNonRepeatable Character: "+c);
		}
		
	}
	
}
