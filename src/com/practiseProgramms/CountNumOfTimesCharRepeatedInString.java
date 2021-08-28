package com.practiseProgramms;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountNumOfTimesCharRepeatedInString {

	
	public static int countNumOfCharInString(String s,char ch)
	{
		int total=s.length();
		int minus=s.replaceAll(String.valueOf(ch),"").length();
		return (total-minus);
	}
	
	@Test
	public static void testCountNumOfCharInString()
	{
		System.out.println("char repeated in given string is :"+countNumOfCharInString("this is my name you know are you there",'e'));
	}
	

	static String getUniqueCharacterSubstring(String input) {

		Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    return output;
	}
	
	@Test
	public static void testgetUniqueCharacterSubstring()
	{
		System.out.println(getUniqueCharacterSubstring("hellomy"));
	}
}
