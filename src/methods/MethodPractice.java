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
		
		System.out.println("Q no-14: "+getFizzBuzz(21));
		
		int[] numberArray = { 20,10,3,40,15,50,35 };
		System.out.println("Q no-15: "+getMaxNumber(numberArray));
		
		int[] numArray = { 30,10,5,60,50,35 };
		System.out.println("Q no-16: "+getMinNumber(numArray));
		
		System.out.println("Q no-17: "+getConvertedString(10));
		
		System.out.println("Q no-18: "+getTextValue("15"));
		
		System.out.println("Q no-19: "+SearchCharA("This is a String"));
		
		System.out.println("Q no-20: "+getSum("This is a String"));
		
		System.out.println("Q no-21: "+getLastFiveChar("This is a String"));
		
		System.out.println("Q no-22: "+getFirstFiveChar("This is a String"));
		
		System.out.println("Q no-23: "+getFithToTenth("This is a String"));
		
		System.out.println("Q no-24: "+getWord("This is a String"));
		
		System.out.println("Q no-25: "+getFirstWord("This is a String"));
		
		System.out.println("Q no-26: "+getWordCount("This is a String", "is"));
		
		System.out.println("Q no-27: "+getCharCount("This is a String", 'a'));
		
		System.out.println("Q no-28: "+searchSentence("This is a String", "is"));
		
		System.out.println("Q no-29: "+getConsonantCount("This is a String"));
		
		System.out.println("Q no-30: "+getVowelCount("This is a String"));
		
		System.out.println("Q no-31: "+getUpperCaseChar("This Is a String"));
		
		System.out.println("Q no-32: "+getCharCountTwo("This is a String"));
		
		System.out.println("Q no-33: "+getRepeatedChar("This is a String"));
		
		System.out.println("Q no-34: "+getUniqueChar("This is a String"));
		
		int[] numberArrayFour = { 10,15,20,40,50};
		System.out.println("Q no-35: "+getSum(numberArrayFour));
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(20);
		numList.add(25);
		numList.add(30);
		numList.add(35);
		System.out.println("Q no-36: "+getSum(numList));
		
		System.out.println("Q no-37: "+getReverseString("This is a String"));
		
		
		
		
		
		
		
		
		
	}
	/**
	 * Q no:37
	 * write a method that take one String input and the return same String in reverse order
	 * parameter:String text
	 * returnType:String
	 * servingBucket:variable
	 */
	public static String getReverseString(String text){
		String reverseString = "";
		
		for(int i = text.length()-1; i >= 0; i--){
			
			reverseString = reverseString + text.charAt(i);
		}
		return reverseString;
	}
	/**
	 * Q no:36
	 * write a method that take one integer type list input and return sum of all values
	 * parameter:ArrayList<Integer> numList
	 * returnType:int
	 * servingBucket:variable
	 */
	public static int getSum(ArrayList<Integer> numList){
		int sum = 0;
		
		for(int i = 0; i < numList.size(); i++){
			
			sum = sum + numList.get(i);
		}
		return sum;
	}
	/**
	 * Q no:35
	 * write a method that take one integer type array input and return sum of all values
	 * parameter:int[] numberArray
	 * returnType:int
	 * servingBucket:variable
	 */
	public static int getSum(int[] numberArray){
		int sum = 0;
		
		for(int i = 0; i < numberArray.length; i++){
			
			sum = sum + numberArray[i];
		}
		return sum;
	}
	/**
	 * Q no:34
	 * write a method that take one String input & return all the unique characters without whitespace
	 * parameter:String text
	 * returnType:String
	 * returnType:variable
	 */
	public static String getUniqueChar(String text){
		String uniqueChar = "";
		
		text = text.replaceAll(" ", "");
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++){
			
			for(int j = i+1; j < text.length(); j++){
				
				if(text.charAt(i) == text.charAt(j)){
					String Character = String.valueOf(text.charAt(i));
					
					if(uniqueChar.contains(Character)){
						uniqueChar = uniqueChar.replaceAll(Character, "");
						break;
					}
				}
				
			}
		}
		
		return uniqueChar;
	}
	/**
	 * Q no:33
	 * write a method that take one String input & return all repeated characters without whitespace
	 * parameter:String text
	 * returnType:String
	 * servingBucket:variable
	 */
	public static String getRepeatedChar(String text){
		String repeatedChar = "";
		
		text = text.replaceAll(" ", "");
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++){
			for(int j = i+1; j < text.length(); j++){
				
				if(text.charAt(i) == text.charAt(j)){
					String Character = String.valueOf(text.charAt(i));
					
					if(! repeatedChar.contains(Character)){
						repeatedChar = repeatedChar + text.charAt(i);
					}
					
				}
				
			}
		}
		return repeatedChar;
	}
	/**
	 * Q no: 32
	 * write a method that take one String input & return the count of characters without whitespace
	 * parameter:String text
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getCharCountTwo(String text){
		int count = 0;
		
		text = text.replaceAll(" ", "");
		
		count = text.length();
		
		return count;
	}
	/**
	 * Q no:31
	 * write a method that take one String input and return the count of all upper case characters
	 * parameter:String text
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getUpperCaseChar(String text){
		int charCount = 0;
		
		for(int i = 0; i < text.length(); i++){
			
			if(Character.isUpperCase(text.charAt(i))){
			 charCount = charCount +1;
			}
		}
		return charCount;
	}
	/**
	 * Q no:30
	 * write a method that take that take one String input and return the count of all vowels
	 * parameter:String text
	 * returnType;int
	 * ServingBucket:variable
	 */
	public static int getVowelCount(String text){
		int count = 0;
		
		String vowel = "aeiou";
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++){
			String character = String.valueOf(text.charAt(i));
			
			if(vowel.contains(character)){
				count = count+1;
			}
		}
		return count;
	}
	/**
	 * Q no:29
	 * write a method that take one String input & return the count of all consonant
	 * parameter:String text
	 * returnType:int
	 * ServingBucket;variable
	 */
	public static int getConsonantCount(String text){
		int count = 0;
		
		String consonant = "bcdfghjklmnpqrstvwxyz";
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++){
			String character = String.valueOf(text.charAt(i));
			
			if(consonant.contains(character)){
				count = count + 1;
			}
		}
		return count;
	}
	/**
	 * Q no:28
	 * write a method that take one String & one word input and return true if that sentence contain given word 
	 * otherwise return false
	 * parameter:String text, String word
	 * returnType:boolean
	 * ServingBucket:variable
	 */
	public static boolean searchSentence(String text, String word){
		boolean sentence = false;
		
		String[] wordArray = text.split(" ");
		
		for(int i = 0; i < wordArray.length; i++){
			
			if(wordArray[i].equalsIgnoreCase(word)){
				sentence = true;
			}
		}
		return sentence;
	}
	/**
	 * Q no:27
	 * write a method that take one String & one Character input and return the count of that given number
	 * parameter:String text, char Character
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getCharCount(String text, char character){
		int count = 0;
		
		text = text.toLowerCase();
		character = Character.toLowerCase(character);
		
		for(int i = 0; i < text.length(); i++){
			
			if(text.charAt(i) == character){
				
				count = count+1;
			}
		}

		return count;
	}
	/**
	 * Q no:26
	 * write a method that take one String & one word input and return the count of that given word
	 * parameter:String text, String word
	 * returnType:int
	 * ServingBucket:variable
	 */
	public static int getWordCount(String text, String word){
		int count = 0;
		
		String[] wordArray = text.split(" ");
		
		for(int i = 0; i < wordArray.length; i++){
			
			if(wordArray[i].equalsIgnoreCase(word)){
				count = count+1;
			}
		}
		
		return count;
	}
	/**
	 * Q no:25
	 * write a method that take one String input and return first word
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getFirstWord(String text){
		String firstWord = null;
		
		String[] wordArray = text.split(" ");
		
		firstWord = wordArray[0];
		
		return firstWord;
	}
	/**
	 * Q no:24
	 * write a method that take one String input and return a list of all word
	 * parameter:String text
	 * returnType:ArrayList<String>
	 * servingBucket:list	
	 */
		public static ArrayList<String> getWord(String text){
			ArrayList<String> wordList = new ArrayList<String>();
			
			String[] wordArray = text.split(" ");
			
			for(int i = 0; i < wordArray.length; i++){
				
				wordList.add(wordArray[i]);
			}
			
			return wordList;
		}
	/**
	 * Q no:23
	 * write a method that take one String input and return fifth to tenth character as a String
	 * parameter:String text
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getFithToTenth(String text){
		String subsString = null;
		
		subsString = text.substring(4, 10);
		
		return subsString;
	}
	/**
	 * Q no:22
	 * write a method that take one String input and return a List Firts Five Character
	 * parameter:String text
	 * returnType:ArrayList<Character>
	 * SeringBucket:List
	 */
	public static ArrayList<Character> getFirstFiveChar(String text){
		ArrayList<Character> charList = new ArrayList<Character>();
		
		for(int i = 0; i <= 4; i++){
			
			charList.add(text.charAt(i));
		}
		
		return charList;
	}
	/**
	 * Q no:21
	 * write a method that take one String input and return a list of last five character
	 * parameter:String text
	 * returnType:ArrayList<Character>
	 * ServingBucket:list
	 */
	public static ArrayList<Character> getLastFiveChar(String text){
		ArrayList<Character> charList = new ArrayList<Character>();
		
		for(int i = text.length() -5; i < text.length(); i++){
			
			charList.add(text.charAt(i));
		}
		
		return charList;
	}
	/**
	 * Q no:20
	 * write a method that a one String input and return the sum of all index
	 * parameter:String text
	 * returnType:int
	 * ServingBucket;variable
	 */
	public static int getSum(String text){
		int result = 0;
		
		for(int i = 0; i < text.length(); i++){
			
			result = result + i;
		}
		
		return result;
	}
	/**
	 * Q no:19
	 * write a method that take String input & return true if it contains char 'a' otherwise return false
	 * parameter:String text
	 * returnType:boolean
	 * ServingBucket:variable
	 */
	public static boolean SearchCharA(String text){
		boolean result = false;
		
		text = text.toLowerCase();
		
		result = text.contains("a");
		
		return result;
	}
	/**
	 * Q no:18
	 * write a method that take a String representation of number input and return the same value as
	 *  an Integer
	 *  parameter:String number
	 *  returnType;int
	 * ServingBucket:variable
	 */
	public static int getTextValue(String number){
		int textValue = 0;
		
		textValue = Integer.valueOf(number);
		
		return textValue;
	}
	/**
	 * Q no:17
	 * write a method that take a number input and return the same value as a String
	 * parameter:int number
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getConvertedString( int number){
		String text = null;
		
		text = String.valueOf(number);
		
		return text;
	}
	/**
	 * Q no:16
	 * write a method that take one number array input and return the Min number
	 * parameter:int[] numArray
	 * returnType:int
	 * SerVingBucket:variable
	 */
	public static int getMinNumber(int[] numArray){
		int minNumber = numArray[0];
		
		for(int i = 0; i < numArray.length; i++){
			
			if(minNumber > numArray[i]){
				
				minNumber = numArray[i];
			}
		}
		
		return minNumber;
	}
	/**
	 * Q no:15
	 * write a method that take one number array input and return the max number
	 * parameter:int[] numberArray
	 * returnType:int
	 * SerVingBucket:variable
	 */
	public static int getMaxNumber(int[] numberArray){
		int maxNumber = numberArray[0];
		
		for(int i = 0; i < numberArray.length; i++){
			
			if(maxNumber < numberArray[i]){
				
				maxNumber = numberArray[i]; 
			}
		}
		
		return maxNumber;
	}
	/**
	 * Q no:14
	 * write a method that take one number input and return 'fizz' if the given number divided by 5
	 * and return 'buzz'if the given number divided by 5 && 3 otherwise return 'fizz buzz'
	 * parameter:int number
	 * returnType:String
	 * ServingBucket:variable
	 */
	public static String getFizzBuzz(int number){
		String message = null;
		
		if(number % 5 == 0 && number % 3 == 0){
			message = "buzz";
			
		}else if(number % 5 == 0){
			message = "fizz";
			
		}else{
			message = "fizz buzz";
		}
		
		return message;
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
