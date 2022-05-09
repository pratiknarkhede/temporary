package com.practise;

public class CheckDigits {

	public static void main(String[] args) {		
		String strArray[] = { "165636", "16+5636", "16.5636", "16-5636" };
		for (String str : strArray) {
			Boolean ifOnlyDigit = checkIfOnlyDigits(str);
			System.out.println("is given string only digits? " + ifOnlyDigit);
			ifOnlyDigit = checkIfOnlyDigits2(str);
			System.out.println("is given string only digits? " + ifOnlyDigit);
			ifOnlyDigit = checkIfOnlyDigits3(str);
			System.out.println("is given string only digits? " + ifOnlyDigit);
			
			System.out.println("----------------------");
		}
	}

	private static Boolean checkIfOnlyDigits(String str) {
		for (Character ch : str.toCharArray()) {
			if (!(ch > '0' && ch < '9'))
				return false;
			// if(!Character.isDigit(ch))return false;

			// or can use regex [0-9]+
		}
		return true;
	}

	private static Boolean checkIfOnlyDigits2(String str) {
		return str.matches("[0-9]+");
	}

	private static Boolean checkIfOnlyDigits3(String str) {
		return str.chars().mapToObj(i -> (char) i).allMatch(ch -> Character.isDigit(ch));

	}
}
