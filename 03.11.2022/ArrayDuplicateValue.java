package pro1;
//Write a Java program to find the duplicate values of an array of integer values.
import java.util.Arrays; 
public class ArrayDuplicateValue {
	public static void main(String[] args) 
	    {
	        int[] my_array = {1,2,3,4,5,5,6,7,7,8};
	 
	        for (int i = 0; i < my_array.length-1; i++)
	            {
	            for (int j = i+1; j < my_array.length; j++)
	            {
	             if ((my_array[i] == my_array[j]) && (i != j))
	            
	             {
	    System.out.println("Duplicate Element : "+my_array[j]);
	       }}}}}
