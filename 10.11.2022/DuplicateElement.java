/*write a java program to find duplicate values of an array of integer values*/
package pro1;
public class DuplicateElement {  
	public static void main(String[] args) 

    {      

        //Initializing an array   

        int [] a1 = new int [] {1,2, 3, 5 ,7, 2, 7, 8,9,9};   

          

        System.out.println("Duplicate elements in given array: ");  

        //Search for duplicate element in an array  

        for(int i = 0; i < a1.length; i++) 

        {  

            for(int j = i + 1; j < a1.length; j++) 

            {  

                if(a1[i] == a1[j])  

                    System.out.println(a1[j]);  

            }  

        }  

    }  

}  

 