import java.util.ArrayList;

public class DemoVector{

public static void main(String args[]) {

ArrayList<String> fruits = new ArrayList<String>(); //bole tukar array list or vector(sama je)

fruits.add("rambutan");		//add
fruits.add("jackfruit"); 
fruits.add("mangoesteen");

System.out.println(fruits);

// fruits.remove("jackfruit"); 	//remove
fruits.add("mango");

System.out.println(fruits);
System.out.println("mangoesteen is exist? " + 
	fruits.contains("durian"));


fruits.set(2, "pulasan");		//set
fruits.add(2, "durian");
System.out.println(fruits);		//print
System.out.println("Size: " + fruits.size());


	}
}