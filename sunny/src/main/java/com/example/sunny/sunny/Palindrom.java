package com.example.sunny.sunny;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Palindrom {
	
	public static void main(String[] args) {
		System.out.println("Is radar a Palindrome? - " + isPal("test"));
	}
	
	public static boolean isPal(String orinalString) {
		//String tempString = str.replaceAll("\\s+", "").toLowerCase();
		 
		/*
		 * return IntStream.range(0, str.length() / 2) .noneMatch(i -> str.charAt(i) !=
		 * str.charAt(str.length() - i - 1));
		 */
/*		String reversedString = "";
		 
        for (int i = orinalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + orinalString.charAt(i);
        }
 
        return orinalString.equals(reversedString);
	}*/
		
		String revString ="";
		for (int i = orinalString.length()-1; i >0; i--) {
			revString = revString + orinalString.charAt(i);
		}
		return orinalString.equals(revString);
			
		}

}
