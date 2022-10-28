package pro1;
import java.time.*;
public class Date {
	public static void main(String[] args)
    {
     LocalDate today = LocalDate.now(); 
     System.out.println("\n Current Date: "+today);
     System.out.println("10 days after today will be "+today.plusDays(10)+"\n");
}}
