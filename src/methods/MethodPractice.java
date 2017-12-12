package methods;

public class MethodPractice {
	
	public static void main(String[] args){
		
		System.out.println("Q no-1:" +getName("ma a amin"));
		
		System.out.println("Q no-2:"+ getUpperCase("this is a String"));
		
		System.out.println("Q no-3: "+ getLowerCase("THIS IS A STRING"));
		
		
		
		
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
