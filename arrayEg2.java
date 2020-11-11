public class arrayEg2 
{ 
	public static void main ( String[] args)
 	{ 

 		int[] valA= { 12, 23, 45, 56 };
 		 int[] valB; //= new int[4]; 

 		 valB = valA; //smua array A msukkan dlm array B

 		 // valB[ 0 ] = valA[ 0 ] ; 
 		 // valB[ 1 ] = valA[ 1 ] ;
 		 // valB[ 2 ] = valA[ 2 ] ; 
 		 // valB[ 3 ] = valA[ 3 ] ; 

 		 for (int i = 0; i<valB.length; i++)
 		 	System.out.println("Indek " + i + " " + valB[i]);

 		 System.out.println("Size array is " + valB.length);

 		//size array 10
 		// int[] data = {23, 38, 14, -3, 0, 14, 9, 103, 0, -56, 88 }; //index 0 till 9

 		// System.out.println("Size array is " + data.length);

 		// System.out.println("Elemen indeks ke 10 ialah " + data[10]);

		 // // double[] val= new double[4]; //an array of double
		 // val[0] = 0.12; 
		 // val[1] = 1.43; 
		 // val[2] = 2.98;

		 // int j = 3;
		 // System.out.println( val[ j ] ); //val[3] = 0.0
		 // System.out.println( val[ j-1 ] ); //val[3-1] = val[2] = 2.98

		 // j = j-2; //j = 3-2=1
		 // System.out.println( val[ j ] ); //val[1] = 1.43

  	}
 }