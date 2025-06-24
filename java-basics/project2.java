package irapractice;

public class project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In Java, a String is a sequence of characters used to store and 
		// manipulate text, like "Hello" or "I love Java!".
		// It is one of the most commonly used data types in Java.

				// 1. Using String Literal (Most Common Way)
				String name = "Ira";
				System.out.println("Name using literal: " + name);
				
				System.out.println("******");

				// 2. Using the new Keyword
				String anothername = new String("Ira Jade Hingada");
				System.out.println("Name using new keyword: " + anothername);
				String[] splittedString = anothername.split(" "); //read the space
				System.out.println(splittedString[0]);
				System.out.println(splittedString[1]);
				System.out.println(splittedString[2]);
				System.out.println(splittedString[1].trim());
				//for(int i = 0; i < anothername.length(); i++)
				//{
				//	System.out.println(anothername.charAt(i)); //to read letter by letter
				//}
				//for(int i = anothername.length()-1; i >= 0; i--)
				//{
				//	System.out.println(anothername.charAt(i)); //for reversed print
				//}
				
				System.out.println("******");
				
				System.out.println("Length of name: " + name.length());
				System.out.println("Uppercase: " + name.toUpperCase());
				System.out.println("Lowercase: " + name.toLowerCase());
				System.out.println("Is equal: " + name.equals(anothername));
				System.out.println("Is same object: " + (name == anothername));
	}

}

#String handling, split, compare, and methods#
