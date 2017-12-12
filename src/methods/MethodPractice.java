package methods;

import java.util.ArrayList;

public class MethodPractice {
	
	public static void main(String[] args){
		
		System.out.println("Q no-1:" +getName("ma a amin"));
		
		System.out.println("Q no-2:"+ getUpperCase("this is a String"));
		
		System.out.println("Q no-3: "+ getLowerCase("THIS IS A STRING"));
		
		System.out.println("Q no-4: "+ getEvenNumber(20));
		
		System.out.println("Q no-5: "+getOddNumber(20));
		
		
		
		
	}
	/**
	 * Q no:5
	 * write a method that take a number input and return the list of all odd number from 0 to that given number
	 * parameter:int number
	 * returnType:ArrayList<Integer>
	 * ServingBucket:List
	 */
	public static ArrayList<Integer> getOddNumber(int number){
		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();
		
		for(int i = 0; i <= number; i++){
			
			if(i % 2 == 1){
				
				oddNumberList.add(i);
			}
		}
		
		
		return oddNumberList; 
	}
	/**
	 * Q no:4
	 * write a method that take a number input and return the list of all even number from 0 to that given number
	 * parameter:int number
	 * returnType:ArrayList<Integer>
	 * ServingBucket:list
	 */
	public static ArrayList<Integer> getEvenNumber(int number){
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();
		
		for(int i = 0; i <= number; i++){
			
			if(i % 2 == 0){
				evenNumberList.add(i);
				
			}
		}
		
		
		return evenNumberList;
	}
	/**
	 * Q no:3
	 * write a method that take one String input and return same String in lower case
	 * parameter:String text
	 * returnType:String
	 * SrtvingBucket:variable
	 */
	public static String getLowerCase(String text){
		String lowerCaseText = null;
		
		lowerCaseText = text.toLowerCase();
		
		
		return lowerCaseText;
	}
	/**
	 * Q no:2 
	 * write a method that take one String input and return same String in upper case
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getUpperCase(String text){
		String upperCaseText = null;
		
		upperCaseText = text.toUpperCase();
		
		
		return upperCaseText;
	}
	
	/**
	 * Q no:1
	 * write a method that take your name input and return your name
	 * parameter:String name
	 * returnType:String text
	 * ServingBucket:variable
	 */
	public static String getName(String name){
		String text = null;
		
		text = name;
		
	
		return text;
	}

}
