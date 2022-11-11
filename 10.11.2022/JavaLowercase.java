package pro1;
//Write a Java program to find sequences of lower case letters joined with a underscore

import java.util.Scanner;
public class JavaLowercase {
	public static void main(String[] args) {
		System.out.println(validate("java_exercises"));
		System.out.println(validate("Java_exercises"));
		System.out.println(validate("java_Exercises"));		
		System.out.println(validate("Java_Exercises"));	
        }

   public static String validate(String text) {
	   if (text.matches("^[a-z]+_[a-z]+$"))
                return "Found a match!";
       else
                return "Not matched!";
   }
}	

	