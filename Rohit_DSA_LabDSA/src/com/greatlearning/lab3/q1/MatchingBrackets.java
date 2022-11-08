package com.greatlearning.lab3.q1;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
	
	public static boolean checkBrackets(String input) {
		Stack <Integer> stack = new Stack<> ();
		String openingBrackets = "([{<";
		String closingBrackets = ")]}>";
		String brackets = openingBrackets + closingBrackets;
		
		for (char ch: input.toCharArray()) {
			if(!brackets.contains(ch+"")) {
				continue;				
			}
			int index = -1;
			if((index = openingBrackets.indexOf(ch))!= -1 ) {
				stack.push(index);
				continue;
			}
			index=stack.pop();
			if(ch!=closingBrackets.charAt(index)) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scr = new Scanner (System.in);){
			System.out.println("Enter the Inputs with brackets");
			String input = scr.next();
			boolean check = checkBrackets(input);
			if (check) {
				System.out.println("The entered String has Balanced Brackets: ");
			}
			else {
				System.out.println("The entered Strings do not contain Balanced Brackets:");
			}
		}
	}

}
