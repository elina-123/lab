package pro1;

	
	// * 1… Write the following code: 1.
	// *  A class named Arithmetic with a method named add that takes integers as parameters and returns an integer denoting their sum.
	//A class named Adder that inherits from a superclass named Arithmetic

	class Arithmetic{
		int add(int a,int e) {
			return a+e;
		}
	}
	class Adder extends Arithmetic{
		
	}
	public class Sum {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Adder ad=new Adder();
	System.out.println("Result="+ad.add(2, 3));
		}

	}

