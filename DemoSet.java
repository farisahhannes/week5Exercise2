import java.util.HashSet;

public class DemoSet{

public static void main(String[] args) {

HashSet<String> setFruits= new HashSet<String>();

setFruits.add("rambutan");
setFruits.add("jackfruit");
setFruits.add("mangoesteen");
setFruits.add("jackFruit");	//case sensitive

System.out.println(setFruits);

	}

}

//dia takde error 
//unique = klau ada sama dia ta print yg lgi satu
//character by character tho..