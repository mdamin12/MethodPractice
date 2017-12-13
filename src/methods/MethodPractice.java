package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {
	
	public static void main(String[] args){
		
		System.out.println("Q no-1:" +getName("ma a amin"));
		
		System.out.println("Q no-2:"+ getUpperCase("this is a String"));
		
		System.out.println("Q no-3: "+ getLowerCase("THIS IS A STRING"));
		
		System.out.println("Q no-4: "+ getEvenNumber(20));
		
		System.out.println("Q no-5: "+getOddNumber(20));
		
		System.out.println("Q no-6: "+getKilometer(5));
		
		System.out.println("Q no-7: "+getIndex("This is a String"));
		
		System.out.println("Q no-8: "+getChar("This is a String"));
		
		System.out.println("Q no-9: "+getSum(20));
		
		System.out.println("Q no-10:"+ getSquare(10));
		
		System.out.println("Q  no-11:"+ Arrays.toString(getNumberArray(20)));
		
		System.out.println("Q no-12: "+ Arrays.toString(getNumberArrayTwo(20)));
		
		System.out.println("Q no-13: "+getNumber(25));
		
		
		
		
	}
	/**
	 * Q no:13
	 * write a method that take one number input and return a number list starting from 0 to that given number
	 * parameter:int number
	 * returnType:List
	 * ServingBucket:list
	 */
	public static ArrayList<Integer> getNumber(int number){
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		for(int i = 0; i <= number; i++){
			
			numberList.add(i);
		}
		
		
		return numberList;
	}
	/**
	 * Q no:12
	 * write a method that take one number input and return an array that contains 1 to given number
	 * parameter:int number
	 * returnType:int[]
	 * ServingBucket:array
	 */
	public static int[] getNumberArrayTwo(int number){
		int[] numberArray = new int[number];
		
		for(int i = 1; i <= number; i++){
			
			numberArray[i -1] = i;
		}
		
		
		return numberArray;
	}
	/**
	 * Q no:11
	 * write a method that take one number input and return an array that contains 0 to given number
	 * parameter:int number
	 * returnType:int[]
	 * ServingBucket:Array
	 */
	public static int[] getNumberArray(int number){
		int[] numberArray = new int[number +1];
		
		for(int i = 0; i <= number; i++){
			
			numberArray[i] = i;
		}
		
		
		return numberArray;
	}
	/**
	 * Q no:10
	 * write a method that take number input and return square of the given number
	 * parameter:int number
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getSquare(int number){
		int square = 0;
		
		square = number * number;
		
		
		return square;
	}
	/**
	 * Q no:9
	 * write a method that take one number input and return the sum of 1 to that given number
	 * parameter:int number
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getSum(int number){
		int sum = 0;
		
		for( int i = 1; i <= number; i++){
			
			sum = sum +i;
		}
		
		
		return sum;
	}
	/**
	 * Q no:8
	 * write a method that take one String input and return a list of all character
	 * parameter:String text
	 * returnType:Arraylist<Character>
	 * ServingBucket:List
	 */
	public static ArrayList<Character> getChar(String text){
		ArrayList<Character>charList = new ArrayList<Character>();
		
		for(int i = 0; i < text.length();i++){
			
			charList.add(text.charAt(i));	
		}
		
		
		return charList;
	}
	/**
	 * Q no:7
	 * write a method that take one String input and return a list of all index
	 * parameter:String text
	 * returnType:ArrayList<Integer>
	 * ServingBucket:List
	 */
	public static ArrayList<Integer> getIndex(String text){
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		
		for(int i = 0; i < text.length(); i++){
			
			indexList.add(i);
		}
		
		return indexList;
	}
	/**
	 * Q no:6
	 * write a method that take input as mile & return as kilometer
	 * parameter:double mile
	 * returnType:double
	 * ServingBucket:variable
	 */
	public static double getKilometer(double mile){
		double kilometer = 0;
		
		kilometer = mile * 1.609;
		
		
		return kilometer;
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
