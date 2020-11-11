class ArrayDemo1{

public static void passByReference(String a[]){
	a[0] ="Changed";
}

public static String passByValue(String a){
	return a ="Changed again";
}

public static String [] getArray(){
	String a[] = {"Satu","dua","tiga","empat"};
	return a; 
}

public static void main(String args[]){

	// String []b={"Apple","Mango","Orange"};
	// // System.out.println("Before Function Call"+b[0]);
	// // for (String v: b)
	// // 	System.out.println(v);


	// System.out.println("The return value: " + ArrayDemo1.passByValue(b[0]));
	// //System.out.println("After Function Call " +b[0]);
	// System.out.println("The array: ");
	
	String [] b; 
	//size dtntukan oleh user input

	b= getArray();
	for (String v: b)
		System.out.println(v);

	System.out.println(b.length);
	}
}

//