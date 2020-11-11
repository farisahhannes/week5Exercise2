public class ArrayDemo
{    

	public static void main(String[] args) 

	{         

		// declare & create an array of integers
		// int[]  anArray=  new int[10]; 


		//  // assign a value to each array element and print 
		// // array 1d s
		// for (int i= 0; i< anArray.length; i++) 
		// 	{
		// 		anArray[i] = i;
		// 		System.out.print(anArray[i] + " ");

		// 	}
		int[][] anArray = new int[10][3];
		System.out.println("Length ? " + anArray.length);	//for row size
		System.out.println("Length ? " + anArray[0].length);	//for collumn size //ta smstinya 0 but slalu guna 0 cuz 0 always ada


	}

}